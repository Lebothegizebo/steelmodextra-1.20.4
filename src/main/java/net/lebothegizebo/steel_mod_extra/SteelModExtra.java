package net.lebothegizebo.steel_mod_extra;

import net.fabricmc.api.ModInitializer;

import net.lebothegizebo.steel_mod_extra.item.ModItemGroups;
import net.lebothegizebo.steel_mod_extra.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SteelModExtra implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
    public static String MOD_ID = "steel_mod_extra";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
	}
}