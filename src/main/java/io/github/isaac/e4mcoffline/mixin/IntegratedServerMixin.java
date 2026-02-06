package io.github.isaac.e4mcoffline.mixin;

import net.minecraft.client.server.IntegratedServer;
import net.minecraft.world.level.GameType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(IntegratedServer.class)
public class IntegratedServerMixin {

    /**
     * Inyectamos en la funcion que publica el servidor en la red local.
     * Al poner 'setUsesAuthentication(false)', desactivamos la verificación de cuentas (online-mode).
     */
    @Inject(method = "publishServer", at = @At("HEAD"))
    private void onPublishServer(GameType gameType, boolean cheats, int port, CallbackInfoReturnable<Boolean> cir) {
        IntegratedServer server = (IntegratedServer) (Object) this;
        server.setUsesAuthentication(false);
        System.out.println("[E4MC Offline] Forzando modo offline para el servidor LAN.");
    }
}
