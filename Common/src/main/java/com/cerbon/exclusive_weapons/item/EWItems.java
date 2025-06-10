package com.cerbon.exclusive_weapons.item;

import com.cerbon.exclusive_weapons.ExclusiveWeapons;
import com.cerbon.exclusive_weapons.registry.RegistryEntry;
import com.cerbon.exclusive_weapons.registry.item.ItemRegistry;
import com.cerbon.exclusive_weapons.registry.item.ToolType;
import net.minecraft.world.item.TieredItem;

public class EWItems {
    public static final ItemRegistry REGISTRY = new ItemRegistry(ExclusiveWeapons.MOD_ID);

    public static final float STAT_BOOST = 1.25F;

    // ========== SUPER IRON ==========
    public static final RegistryEntry<TieredItem> SUPER_IRON_SWORD = REGISTRY.registerSimpleTool(
            ToolType.SWORD,
            EWTiers.SUPER_IRON,
            3.0F * STAT_BOOST,
            -2.4F,
            "super_iron_sword"
    );

    public static final RegistryEntry<TieredItem> SUPER_IRON_PICKAXE = REGISTRY.registerSimpleTool(
            ToolType.PICKAXE,
            EWTiers.SUPER_IRON,
            STAT_BOOST,
            -2.8F,
            "super_iron_pickaxe"
    );

    public static final RegistryEntry<TieredItem> SUPER_IRON_AXE = REGISTRY.registerSimpleTool(
            ToolType.AXE,
            EWTiers.SUPER_IRON,
            6.0F * STAT_BOOST,
            -3.1F,
            "super_iron_axe"
    );

    public static final RegistryEntry<TieredItem> SUPER_IRON_SHOVEL = REGISTRY.registerSimpleTool(
            ToolType.SHOVEL,
            EWTiers.SUPER_IRON,
            1.5F * STAT_BOOST,
            -3.0F,
            "super_iron_shovel"
    );

    public static final RegistryEntry<TieredItem> SUPER_IRON_HOE = REGISTRY.registerSimpleTool(
            ToolType.HOE,
            EWTiers.SUPER_IRON,
            -2.0F * STAT_BOOST,
            -1.0F,
            "super_iron_hoe"
    );

    public static void register() {
        REGISTRY.register();
    }
}
