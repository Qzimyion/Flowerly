package qzimyion.flowerly;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import qzimyion.flowerly.blocks.ModBlocks;

public class ModClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {

		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_WHEAT, RenderLayer.getCutout());
	}
}