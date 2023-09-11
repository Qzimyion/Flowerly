package qzimyion.flowerly;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import qzimyion.flowerly.blocks.ModBlocks;

public class FlowerlyMod implements ModInitializer {

	public static final String MOD_ID = "flowerly";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModBlocks.registerBlocks();
	}
}