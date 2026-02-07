package io.github.isaac.e4mcoffline;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;
import com.mojang.logging.LogUtils;

@Mod(value = e4mcoffline.MODID, dist = Dist.CLIENT)
public class e4mcoffline {
    public static final String MODID = "e4mcoffline";
    public static final Logger LOGGER = LogUtils.getLogger();

    public e4mcoffline() {
        // Aquí no necesitas registrar nada si solo usarás Mixins
        LOGGER.info("E4MC Offline cargado: El modo offline se forzará mediante Mixins.");
    }
}