package qzimyion.flowerly.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FlowerPotBlock;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import qzimyion.flowerly.FlowerlyMod;

public class ModBlocks {

    //Vanilla plant pots
    public static final Block POTTED_WHEAT = new FlowerPotBlock(Blocks.WHEAT, FabricBlockSettings.copyOf(Blocks.POTTED_BAMBOO).nonOpaque());

    public static void registerBlocks(){
        //Block registry
        Registry.register(Registries.BLOCK, new Identifier(FlowerlyMod.MOD_ID, "potted_wheat"), POTTED_WHEAT);

        FlowerlyMod.LOGGER.info("Registering Mod Blocks");
    }
}
