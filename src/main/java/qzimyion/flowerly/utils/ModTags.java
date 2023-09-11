package qzimyion.flowerly.utils;

import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import qzimyion.flowerly.FlowerlyMod;

public class ModTags {

    public static class Blocks {


        private static TagKey <Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(FlowerlyMod.MOD_ID, name));
        }
    }
}
