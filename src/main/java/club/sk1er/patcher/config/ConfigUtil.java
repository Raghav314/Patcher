/*
 * Copyright © 2020 by Sk1er LLC
 *
 * All rights reserved.
 *
 * Sk1er LLC
 * 444 S Fulton Ave
 * Mount Vernon, NY
 * sk1er.club
 */

package club.sk1er.patcher.config;

import club.sk1er.patcher.Patcher;
import club.sk1er.vigilance.data.Property;
import club.sk1er.vigilance.data.PropertyData;
import club.sk1er.vigilance.data.PropertyType;

import java.lang.annotation.Annotation;
import java.util.function.Consumer;

public class ConfigUtil {

    public static PropertyData createAndRegisterConfig(PropertyType type, String category, String subCategory, String name, String description, Object defaultValue, int min, int max, Consumer<Object> onUpdate) {
        PropertyData config = createConfig(type, category, subCategory, name, description, defaultValue, min, max, onUpdate);
        register(config);
        return config;
    }

    public static PropertyData createConfig(PropertyType type, String category, String subCategory, String name, String description, Object defaultValue, int min, int max, Consumer<Object> onUpdate) {
        Property property = createProperty(type, category, subCategory, name, description, min, max);
        PropertyData data = PropertyData.Companion.withValue(property, defaultValue, Patcher.instance.getPatcherSoundConfig());

        if (onUpdate != null) data.setCallbackConsumer(onUpdate);
        return data;
    }

    public static void register(PropertyData data) {
        Patcher.instance.getPatcherSoundConfig().registerProperty(data);
    }

    public static Property createProperty(PropertyType type, String category, String subCategory, String name, String description, int min, int max) {
        return new Property() {

            @Override
            public float minF() {
                return 0;
            }

            @Override
            public float maxF() {
                return 0;
            }

            @Override
            public int decimalPlaces() {
                return 0;
            }

            @Override
            public String placeholder() {
                return "";
            }

            @Override
            public boolean allowAlpha() {
                return false;
            }

            @Override
            public boolean hidden() {
                return false;
            }

            /**
             * Returns the annotation type of this annotation.
             *
             * @return the annotation type of this annotation
             */
            @Override
            public Class<? extends Annotation> annotationType() {
                return Property.class;
            }

            @Override
            public PropertyType type() {
                return type;
            }

            @Override
            public String subcategory() {
                return subCategory;
            }

            @Override
            public String[] options() {
                return new String[]{};
            }

            @Override
            public String name() {
                return name;
            }

            @Override
            public int min() {
                return min;
            }

            @Override
            public int max() {
                return max;
            }

            @Override
            public String description() {
                return description;
            }

            @Override
            public String category() {
                return category;
            }

            @Override
            public boolean triggerActionOnInitialization() {
                return true;
            }
        };
    }
}
