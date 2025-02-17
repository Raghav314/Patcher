## Feature List

<details>
  <summary>Bug Fixes</summary>
  
# Bug Fixes
- **Keep Shaders on Perspective change** - Resolve Vanilla shaders being cleared when changing perspective. *default
- **Parallax Fix** - Resolve the camera being too far back, seemingly making your eyes be in the back of your head. (Currently makes the F3 crosshair disappear.) **[MC-1846](https://bugs.mojang.com/browse/MC-1846)**.
- **Culling Fix** - Resolve false negatives in frustum culling, creating invisible chunks in some cases. (Can negatively impact performance.) **[MC-63020](https://bugs.mojang.com/browse/MC-63020)** & **[MC-70850](https://bugs.mojang.com/browse/MC-70850)**
- **Layers In Tab** - Resolves players sometimes not having a hat layer in Tab. *default
- **Player Void Rendering** - Resolve the black box around the player while in the void. *default
- **Alex Arm Position** - Resolve Alex-model arms being shifted down further than Steve-model arms. *default
- **Resource Exploit Fix** - Resolve an exploit in 1.8 allowing servers to look through directories. *default
</details>
<details>
  <summary>Experimental</summary>

# Experimental
- **HUD Caching** - Reuse frames from the HUD instead of constantly recreating it every frame, as most HUD elements will stay the same for a long amount of time. (This may cause stuff with animations to feel "choppy".)

</details>
<details>
  <summary>Miscellaneous</summary>

# Miscellaneous
- **Remove Ground Foliage** - Stop plants/flower from rendering.
- **1.12 Farm Selection Boxes** - Replace the selection box for crops with the 1.12 variant. (Only works on Hypixel & Singleplayer) *default
- **FOV Modifier** - Allow for modifying FOV change states.
- **Sprinting FOV** - Modify your FOV when sprinting.
- **Bow FOV** - Modify your FOV when pulling back a bow.
- **Speed FOV** - Modify your FOV when having the speed effect.
- **Slowness FOV** - Modify Your FOV when having the slowness effect.
- **Better Keybind Handling** - Makes keys re-register when closing a GUI, like in 1.12+. (Does not work on macOS due to LWJGL issues) *default
- **Disable Hotbar Scrolling** - Remove the ability to scroll through your hotbar.
- **Crosshair Perspective** - Remove the crosshair when in third person.
- **Unfocused Sounds** - Change the volume of sounds when you're not tabbed into the window.
- **Unfocused FPS** - Toggle changing your FPS to whatever Unfocused FPS is set to when not tabbed into the window.**
- **Unfocused FPS Amount** - Change the maximum FPS when you're not tabbed into the window, saving resources.
- **Log Optimizer** - Delete all files in the logs folder, as these can usually take up a lot of space. (These files are not recoverable once deleted)
- **Log Optimizer Amount** - Choose how many days old a file must be before being deleted.
- **Better Camera** - Stop tall grass, plants, reeds, etc. from affecting your FOV as done in 1.14+. *default
- **Better F1** - Hide nametags when in F1 mode. *default
- **Remove Screen Bobbing** - While using View Bobbing, only remove the view aspect but have the hand still bounce around.
- **Remove Map Bobbing** - While using View Bobbing, remove the hand bobbing when holding a map.
- **Static Items** - Stop items from bobbing up and down when dropped on the ground.
- **Modify Every Sound** - Open a separate GUI allowing you to mute or amplify individual sounds.
- **Zoom Adjustment** - Scroll when using OptiFine's zoom to adjust the zoom level. *default
- **Remove Smooth Camera While Zoomed** - Remove the smooth camera effect when using zoom.
- **Render Hand While Zoomed** - Keep your hand on screen when you zoom in.
- **Zoom Sensitivity** - Use a custom mouse sensitivity value when zoomed in. This is a percentage of your normal sensitivity.
- **Smooth Zoom Animation** - Add a smooth animation when you zoom in and out.
- **Smooth Scroll-to-Zoom Animation** - Add a smooth animation when you scroll in and out while zoomed.
- **Smooth Zoom Function** - Change the smoothing function used in the smooth zooming animation.
- **Toggle to Zoom** - Make OptiFine's zoom key a toggle instead of requiring you to hold it.
- **Simplify FPS Counter** - Remove the additions OptiFine L5 and above makes to the debug screen fps counter. *default
- **Use Vanilla Metrics Renderer** - Replace Optifine's ALT+F3 metrics renderer with the Vanilla renderer. *default
- **Nausea Effect** - Remove the nether portal effect appearing when clearing nausea.
- **Disable Achievements** - Remove achievement notification.
- **Fire Overlay Height** - Change the height of the fire overlay.
- **Remove Inverted Colors from Crosshair** - Remove the inverted color effect on the crosshair.
- **Fullbright** - Remove lighting updates, increasing visibility. (Can positively impact performance. May conflict with minimaps) *default
- **Smart Fullbright** - Automatically Disable the Fullbright Effect when using OptiFine Shaders. (Requires Fullbright) *default
- **Show Own Nametag** - See your own nametag in third person.
- **Clean Projectiles** - Show projectiles 2 ticks after they're shot up to stop them from obstructing your view.
- **Ridden Horse Opacity** - Change the opacity of the horse you're currently riding for visibility.
- **Numerical Enchantments** - Use readable numbers instead of Roman numerals on enchants. *default
- **Clean View** - Stop rendering your own potion effect particles.
- **Disable Breaking Particles** - Remove block breaking particles for visibility.
- **Alternate Text Shadow** - Change the text shadow to only move down rather than moving to the side.
- **Add Text Shadow to Nametags** - Render nametag with shadowed text.
- **Add Text Shadow to Actionbar** - Render actionbar messages with shadowed text.
- **Disable Text shadow** - Remove shadows from text. (Can positively impact performance).
- **Toggle Tab** - Hold tab open without needing to hold down the tab key.
- **Number Ping** - Show a readable ping number in tab instead of bars.

</details>
<details>
  <summary>Performance</summary>

# Performance
- **Entity Culling** - Stop entities that aren't visible to the player from rendering. *default
- **Entity Culling Interval** - The amount of time in ms between occlusion checks for entities. Shorter periods are more costly toward performance but provide the most accurate information. Lower values recommended in competitive environments.
- **Smart Entity Culling** - Stop entity culling effect when using OptiFine shaders. (Due to the way OptiFine shaders work, we are unable to make Entity Culling compatible at this time). *default
- **Don't Cull Player Nametags** - Render nametags even when the player and nametag are occluded.
- **Don't Cull Entity Nametags** - Render nametags even when the entity and nametag are occluded.
- **Don't Cull Armorstand Nametags** - Render nametags even when the armour stand is occluded.
- **Check Armorstand Rules** - Don't cull armorstands that have a marker set in their entity rules. This will result in a lot of unculled armorstands in places like Hypixel Skyblock, but will provide better entity visibility while losing out on some performance improvements.
- **Entity Back-face Culling** - Stop rendering sides of entities that you cannot see. Being inside an entity will cause that body part to be invisible. (Some models may have a transparent face and will cause the back face to not show, such as Wither Skeletons)
- **Player Back-face Culling** - Stop rendering sides of players that you cannot see. Being inside a player will cause that body part to be invisible.
- **Disable Armorstands** - Stop armorstands from rendering. (Armorstands are commonly used for NPC nametag rendering. Enabling this will stop those from rendering as well)
- **Disable Semitransparent Players** - Stop semitransparent players from rendering.
- **Disable Enchantment Books** - Stop enchantment table books from rendering.
- **Disable Item Frames** - Stop item frames from rendering.
- **Disable Mapped Item frames** - Stop item frames only with maps as their item from rendering.
- **Disable Grounded Arrows** - Stop arrows that are in the ground from rendering.
- **Disable Attached Arrows** - Stop arrows that are attached to a player from Rendering. 
- **Disable Skulls** - Stop skulls from rendering. 
- **Disable Nametags Boxes** - Remove the transparent box around the nametag. 
- **Unstacked Items** - Render stacks of items on the ground as just one instead of having up to 5 copies in one stack.
- **Entity Render Distance Toggle** - Toggle allowing a custom entity render distance.
- **Hostile Entity Render Distance** - Stop rendering hostile entities outside a specified radius.
- **Passive Entity Render Distance** - Stop rendering passive entities outside a specified radius.
- **Player Entity Render Distance** - Stop rendering player entities outside a specified radius.
- **Global Entity Render Distance** - Stop rendering all entities outside a specified radius. This will ignore the distance of other entity render distances if smaller.
- **Disable End Portals** - Stop end portals from rendering.
- **Disable Enchantment Glint** - Disable the enchantment glint on enchanted items/potions.
- **Static Particle Color** - Disable particle lighting checks each frame. *default
- **Max Particle Limit** - Stop additional particles from appearing when there's too many at once.
- **Downscale Pack Images** - Change all pack icons to 64x64 to reduce memory usage. *default
- **Optimized Font Renderer** - Use modern rendering techniques to improve font renderer performance. *default ([Optimization Test](https://streamable.com/0oype9))
- **Cache Font Data** - Cache font data allowing for it to be reused multiple times before needing recalculation. *default ([Optimization Test](https://streamable.com/0oype9))
- **Instant World Swapping** - Remove the dirt screen and waiting time when switching a world. *default
- **Limit Chunk Updates** - Limit the amount of chunk updates that happen a second.
- **Chunk Update Limit** - Specify the amount of updates that can happen a second.  
- **Static Fog Color** - Simplify fog color creation with a static fog color. *default
- **Low Animation Tick** - Lowers the amount of animations that happen a second from 1000 to 500. *default
- **Batch Model Rendering** - Render models in a single draw call, reducing the amount of OpenGL instructions performed a second. *default
- **Optimized Cloud Renderer** - Use modern rendering techniques to improve cloud renderer performance. *default - Alternative explanation: **[Upload cloud geometry to the GPU, resulting in much faster cloud rendering]**
- **Remove Cloud Transparency** - Remove transparency from clouds.
  
</details>
<details>
  <summary>Screens</summary>

# Screens
- **1.11 Chat Length** - Extend the amount of characters you can type from 100 to 256 on supported servers. (Supported servers are servers that support 1.11 or above. Some servers may kick you for this despite supporting 1.11 or above) *default
- **Transparent Chat** - Remove the background from chat. (Can positively impact performance).
- **Transparent Chat input field** - Remove the background from chat's input field. (Can positively impact performance).
- **Compact Chat** - Clean up chat by stacking duplicate messages (Does not work with Labymod) *default
- **Consecutive Compact Chat** - Only compact messages if they're consecutive.
- **Compact Chat time** - Change the amount of time old messages take to stop being compacted. (Measured in seconds)
- **Remove Blank Messages** - Remove blank messages from chat.
- **Shift Chat** - Holding shift while pressing enter will keep chat open.
- **Chat Delay** - Delay chat messages if they're sent within the selected timeframe after the previous message. (Measured in seconds)
- **Chat Position** - Move the chat up 12 pixels to stop it from overlapping the health bar, as done in 1.12+. *default
- **Chat Timestamps** - Add timestamps before a message.
- **Chat Timestamps Style** - Choose how Chat Timestamps should appear.
- **Chat Timestamps Format** - Change the time format of Chat Timestamps.
- **Safe Chat Clicks** - Show the command or link that is ran/opened on click. 
- **Damage Glance** - View the damage value of the currently held item above your hotbar.
- **Item Count Glance** - View the amount of the currently held item above your hotbar.
- **Enchantment Glance** - View the enchantments of the currently held item above your hotbar.
- **Protection Percentage** - View how much total armor protection you have inside of your inventory.
- **Projectile Protection Percentage** - View how much total projectile protection you have inside of your inventory.
- **Name History Style** - Choose how Name History should appear.
- **Container Backgrounds** - Remove the dark background inside of a container.
- **GUI Crosshair** - Stop rendering the crosshair when in a GUI.
- **Startup Notification** - Notify how long the game took to start. *default
- **Clean Main Menu** - Remove the Realms button on the main menu as it's useless on 1.8.9. *default
- **Replace Open to Lan** - Remove the Open to Lan button when in multiplayer server with a button to quickly open your server list. (Will be reworked in the future to not kick you from the server).
- **Replaced Mods Warning** - Display on startup what mods you may have that are replaced by Patcher. *default
- **Smart Disconnect -** Choose between disconnecting or relogging when clicking the disconnect button. (Only works on multiplayer servers)
- **Image Preview** - Preview image links when hovering over a supported URL. Press shift to use fullscreen and Control to render in native image resolution. (Currently supported: Imgur, Discord, Badlion screenshots)
- **Image Preview Width** - The % of screen width to be used for image preview.
- **Inventory Position** - Stop potion effects from shifting your inventory to the right. *default
- **Click Out of Containers** - Click outside of a container to close the menu.
- **Custom Tab Opacity** - Change the tab list opacity.
- **Tab Opacity** - Allow for customizing tab opacity.
- **Tab Height** - Move the tab overlay down n amount of pixels when there's an active bossbar.
- **Set Tab Height** - Choose how many pixels down the tab will go when there's an active bossbar
  
</details>
<details>
  <summary>Screenshots</summary>

# Screenshots
- **No Feedback** - Remove the messages from screenshots entirely.
- **Compact Response** - Compact the message given when screenshotting.
- **Favorite Screenshot** - Show a text component that allows you to delete a screenshot. *default
- **Delete Screenshot** - Show a text component that allows you to delete. *default
- **Upload Screenshot** - Show a text component that allows you to upload a screenshot to Imgur. *default
- **Copy Screenshot** - Show a text component that allows you to copy a screenshot. *default
- **Open Screenshots Folder** - Show a text component that allows you to open the screenshots folder. *default
- **Screenshot Manager** - Change the way screenshotting works as a whole, creating a whole new process to screenshotting such as uploading to imgur, copying to clipboard, etc. *default
- **Auto Copy Screenshot** - Automatically copy screenshots to the clipboard when taken.
- **Screenshot Preview** - Preview the look of your screenshot when taken in the bottom right corner.
- **Preview Time** - Adjust how long the preview should stay on screen before sliding out. time is measured in seconds.
- **Preview Animation** - Select an animation style for the screenshot preview.
- **Preview Scale** - Change the scale of the preview. smaller number is bigger.

</details>

[![crayons 🙂](https://forthebadge.com/images/badges/made-with-crayons.svg)](https://sk1er.club/mods/patcher "Click for Patcher download")
