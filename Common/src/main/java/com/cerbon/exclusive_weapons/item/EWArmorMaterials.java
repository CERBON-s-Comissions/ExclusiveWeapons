package com.cerbon.exclusive_weapons.item;

import com.cerbon.exclusive_weapons.ExclusiveWeapons;
import com.cerbon.exclusive_weapons.registry.RegistryEntry;
import com.cerbon.exclusive_weapons.registry.ResourcefulRegistries;
import com.cerbon.exclusive_weapons.registry.ResourcefulRegistry;
import net.minecraft.Util;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class EWArmorMaterials {
    public static final ResourcefulRegistry<ArmorMaterial> ARMOR_MATERIALS = ResourcefulRegistries.create(
            BuiltInRegistries.ARMOR_MATERIAL,
            ExclusiveWeapons.MOD_ID
    );

    public static final RegistryEntry<ArmorMaterial> SUPER_IRON = register("super_iron", Util.make(new EnumMap<>(ArmorItem.Type.class), enumMap -> {
        enumMap.put(ArmorItem.Type.BOOTS, 2);
        enumMap.put(ArmorItem.Type.LEGGINGS, 5);
        enumMap.put(ArmorItem.Type.CHESTPLATE, 6);
        enumMap.put(ArmorItem.Type.HELMET, 2);
        enumMap.put(ArmorItem.Type.BODY, 5);
    }), (int) (9 * EWItems.STAT_BOOST), SoundEvents.ARMOR_EQUIP_IRON, 0.0F * EWItems.STAT_BOOST, 0.0F * EWItems.STAT_BOOST, () -> Items.IRON_INGOT);

    public static final RegistryEntry<ArmorMaterial> SUPER_GOLD = register("super_gold", Util.make(new EnumMap<>(ArmorItem.Type.class), enumMap -> {
        enumMap.put(ArmorItem.Type.BOOTS, 1);
        enumMap.put(ArmorItem.Type.LEGGINGS, 3);
        enumMap.put(ArmorItem.Type.CHESTPLATE, 5);
        enumMap.put(ArmorItem.Type.HELMET, 2);
        enumMap.put(ArmorItem.Type.BODY, 7);
    }), (int) (25 * EWItems.STAT_BOOST), SoundEvents.ARMOR_EQUIP_GOLD, 0.0F * EWItems.STAT_BOOST, 0.0F * EWItems.STAT_BOOST, () -> Items.GOLD_INGOT);

    public static final RegistryEntry<ArmorMaterial> SUPER_DIAMOND = register("super_diamond", Util.make(new EnumMap<>(ArmorItem.Type.class), enumMap -> {
        enumMap.put(ArmorItem.Type.BOOTS, 3);
        enumMap.put(ArmorItem.Type.LEGGINGS, 6);
        enumMap.put(ArmorItem.Type.CHESTPLATE, 8);
        enumMap.put(ArmorItem.Type.HELMET, 3);
        enumMap.put(ArmorItem.Type.BODY, 11);
    }), (int) (10 * EWItems.STAT_BOOST), SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0F * EWItems.STAT_BOOST, 0.0F * EWItems.STAT_BOOST, () -> Items.DIAMOND);

    public static final RegistryEntry<ArmorMaterial> SUPER_NETHERITE = register("super_netherite", Util.make(new EnumMap<>(ArmorItem.Type.class), enumMap -> {
        enumMap.put(ArmorItem.Type.BOOTS, 3);
        enumMap.put(ArmorItem.Type.LEGGINGS, 6);
        enumMap.put(ArmorItem.Type.CHESTPLATE, 8);
        enumMap.put(ArmorItem.Type.HELMET, 3);
        enumMap.put(ArmorItem.Type.BODY, 11);
    }), (int) (15 * EWItems.STAT_BOOST), SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F * EWItems.STAT_BOOST, 0.1F * EWItems.STAT_BOOST, () -> Items.NETHERITE_INGOT);

    private static RegistryEntry<ArmorMaterial> register(
            String name,
            EnumMap<ArmorItem.Type, Integer> typeProtection,
            int enchantability,
            Holder<SoundEvent> equipSound,
            float toughness,
            float knockbackResistance,
            Supplier<Item> ingredientItem
    ) {
        ResourceLocation location = ResourceLocation.fromNamespaceAndPath(ExclusiveWeapons.MOD_ID, name);
        Supplier<Ingredient> ingredient = () -> Ingredient.of(ingredientItem.get());
        List<ArmorMaterial.Layer> layers = List.of(new ArmorMaterial.Layer(location));

        EnumMap<ArmorItem.Type, Integer> typeMap = new EnumMap<>(ArmorItem.Type.class);

        for (ArmorItem.Type type : ArmorItem.Type.values())
            typeMap.put(type, typeProtection.get(type));

        return ARMOR_MATERIALS.register(name, () -> new ArmorMaterial(typeProtection, enchantability, equipSound, ingredient, layers, toughness, knockbackResistance));
    }

    public static void register() {
        ARMOR_MATERIALS.register();
    }
}
