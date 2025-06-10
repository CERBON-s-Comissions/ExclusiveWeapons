package com.cerbon.exclusive_weapons.item;

import com.cerbon.exclusive_weapons.ExclusiveWeapons;
import com.cerbon.exclusive_weapons.registry.ResourcefulRegistries;
import com.cerbon.exclusive_weapons.registry.ResourcefulRegistry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.ArmorMaterial;

public class EWArmorMaterials {
    public static final ResourcefulRegistry<ArmorMaterial> AMOR_MATERIALS = ResourcefulRegistries.create(
            BuiltInRegistries.ARMOR_MATERIAL,
            ExclusiveWeapons.MOD_ID
    );

    public static void register() {
        AMOR_MATERIALS.register();
    }
}
