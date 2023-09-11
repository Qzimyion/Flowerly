package qzimyion.flowerly;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import qzimyion.flowerly.datagen.BlockTagGenerator;
import qzimyion.flowerly.datagen.LootTableGenerator;
import qzimyion.flowerly.datagen.ModelGenerator;
import qzimyion.flowerly.datagen.en_us_LangGenerator;

public class ModDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {

		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		pack.addProvider(BlockTagGenerator::new);
		pack.addProvider(en_us_LangGenerator::new);
		pack.addProvider(LootTableGenerator::new);
		pack.addProvider(ModelGenerator::new);
	}
}
