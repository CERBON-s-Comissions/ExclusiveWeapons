package com.cerbon.exclusive_weapons.neoforge.event.providers;

import com.cerbon.exclusive_weapons.ExclusiveWeapons;
import com.cerbon.exclusive_weapons.item.EWItems;
import com.cerbon.super_ore_block.block.SOBBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.SmithingTransformRecipeBuilder;
import net.minecraft.data.recipes.packs.VanillaRecipeProvider;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class EWRecipeProvider extends VanillaRecipeProvider {

    public EWRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput out) {
        /* ============ SUPER IRON ========================================== */
        smithingUpgrade(out, Items.IRON_SWORD,      SOBBlocks.SUPER_IRON.get(), EWItems.SUPER_IRON_SWORD.get(),      RecipeCategory.COMBAT, "super_iron_sword");
        smithingUpgrade(out, Items.IRON_PICKAXE,    SOBBlocks.SUPER_IRON.get(), EWItems.SUPER_IRON_PICKAXE.get(),    RecipeCategory.TOOLS,  "super_iron_pickaxe");
        smithingUpgrade(out, Items.IRON_AXE,        SOBBlocks.SUPER_IRON.get(), EWItems.SUPER_IRON_AXE.get(),        RecipeCategory.TOOLS,  "super_iron_axe");
        smithingUpgrade(out, Items.IRON_SHOVEL,     SOBBlocks.SUPER_IRON.get(), EWItems.SUPER_IRON_SHOVEL.get(),     RecipeCategory.TOOLS,  "super_iron_shovel");
        smithingUpgrade(out, Items.IRON_HOE,        SOBBlocks.SUPER_IRON.get(), EWItems.SUPER_IRON_HOE.get(),        RecipeCategory.TOOLS,  "super_iron_hoe");

        smithingUpgrade(out, Items.IRON_HELMET,     SOBBlocks.SUPER_IRON.get(), EWItems.SUPER_IRON_ARMOR.get(ArmorItem.Type.HELMET).get(),       RecipeCategory.COMBAT, "super_iron_helmet");
        smithingUpgrade(out, Items.IRON_CHESTPLATE, SOBBlocks.SUPER_IRON.get(), EWItems.SUPER_IRON_ARMOR.get(ArmorItem.Type.CHESTPLATE).get(),   RecipeCategory.COMBAT, "super_iron_chestplate");
        smithingUpgrade(out, Items.IRON_LEGGINGS,   SOBBlocks.SUPER_IRON.get(), EWItems.SUPER_IRON_ARMOR.get(ArmorItem.Type.LEGGINGS).get(),     RecipeCategory.COMBAT, "super_iron_leggings");
        smithingUpgrade(out, Items.IRON_BOOTS,      SOBBlocks.SUPER_IRON.get(), EWItems.SUPER_IRON_ARMOR.get(ArmorItem.Type.BOOTS).get(),        RecipeCategory.COMBAT, "super_iron_boots");

        /* ============ SUPER GOLD ========================================== */
        smithingUpgrade(out, Items.GOLDEN_SWORD,      SOBBlocks.SUPER_GOLD.get(), EWItems.SUPER_GOLD_SWORD.get(),      RecipeCategory.COMBAT, "super_gold_sword");
        smithingUpgrade(out, Items.GOLDEN_PICKAXE,    SOBBlocks.SUPER_GOLD.get(), EWItems.SUPER_GOLD_PICKAXE.get(),    RecipeCategory.TOOLS,  "super_gold_pickaxe");
        smithingUpgrade(out, Items.GOLDEN_AXE,        SOBBlocks.SUPER_GOLD.get(), EWItems.SUPER_GOLD_AXE.get(),        RecipeCategory.TOOLS,  "super_gold_axe");
        smithingUpgrade(out, Items.GOLDEN_SHOVEL,     SOBBlocks.SUPER_GOLD.get(), EWItems.SUPER_GOLD_SHOVEL.get(),     RecipeCategory.TOOLS,  "super_gold_shovel");
        smithingUpgrade(out, Items.GOLDEN_HOE,        SOBBlocks.SUPER_GOLD.get(), EWItems.SUPER_GOLD_HOE.get(),        RecipeCategory.TOOLS,  "super_gold_hoe");

        smithingUpgrade(out, Items.GOLDEN_HELMET,     SOBBlocks.SUPER_GOLD.get(), EWItems.SUPER_GOLD_ARMOR.get(ArmorItem.Type.HELMET).get(),       RecipeCategory.COMBAT, "super_gold_helmet");
        smithingUpgrade(out, Items.GOLDEN_CHESTPLATE, SOBBlocks.SUPER_GOLD.get(), EWItems.SUPER_GOLD_ARMOR.get(ArmorItem.Type.CHESTPLATE).get(),   RecipeCategory.COMBAT, "super_gold_chestplate");
        smithingUpgrade(out, Items.GOLDEN_LEGGINGS,   SOBBlocks.SUPER_GOLD.get(), EWItems.SUPER_GOLD_ARMOR.get(ArmorItem.Type.LEGGINGS).get(),     RecipeCategory.COMBAT, "super_gold_leggings");
        smithingUpgrade(out, Items.GOLDEN_BOOTS,      SOBBlocks.SUPER_GOLD.get(), EWItems.SUPER_GOLD_ARMOR.get(ArmorItem.Type.BOOTS).get(),        RecipeCategory.COMBAT, "super_gold_boots");

        /* ============ SUPER DIAMOND ======================================= */
        smithingUpgrade(out, Items.DIAMOND_SWORD,      SOBBlocks.SUPER_DIAMOND.get(), EWItems.SUPER_DIAMOND_SWORD.get(),      RecipeCategory.COMBAT, "super_diamond_sword");
        smithingUpgrade(out, Items.DIAMOND_PICKAXE,    SOBBlocks.SUPER_DIAMOND.get(), EWItems.SUPER_DIAMOND_PICKAXE.get(),    RecipeCategory.TOOLS,  "super_diamond_pickaxe");
        smithingUpgrade(out, Items.DIAMOND_AXE,        SOBBlocks.SUPER_DIAMOND.get(), EWItems.SUPER_DIAMOND_AXE.get(),        RecipeCategory.TOOLS,  "super_diamond_axe");
        smithingUpgrade(out, Items.DIAMOND_SHOVEL,     SOBBlocks.SUPER_DIAMOND.get(), EWItems.SUPER_DIAMOND_SHOVEL.get(),     RecipeCategory.TOOLS,  "super_diamond_shovel");
        smithingUpgrade(out, Items.DIAMOND_HOE,        SOBBlocks.SUPER_DIAMOND.get(), EWItems.SUPER_DIAMOND_HOE.get(),        RecipeCategory.TOOLS,  "super_diamond_hoe");

        smithingUpgrade(out, Items.DIAMOND_HELMET,     SOBBlocks.SUPER_DIAMOND.get(), EWItems.SUPER_DIAMOND_ARMOR.get(ArmorItem.Type.HELMET).get(),       RecipeCategory.COMBAT, "super_diamond_helmet");
        smithingUpgrade(out, Items.DIAMOND_CHESTPLATE, SOBBlocks.SUPER_DIAMOND.get(), EWItems.SUPER_DIAMOND_ARMOR.get(ArmorItem.Type.CHESTPLATE).get(),   RecipeCategory.COMBAT, "super_diamond_chestplate");
        smithingUpgrade(out, Items.DIAMOND_LEGGINGS,   SOBBlocks.SUPER_DIAMOND.get(), EWItems.SUPER_DIAMOND_ARMOR.get(ArmorItem.Type.LEGGINGS).get(),     RecipeCategory.COMBAT, "super_diamond_leggings");
        smithingUpgrade(out, Items.DIAMOND_BOOTS,      SOBBlocks.SUPER_DIAMOND.get(), EWItems.SUPER_DIAMOND_ARMOR.get(ArmorItem.Type.BOOTS).get(),        RecipeCategory.COMBAT, "super_diamond_boots");

        /* ============ SUPER NETHERITE ===================================== */
        smithingUpgrade(out, Items.NETHERITE_SWORD,      SOBBlocks.SUPER_NETHERITE.get(), EWItems.SUPER_NETHERITE_SWORD.get(),      RecipeCategory.COMBAT, "super_netherite_sword");
        smithingUpgrade(out, Items.NETHERITE_PICKAXE,    SOBBlocks.SUPER_NETHERITE.get(), EWItems.SUPER_NETHERITE_PICKAXE.get(),    RecipeCategory.TOOLS,  "super_netherite_pickaxe");
        smithingUpgrade(out, Items.NETHERITE_AXE,        SOBBlocks.SUPER_NETHERITE.get(), EWItems.SUPER_NETHERITE_AXE.get(),        RecipeCategory.TOOLS,  "super_netherite_axe");
        smithingUpgrade(out, Items.NETHERITE_SHOVEL,     SOBBlocks.SUPER_NETHERITE.get(), EWItems.SUPER_NETHERITE_SHOVEL.get(),     RecipeCategory.TOOLS,  "super_netherite_shovel");
        smithingUpgrade(out, Items.NETHERITE_HOE,        SOBBlocks.SUPER_NETHERITE.get(), EWItems.SUPER_NETHERITE_HOE.get(),        RecipeCategory.TOOLS,  "super_netherite_hoe");

        smithingUpgrade(out, Items.NETHERITE_HELMET,     SOBBlocks.SUPER_NETHERITE.get(), EWItems.SUPER_NETHERITE_ARMOR.get(ArmorItem.Type.HELMET).get(),       RecipeCategory.COMBAT, "super_netherite_helmet");
        smithingUpgrade(out, Items.NETHERITE_CHESTPLATE, SOBBlocks.SUPER_NETHERITE.get(), EWItems.SUPER_NETHERITE_ARMOR.get(ArmorItem.Type.CHESTPLATE).get(),   RecipeCategory.COMBAT, "super_netherite_chestplate");
        smithingUpgrade(out, Items.NETHERITE_LEGGINGS,   SOBBlocks.SUPER_NETHERITE.get(), EWItems.SUPER_NETHERITE_ARMOR.get(ArmorItem.Type.LEGGINGS).get(),     RecipeCategory.COMBAT, "super_netherite_leggings");
        smithingUpgrade(out, Items.NETHERITE_BOOTS,      SOBBlocks.SUPER_NETHERITE.get(), EWItems.SUPER_NETHERITE_ARMOR.get(ArmorItem.Type.BOOTS).get(),        RecipeCategory.COMBAT, "super_netherite_boots");
    }

    private static void smithingUpgrade(RecipeOutput out, Item base, Block addition, Item result, RecipeCategory cat, String name) {
        SmithingTransformRecipeBuilder
                .smithing(Ingredient.EMPTY,
                        Ingredient.of(base),
                        Ingredient.of(addition),
                        cat,
                        result)
                .unlocks("has_item", has(base))
                .save(out, ExclusiveWeapons.MOD_ID + ":" + name);
    }
}
