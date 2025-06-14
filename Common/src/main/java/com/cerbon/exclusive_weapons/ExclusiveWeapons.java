package com.cerbon.exclusive_weapons;

import com.cerbon.exclusive_weapons.item.EWArmorMaterials;
import com.cerbon.exclusive_weapons.item.EWCreativeTabs;
import com.cerbon.exclusive_weapons.item.EWItems;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class ExclusiveWeapons {
	public static final String MOD_ID = "exclusive_weapons";
	public static final String MOD_NAME = "ExclusiveWeapons";

	public static final Logger LOGGER = LogUtils.getLogger();

	public static void init() {
		EWItems.register();
		EWArmorMaterials.register();
		EWCreativeTabs.register();
	}
}
