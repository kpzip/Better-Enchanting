package xyz.kpzip.enchantingtweaks.omegaconfig.src.main.java.draylar.omegaconfiggui.api.screen;

import com.google.common.collect.ImmutableMap;
import com.terraformersmc.modmenu.api.ConfigScreenFactory;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.screen.Screen;
import xyz.kpzip.enchantingtweaks.omegaconfig.src.main.java.draylar.omegaconfig.api.Config;
import xyz.kpzip.enchantingtweaks.omegaconfig.src.main.java.draylar.omegaconfiggui.mixin.modmenu.ModMenuAccessor;

@Environment(EnvType.CLIENT)
public class OmegaModMenu {

    public static <T extends Config> void injectScreen(T config, OmegaScreenFactory<Screen> factory) {
        // they will suspect nothing
        ModMenuAccessor.setConfigScreenFactories(
                new ImmutableMap.Builder<String, ConfigScreenFactory<?>>()
                        .putAll(ModMenuAccessor.getConfigScreenFactories())
                        .put(config.getModid(), factory::get)
                        .build());
    }
}
