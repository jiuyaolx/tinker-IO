package tinker_io.registry;

import net.minecraftforge.fml.common.registry.GameRegistry;
import tinker_io.items.CD_Lonesome_Avenue;
import tinker_io.items.SolidFuel;
import tinker_io.items.SpeedUPG;
import tinker_io.items.Upgrade;
import tinker_io.items.CrushedOre;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemRegistry {
	public static void mainRegistry() {
		preLoadItem();
		registerItem();
		
	}
	
	public static Item SpeedUPG;
	public static Item SolidFuel;
	public static Item Upgrade;
	public static Item Lonesome_Avenue;
	public static Item CrushedOre;

	private static void preLoadItem() {
		SpeedUPG = new SpeedUPG("speedUPG");
		SolidFuel = new SolidFuel("SolidFuel");
		Upgrade = new Upgrade("upg");
		Lonesome_Avenue= new CD_Lonesome_Avenue("Lonesome_Avenue"); //record name
		CrushedOre = new CrushedOre("Crushed_ore");
		
	}
	
	private static void registerItem() {
		GameRegistry.registerItem(SpeedUPG, "speedUPG");
		GameRegistry.registerItem(SolidFuel, "SolidFuel");
		GameRegistry.registerItem(Upgrade, "Upgrade");
		GameRegistry.registerItem(Lonesome_Avenue, "CD_Lonesome_Avenue");
		GameRegistry.registerItem(CrushedOre, "Crushed_ore");
		
		GameRegistry.registerFuelHandler(itemstack -> itemstack.isItemEqual(new ItemStack(SolidFuel))? 40000 : 0);
	}
}