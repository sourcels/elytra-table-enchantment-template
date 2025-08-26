package com.shimaper.elytratench;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ElytraTableEnchantment implements ModInitializer {
	public static final String MOD_ID = "elytra-table-enchantment";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Elytra Table Enchantment initialized!");
	}
}