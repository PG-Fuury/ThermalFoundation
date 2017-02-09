package cofh.thermalfoundation.init;

import cofh.api.core.IInitializer;
import cofh.thermalfoundation.ThermalFoundation;
import cofh.thermalfoundation.item.*;

import java.util.ArrayList;

public class TFItems {

	private TFItems() {

	}

	public static void preInit() {

		itemWrench = new ItemWrench();
		itemMeter = new ItemMeter();
		itemTome = new ItemTome();
		itemDiagram = new ItemDiagram();
		itemFertilizer = new ItemFertilizer();
		itemMaterial = new ItemMaterial();
		itemGeode = new ItemGeode();

		initList.add(itemWrench);
		initList.add(itemMeter);
		initList.add(itemTome);
		initList.add(itemDiagram);
		initList.add(itemFertilizer);
		initList.add(itemMaterial);
		initList.add(itemGeode);

		ThermalFoundation.proxy.addIModelRegister(itemWrench);
		ThermalFoundation.proxy.addIModelRegister(itemMeter);
		ThermalFoundation.proxy.addIModelRegister(itemTome);
		ThermalFoundation.proxy.addIModelRegister(itemDiagram);
		ThermalFoundation.proxy.addIModelRegister(itemFertilizer);
		ThermalFoundation.proxy.addIModelRegister(itemMaterial);
		ThermalFoundation.proxy.addIModelRegister(itemGeode);

		for (IInitializer init : initList) {
			init.preInit();
		}
	}

	public static void initialize() {

		for (IInitializer init : initList) {
			init.initialize();
		}
	}

	public static void postInit() {

		for (IInitializer init : initList) {
			init.postInit();
		}
		initList.clear();
	}

	private static ArrayList<IInitializer> initList = new ArrayList<IInitializer>();

	/* REFERENCES */
	public static ItemWrench itemWrench;
	public static ItemMeter itemMeter;
	public static ItemTome itemTome;
	public static ItemDiagram itemDiagram;
	public static ItemFertilizer itemFertilizer;
	public static ItemMaterial itemMaterial;
	public static ItemGeode itemGeode;

}
