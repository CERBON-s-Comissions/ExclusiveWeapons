package com.cerbon.exclusive_weapons.item;

import com.cerbon.exclusive_weapons.ExclusiveWeapons;
import net.minecraft.Util;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import org.jetbrains.annotations.NotNull;

import java.util.EnumMap;
import java.util.function.Supplier;

import static com.cerbon.exclusive_weapons.item.EWItems.addBoost;

public enum EWArmorMaterials implements StringRepresentable, ArmorMaterial {
    SUPER_IRON("super_iron", (int) addBoost(15), Util.make(new EnumMap<>(ArmorItem.Type.class), enumMap -> {
        enumMap.put(ArmorItem.Type.BOOTS, (int) addBoost(2));
        enumMap.put(ArmorItem.Type.LEGGINGS, (int) addBoost(5));
        enumMap.put(ArmorItem.Type.CHESTPLATE, (int) addBoost(6));
        enumMap.put(ArmorItem.Type.HELMET, (int) addBoost(2));
    }), (int) addBoost(9), SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> Items.IRON_INGOT),

    SUPER_GOLD("super_gold", (int) addBoost(7), Util.make(new EnumMap<>(ArmorItem.Type.class), enumMap -> {
        enumMap.put(ArmorItem.Type.BOOTS, (int) addBoost(1));
        enumMap.put(ArmorItem.Type.LEGGINGS, (int) addBoost(3));
        enumMap.put(ArmorItem.Type.CHESTPLATE, (int) addBoost(5));
        enumMap.put(ArmorItem.Type.HELMET, (int) addBoost(2));
    }), (int) addBoost(25), SoundEvents.ARMOR_EQUIP_GOLD, 0.0F, 0.0F, () -> Items.GOLD_INGOT),

    SUPER_DIAMOND("super_diamond", (int) addBoost(33), Util.make(new EnumMap<>(ArmorItem.Type.class), enumMap -> {
        enumMap.put(ArmorItem.Type.BOOTS, (int) addBoost(3));
        enumMap.put(ArmorItem.Type.LEGGINGS, (int) addBoost(6));
        enumMap.put(ArmorItem.Type.CHESTPLATE, (int) addBoost(8));
        enumMap.put(ArmorItem.Type.HELMET, (int) addBoost(3));
    }), (int) addBoost(10), SoundEvents.ARMOR_EQUIP_DIAMOND, addBoost(2.0F), 0.0F, () -> Items.DIAMOND),

    SUPER_NETHERITE("super_netherite", (int) addBoost(37), Util.make(new EnumMap<>(ArmorItem.Type.class), enumMap -> {
        enumMap.put(ArmorItem.Type.BOOTS, (int) addBoost(3));
        enumMap.put(ArmorItem.Type.LEGGINGS, (int) addBoost(6));
        enumMap.put(ArmorItem.Type.CHESTPLATE, (int) addBoost(8));
        enumMap.put(ArmorItem.Type.HELMET, (int) addBoost(3));
    }), (int) addBoost(15), SoundEvents.ARMOR_EQUIP_NETHERITE, addBoost(3.0F), addBoost(0.1F), () -> Items.NETHERITE_INGOT);

    private static final EnumMap<ArmorItem.Type, Integer> HEALTH_FUNCTION_FOR_TYPE = Util.make(new EnumMap<>(ArmorItem.Type.class), (enumMap) -> {
        enumMap.put(ArmorItem.Type.BOOTS, 13);
        enumMap.put(ArmorItem.Type.LEGGINGS, 15);
        enumMap.put(ArmorItem.Type.CHESTPLATE, 16);
        enumMap.put(ArmorItem.Type.HELMET, 11);
    });

    private final String name;
    private final int durabilityMultiplier;
    private final EnumMap<ArmorItem.Type, Integer> protectionFunctionForType;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyLoadedValue<Ingredient> repairIngredient;

    EWArmorMaterials(String name, int durabilityMultiplier, EnumMap<ArmorItem.Type, Integer> protectionFunctionForType, int enchantmentValue, SoundEvent sound, float toughness, float knockbackResistance, Supplier<Item> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionFunctionForType = protectionFunctionForType;
        this.enchantmentValue = enchantmentValue;
        this.sound = sound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = new LazyLoadedValue(repairIngredient);
    }

    public int getDurabilityForType(ArmorItem.Type type) {
        return HEALTH_FUNCTION_FOR_TYPE.get(type) * this.durabilityMultiplier;
    }

    public int getDefenseForType(ArmorItem.Type type) {
        return this.protectionFunctionForType.get(type);
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public @NotNull SoundEvent getEquipSound() {
        return this.sound;
    }

    public @NotNull Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    public @NotNull String getName() {
        return ExclusiveWeapons.MOD_ID + ":" + this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }

    public @NotNull String getSerializedName() {
        return this.name;
    }
}
