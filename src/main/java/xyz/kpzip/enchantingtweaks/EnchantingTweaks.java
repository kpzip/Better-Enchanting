package xyz.kpzip.enchantingtweaks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.fabricmc.api.ModInitializer;
import xyz.kpzip.enchantingtweaks.config.ConfigHandler;
import xyz.kpzip.enchantingtweaks.networking.EnchantingTweaksConfig;

public class EnchantingTweaks implements ModInitializer {
	
	public static final Logger LOGGER = LoggerFactory.getLogger("enchantingtweaks");
	
	public static final String MOD_ID = "enchantingtweaks";
	//Change mod version in fabric.mod.json and in gradle.properties
	public static final String MOD_VERSION = "1.0.0";
	private static final EnchantingTweaksConfig CONFIG = new EnchantingTweaksConfig().reloadFromFile();
	
	@Override
	public void onInitialize() {
		ConfigHandler.registerConfig(CONFIG);
	}
	
	public static EnchantingTweaksConfig getConfig() {
		return CONFIG;
	}
	
	//TODO lightning damage + damage option
	//TODO refine crossbow spread
	//TODO allow lighitning from channeling always option
	//TODO allow channeling to start lightning storm
	//TODO allow riptide always
}
