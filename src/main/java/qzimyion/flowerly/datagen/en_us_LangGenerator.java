package qzimyion.flowerly.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import qzimyion.flowerly.blocks.ModBlocks;

public class en_us_LangGenerator extends FabricLanguageProvider {
    public en_us_LangGenerator(FabricDataOutput dataOutput) {
        super(dataOutput, "en_us");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(ModBlocks.POTTED_WHEAT, "Potted Wheat");
    }
}
