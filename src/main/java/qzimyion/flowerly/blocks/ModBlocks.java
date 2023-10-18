package qzimyion.flowerly.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.FlowerPotBlock;
import net.minecraft.block.VineBlock;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import qzimyion.flowerly.FlowerlyMod;

import static net.minecraft.block.Blocks.*;

public class ModBlocks {

    //Vanilla plant pots
    public static final Block POTTED_WHEAT = new FlowerPotBlock(WHEAT, FabricBlockSettings.copyOf(POTTED_BAMBOO).nonOpaque());
    public static final Block SNIFFER_FLOWERING_VINE = new VineBlock(FabricBlockSettings.copyOf(CAVE_VINES).nonOpaque());
    public static final Block FLOWERING_VINE_FLOWER = new VineBlock(FabricBlockSettings.copyOf(DANDELION).nonOpaque());
    public static void registerBlocks(){
        //Block registry
        Registry.register(Registries.BLOCK, new Identifier(FlowerlyMod.MOD_ID, "potted_wheat"), POTTED_WHEAT);
        Registry.register(Registries.BLOCK, new Identifier(FlowerlyMod.MOD_ID, "flowering_vine"), SNIFFER_FLOWERING_VINE);
        Registry.register(Registries.BLOCK, new Identifier(FlowerlyMod.MOD_ID, "flowering_vine_flower"), FLOWERING_VINE_FLOWER);

        FlowerlyMod.LOGGER.info("Registering Mod Blocks");
    }
}
