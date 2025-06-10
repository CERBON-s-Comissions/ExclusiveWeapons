package com.cerbon.exclusive_weapons.item;

import com.cerbon.exclusive_weapons.ExclusiveWeapons;
import com.cerbon.exclusive_weapons.registry.RegistryEntry;
import com.cerbon.exclusive_weapons.registry.item.ItemRegistry;
import com.cerbon.exclusive_weapons.registry.item.ToolType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.TieredItem;

import java.util.Map;

public class EWItems {
    public static final ItemRegistry ITEMS = new ItemRegistry(ExclusiveWeapons.MOD_ID);

    public static final float STAT_BOOST = 1.25F;

    // ========== SUPER IRON ==========
    public static final Map<ArmorItem.Type, RegistryEntry<ArmorItem>> SUPER_IRON_ARMOR = ITEMS.registerFullArmorSet(
            () -> BuiltInRegistries.ARMOR_MATERIAL.wrapAsHolder(EWArmorMaterials.SUPER_IRON.get()),
            (int) (15 * STAT_BOOST),
            "super_iron"
    );

    public static final RegistryEntry<TieredItem> SUPER_IRON_SWORD = ITEMS.registerSimpleTool(
            ToolType.SWORD,
            EWTiers.SUPER_IRON,
            3.0F * STAT_BOOST,
            -2.4F,
            "super_iron_sword"
    );

    public static final RegistryEntry<TieredItem> SUPER_IRON_PICKAXE = ITEMS.registerSimpleTool(
            ToolType.PICKAXE,
            EWTiers.SUPER_IRON,
            STAT_BOOST,
            -2.8F,
            "super_iron_pickaxe"
    );

    public static final RegistryEntry<TieredItem> SUPER_IRON_AXE = ITEMS.registerSimpleTool(
            ToolType.AXE,
            EWTiers.SUPER_IRON,
            6.0F * STAT_BOOST,
            -3.1F,
            "super_iron_axe"
    );

    public static final RegistryEntry<TieredItem> SUPER_IRON_SHOVEL = ITEMS.registerSimpleTool(
            ToolType.SHOVEL,
            EWTiers.SUPER_IRON,
            1.5F * STAT_BOOST,
            -3.0F,
            "super_iron_shovel"
    );

    public static final RegistryEntry<TieredItem> SUPER_IRON_HOE = ITEMS.registerSimpleTool(
            ToolType.HOE,
            EWTiers.SUPER_IRON,
            -2.0F * STAT_BOOST,
            -1.0F,
            "super_iron_hoe"
    );

    public static void register() {
        ITEMS.register();
    }
}
