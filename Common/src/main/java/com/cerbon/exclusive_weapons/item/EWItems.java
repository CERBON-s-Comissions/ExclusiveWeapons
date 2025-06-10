package com.cerbon.exclusive_weapons.item;

import com.cerbon.exclusive_weapons.ExclusiveWeapons;
import com.cerbon.exclusive_weapons.registry.RegistryEntry;
import com.cerbon.exclusive_weapons.registry.item.ItemRegistry;
import com.cerbon.exclusive_weapons.registry.item.ToolType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.util.Mth;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.TieredItem;

import java.util.Map;

public class EWItems {
    public static final ItemRegistry ITEMS = new ItemRegistry(ExclusiveWeapons.MOD_ID);

    public static final float STAT_BOOST = 1.25F;

    public static float addBoost(Number base) {
        if (base instanceof Integer integer)
            return Mth.ceil(integer * STAT_BOOST);

        else if (base instanceof Float float_)
            return float_ * STAT_BOOST;

        throw new RuntimeException();
    }

    // ========== SUPER IRON ==========
    public static final Map<ArmorItem.Type, RegistryEntry<ArmorItem>> SUPER_IRON_ARMOR = ITEMS.registerFullArmorSet(
            () -> BuiltInRegistries.ARMOR_MATERIAL.wrapAsHolder(EWArmorMaterials.SUPER_IRON.get()),
            (int) addBoost(15),
            "super_iron"
    );

    public static final RegistryEntry<TieredItem> SUPER_IRON_SWORD = ITEMS.registerSimpleTool(
            ToolType.SWORD,
            EWTiers.SUPER_IRON,
            addBoost(3.0F),
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
            addBoost(6.0F),
            -3.1F,
            "super_iron_axe"
    );

    public static final RegistryEntry<TieredItem> SUPER_IRON_SHOVEL = ITEMS.registerSimpleTool(
            ToolType.SHOVEL,
            EWTiers.SUPER_IRON,
            addBoost(1.5F),
            -3.0F,
            "super_iron_shovel"
    );

    public static final RegistryEntry<TieredItem> SUPER_IRON_HOE = ITEMS.registerSimpleTool(
            ToolType.HOE,
            EWTiers.SUPER_IRON,
            addBoost(-2.0F),
            -1.0F,
            "super_iron_hoe"
    );

    // ========== SUPER GOLD ==========
    public static final Map<ArmorItem.Type, RegistryEntry<ArmorItem>> SUPER_GOLD_ARMOR = ITEMS.registerFullArmorSet(
            () -> BuiltInRegistries.ARMOR_MATERIAL.wrapAsHolder(EWArmorMaterials.SUPER_GOLD.get()),
            (int) addBoost(7),
            "super_gold"
    );

    public static final RegistryEntry<TieredItem> SUPER_GOLD_SWORD = ITEMS.registerSimpleTool(
            ToolType.SWORD,
            EWTiers.SUPER_GOLD,
            addBoost(3.0F),
            -2.4F,
            "super_gold_sword"
    );

    public static final RegistryEntry<TieredItem> SUPER_GOLD_PICKAXE = ITEMS.registerSimpleTool(
            ToolType.PICKAXE,
            EWTiers.SUPER_GOLD,
            STAT_BOOST,
            -2.8F,
            "super_gold_pickaxe"
    );

    public static final RegistryEntry<TieredItem> SUPER_GOLD_AXE = ITEMS.registerSimpleTool(
            ToolType.AXE,
            EWTiers.SUPER_GOLD,
            addBoost(6.0F),
            -3.0F,
            "super_gold_axe"
    );

    public static final RegistryEntry<TieredItem> SUPER_GOLD_SHOVEL = ITEMS.registerSimpleTool(
            ToolType.SHOVEL,
            EWTiers.SUPER_GOLD,
            addBoost(1.5F),
            -3.0F,
            "super_gold_shovel"
    );

    public static final RegistryEntry<TieredItem> SUPER_GOLD_HOE = ITEMS.registerSimpleTool(
            ToolType.HOE,
            EWTiers.SUPER_GOLD,
            addBoost(0),
            -3.0F,
            "super_gold_hoe"
    );

