package io.github.isaac.e4mcoffline;

import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;
import com.mojang.logging.LogUtils;

@Mod(e4mcoffline.MODID)
public class e4mcoffline {
    public static final String MODID = "e4mcoffline";
    public static final Logger LOGGER = LogUtils.getLogger();

    public e4mcoffline() {
        // Aquí no necesitas registrar nada si solo usarás Mixins
        LOGGER.info("E4MC Offline cargado: El modo offline se forzará mediante Mixins.");
    }
}