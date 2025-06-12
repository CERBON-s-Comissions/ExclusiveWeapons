package com.cerbon.exclusive_weapons.item;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

import static com.cerbon.exclusive_weapons.item.EWItems.addBoost;

public enum EWTiers implements Tier {
    SUPER_IRON(2, 250, 6.0F , 2.0F , 14, () -> Ingredient.of(Items.IRON_INGOT)),
    SUPER_DIAMOND(3, 1561, 8.0F , 3.0F , 10, () -> Ingredient.of(Items.DIAMOND)),
    SUPER_GOLD(0, 32, 12.0F , 0.0F , 22, () -> Ingredient.of(Items.GOLD_INGOT)),
    SUPER_NETHERITE(4, 2031, 9.0F , 4.0F , 15, () -> Ingredient.of(Items.NETHERITE_INGOT));

    private final int level;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final Supplier<Ingredient> repairIngredient;

    EWTiers(int level, int uses, float speed, float damage, int enchantmentValue, Supplier<Ingredient> repairIngredient) {
        this.level = level;
        this.uses = (int) addBoost(uses);
        this.speed = addBoost(speed);
        this.damage = addBoost(damage);
        this.enchantmentValue = (int) addBoost(enchantmentValue);
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getUses() {
        return this.uses;
    }

    @Override
    public float getSpeed() {
        return this.speed;
    }

    @Override
    public float getAttackDamageBonus() {
        return this.damage;
    }

    @Override
    public int getLevel() {
        return this.level;
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    @Override
    public @NotNull Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