    // ========== SUPER DIAMOND ==========
    public static final Map<ArmorItem.Type, RegistryEntry<ArmorItem>> SUPER_DIAMOND_ARMOR = ITEMS.registerFullArmorSet(
            () -> BuiltInRegistries.ARMOR_MATERIAL.wrapAsHolder(EWArmorMaterials.SUPER_DIAMOND.get()),
            (int) addBoost(33),
            "super_diamond"
    );

    public static final RegistryEntry<TieredItem> SUPER_DIAMOND_SWORD = ITEMS.registerSimpleTool(
            ToolType.SWORD,
            EWTiers.SUPER_DIAMOND,
            addBoost(3.0F),
            -2.4F,
            "super_diamond_sword"
    );

    public static final RegistryEntry<TieredItem> SUPER_DIAMOND_PICKAXE = ITEMS.registerSimpleTool(
            ToolType.PICKAXE,
            EWTiers.SUPER_DIAMOND,
            STAT_BOOST,
            -2.8F,
            "super_diamond_pickaxe"
    );

    public static final RegistryEntry<TieredItem> SUPER_DIAMOND_AXE = ITEMS.registerSimpleTool(
            ToolType.AXE,
            EWTiers.SUPER_DIAMOND,
            addBoost(5.0F),
            -3.0F,
            "super_diamond_axe"
    );

    public static final RegistryEntry<TieredItem> SUPER_DIAMOND_SHOVEL = ITEMS.registerSimpleTool(
            ToolType.SHOVEL,
            EWTiers.SUPER_DIAMOND,
            addBoost(1.5F),
            -3.0F,
            "super_diamond_shovel"
    );

    public static final RegistryEntry<TieredItem> SUPER_DIAMOND_HOE = ITEMS.registerSimpleTool(
            ToolType.HOE,
            EWTiers.SUPER_DIAMOND,
            addBoost(-3.0F),
            0.0F,
            "super_diamond_hoe"
    );

    // ========== SUPER NETHERITE ==========
    public static final Map<ArmorItem.Type, RegistryEntry<ArmorItem>> SUPER_NETHERITE_ARMOR = ITEMS.registerFullArmorSet(
            () -> BuiltInRegistries.ARMOR_MATERIAL.wrapAsHolder(EWArmorMaterials.SUPER_NETHERITE.get()),
            (int) addBoost(37),
            "super_netherite"
    );

    public static final RegistryEntry<TieredItem> SUPER_NETHERITE_SWORD = ITEMS.registerSimpleTool(
            ToolType.SWORD,
            EWTiers.SUPER_NETHERITE,
            addBoost(3.0F),
            -2.4F,
            "super_netherite_sword"
    );

    public static final RegistryEntry<TieredItem> SUPER_NETHERITE_PICKAXE = ITEMS.registerSimpleTool(
            ToolType.PICKAXE,
            EWTiers.SUPER_NETHERITE,
            STAT_BOOST,
            -2.8F,
            "super_netherite_pickaxe"
    );

    public static final RegistryEntry<TieredItem> SUPER_NETHERITE_AXE = ITEMS.registerSimpleTool(
            ToolType.AXE,
            EWTiers.SUPER_NETHERITE,
            addBoost(5.0F),
            -3.0F,
            "super_netherite_axe"
    );

    public static final RegistryEntry<TieredItem> SUPER_NETHERITE_SHOVEL = ITEMS.registerSimpleTool(
            ToolType.SHOVEL,
            EWTiers.SUPER_NETHERITE,
            addBoost(1.5F),
            -3.0F,
            "super_netherite_shovel"
    );

    public static final RegistryEntry<TieredItem> SUPER_NETHERITE_HOE = ITEMS.registerSimpleTool(
            ToolType.HOE,
            EWTiers.SUPER_NETHERITE,
            addBoost(-4.0F),
            0.0F,
            "super_netherite_hoe"
    );

    public static void register() {
        ITEMS.register();
    }
}
