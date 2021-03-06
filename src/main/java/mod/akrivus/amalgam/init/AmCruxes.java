package mod.akrivus.amalgam.init;

import java.util.Iterator;

import mod.akrivus.amalgam.gem.EntityCitrine;
import mod.akrivus.amalgam.gem.EntityEnderPearl;
import mod.akrivus.amalgam.gem.EntityNacre;
import mod.akrivus.amalgam.gem.EntityNephrite;
import mod.akrivus.amalgam.gem.EntityPyrite;
import mod.akrivus.kagic.entity.gem.EntityPearl;
import mod.akrivus.kagic.init.ModEntities;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.oredict.OreDictionary;

public class AmCruxes {
	public static void register() {
		Iterator<String> ores = AmBlocks.DICTS.keySet().iterator();
		while (ores.hasNext() && AmConfigs.addNewCruxes) {
			String ore = ores.next();
			if (AmConfigs.addEmptyCruxes) {
				if (OreDictionary.getOres(ore, true).isEmpty()) {
					OreDictionary.registerOre(ore, AmBlocks.DICTS.get(ore));
				}
			}
			else {
				OreDictionary.registerOre(ore, AmBlocks.DICTS.get(ore));
			}
		}
		if (AmConfigs.removePearlCruxes) {
			ModEntities.MINERALS.remove(EntityPearl.class);
			EntityPearl.PEARL_YIELDS.clear();
		}
		if (AmConfigs.enableCitrine) {
			ModEntities.registerOreDictValue(EntityCitrine.CITRINE_YIELDS, 0.33, "stoneDiorite");
			ModEntities.registerOreDictValue(EntityCitrine.CITRINE_YIELDS, 0.33, "stoneDioritePolished");
			ModEntities.registerOreDictValue(EntityCitrine.CITRINE_YIELDS, 0.11, "stoneLimestone");
			ModEntities.registerOreDictValue(EntityCitrine.CITRINE_YIELDS, 0.11, "stoneLimestonePolished");
			ModEntities.registerOreDictValue(EntityCitrine.CITRINE_YIELDS, 5.99, "blockQuartz");
			ModEntities.registerWithOreDictionary(EntityCitrine.CITRINE_YIELDS, "Quartz", "Citrine");
		}
		if (AmConfigs.enablePyrite) { 
			ModEntities.registerOreDictValue(EntityPyrite.PYRITE_YIELDS, 0.99, "oreQuartz");
			ModEntities.registerOreDictValue(EntityPyrite.PYRITE_YIELDS, 0.33, "stoneDiorite");
			ModEntities.registerOreDictValue(EntityPyrite.PYRITE_YIELDS, 0.66, "stoneDioritePolished");
			ModEntities.registerOreDictValue(EntityPyrite.PYRITE_YIELDS, 0.99, "oreIron");
			ModEntities.registerWithOreDictionary(EntityPyrite.PYRITE_YIELDS, "Pyrite", "Gold");
		}
		if (AmConfigs.enableEnderPearl) {
			EntityEnderPearl.ENDER_PEARL_YIELDS.put(Blocks.END_BRICKS.getDefaultState(), 2.99);
			EntityEnderPearl.ENDER_PEARL_YIELDS.put(Blocks.END_STONE.getDefaultState(), 0.99);
		}
		if (AmConfigs.enableNacre) {
			EntityNacre.NACRE_YIELDS.put(Blocks.BONE_BLOCK.getDefaultState().withProperty(BlockRotatedPillar.AXIS, EnumFacing.Axis.X), 8.99);
			EntityNacre.NACRE_YIELDS.put(Blocks.BONE_BLOCK.getDefaultState().withProperty(BlockRotatedPillar.AXIS, EnumFacing.Axis.Y), 8.99);
			EntityNacre.NACRE_YIELDS.put(Blocks.BONE_BLOCK.getDefaultState().withProperty(BlockRotatedPillar.AXIS, EnumFacing.Axis.Z), 8.99);
			EntityNacre.NACRE_YIELDS.put(Blocks.BLACK_GLAZED_TERRACOTTA.getDefaultState(), 5.99);
			EntityNacre.NACRE_YIELDS.put(Blocks.BLUE_GLAZED_TERRACOTTA.getDefaultState(), 5.99);
			EntityNacre.NACRE_YIELDS.put(Blocks.RED_GLAZED_TERRACOTTA.getDefaultState(), 5.99);
			EntityNacre.NACRE_YIELDS.put(Blocks.YELLOW_GLAZED_TERRACOTTA.getDefaultState(), 5.99);
			EntityNacre.NACRE_YIELDS.put(Blocks.GREEN_GLAZED_TERRACOTTA.getDefaultState(), 5.99);
			EntityNacre.NACRE_YIELDS.put(Blocks.LIME_GLAZED_TERRACOTTA.getDefaultState(), 5.99);
			EntityNacre.NACRE_YIELDS.put(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA.getDefaultState(), 5.99);
			EntityNacre.NACRE_YIELDS.put(Blocks.WHITE_GLAZED_TERRACOTTA.getDefaultState(), 5.99);
			EntityNacre.NACRE_YIELDS.put(Blocks.ORANGE_GLAZED_TERRACOTTA.getDefaultState(), 5.99);
			EntityNacre.NACRE_YIELDS.put(Blocks.BROWN_GLAZED_TERRACOTTA.getDefaultState(), 5.99);
			EntityNacre.NACRE_YIELDS.put(Blocks.GRAY_GLAZED_TERRACOTTA.getDefaultState(), 5.99);
			EntityNacre.NACRE_YIELDS.put(Blocks.SILVER_GLAZED_TERRACOTTA.getDefaultState(), 5.99);
			EntityNacre.NACRE_YIELDS.put(Blocks.CYAN_GLAZED_TERRACOTTA.getDefaultState(), 5.99);
			EntityNacre.NACRE_YIELDS.put(Blocks.MAGENTA_GLAZED_TERRACOTTA.getDefaultState(), 5.99);
			EntityNacre.NACRE_YIELDS.put(Blocks.PINK_GLAZED_TERRACOTTA.getDefaultState(), 5.99);
			EntityNacre.NACRE_YIELDS.put(Blocks.PURPLE_GLAZED_TERRACOTTA.getDefaultState(), 5.99);
			EntityNacre.NACRE_YIELDS.put(Blocks.WATER.getDefaultState(), 0.99);
			EntityNacre.NACRE_YIELDS.put(Blocks.GRAVEL.getDefaultState(), 0.01);
			EntityNacre.NACRE_YIELDS.put(Blocks.CLAY.getDefaultState(), 0.55);
			EntityNacre.NACRE_YIELDS.put(Blocks.LOG.getDefaultState(), 1.99);
			EntityNacre.NACRE_YIELDS.put(Blocks.LOG2.getDefaultState(), 1.99);
			ModEntities.registerOreDictValue(EntityNacre.NACRE_YIELDS, 0.99, "stoneLimestone");
			ModEntities.registerOreDictValue(EntityNacre.NACRE_YIELDS, 1.99, "stoneLimestonePolished");
			ModEntities.registerOreDictValue(EntityNacre.NACRE_YIELDS, 2.99, "blockPrismarine");
			ModEntities.registerWithOreDictionary(EntityNacre.NACRE_YIELDS, "Calcite", "Aragonite");
		}
		if (AmConfigs.enableNephrite) {
			EntityNephrite.NEPHRITE_YIELDS.put(Blocks.BEDROCK.getDefaultState(), 2.99);
			EntityNephrite.NEPHRITE_YIELDS.put(Blocks.GRASS.getDefaultState(), 0.01);
			ModEntities.registerOreDictValue(EntityNephrite.NEPHRITE_YIELDS, 0.11, "stoneDiorite");
			ModEntities.registerOreDictValue(EntityNephrite.NEPHRITE_YIELDS, 0.22, "stoneDioritePolished");
			ModEntities.registerWithOreDictionary(EntityNephrite.NEPHRITE_YIELDS, "Nephrite", "Jade");
		}
	}
}
