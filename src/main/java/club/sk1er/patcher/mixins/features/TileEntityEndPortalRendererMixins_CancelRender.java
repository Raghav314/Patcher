package club.sk1er.patcher.mixins.features;

import club.sk1er.patcher.config.PatcherConfig;
import net.minecraft.client.renderer.tileentity.TileEntityEndPortalRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TileEntityEndPortalRenderer.class)
public class TileEntityEndPortalRendererMixins_CancelRender {
    @Inject(method = "renderTileEntityAt(Lnet/minecraft/tileentity/TileEntityEndPortal;DDDFI)V", at = @At("HEAD"), cancellable = true)
    private void patcher$cancelRendering(CallbackInfo ci) {
        if (PatcherConfig.disableEndPortals) {
            ci.cancel();
        }
    }
}
