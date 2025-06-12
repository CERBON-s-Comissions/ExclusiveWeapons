package com.cerbon.exclusive_weapons.registry.item;

import com.cerbon.exclusive_weapons.item.custom.HoeItem;
import com.cerbon.exclusive_weapons.registry.RegistryEntry;
import com.cerbon.exclusive_weapons.registry.ResourcefulRegistries;
import com.cerbon.exclusive_weapons.registry.ResourcefulRegistry;
import com.google.common.collect.ImmutableMap;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;

import java.util.Collection;
import java.util.Map;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class ItemRegistry {
    private final ResourcefulRegistry<Item> itemRegistry;

    public ItemRegistry(String modId) {
        this.itemRegistry = ResourcefulRegistries.create(BuiltInRegistries.ITEM, modId);
    }

    public Map<ArmorItem.Type, RegistryEntry<ArmorItem>> registerFullArmorSet(ArmorMaterial material, String materialName) {
        return registerFullArmorSet(material, properties -> properties, materialName);
    }

    public Map<ArmorItem.Type, RegistryEntry<ArmorItem>> registerFullArmorSet(ArmorMaterial material, UnaryOperator<Item.Properties> itemProperties, String materialName) {
        return ImmutableMap.of(
                ArmorItem.Type.HELMET, registerArmor(ArmorItem.Type.HELMET, material, itemProperties, materialName),
                ArmorItem.Type.CHESTPLATE, registerArmor(ArmorItem.Type.CHESTPLATE, material, itemProperties, materialName),
                ArmorItem.Type.LEGGINGS, registerArmor(ArmorItem.Type.LEGGINGS, material, itemProperties, materialName),
                ArmorItem.Type.BOOTS, registerArmor(ArmorItem.Type.BOOTS, material, itemProperties, materialName)
        );
    }

    public RegistryEntry<ArmorItem> registerArmor(ArmorItem.Type armorType, ArmorMaterial material, String materialName) {
        return registerArmor(armorType, material, properties -> properties, materialName);
    }

    public RegistryEntry<ArmorItem> registerArmor(ArmorItem.Type armorType, ArmorMaterial material, UnaryOperator<Item.Properties> itemProperties, String materialName) {
        //String materialName = material.unwrapKey().map(resourceKey -> resourceKey.location().getPath()).orElseThrow();
        return registerItem(() -> new ArmorItem(material, armorType, itemProperties.apply(new Item.Properties().durability(material.getDurabilityForType(armorType)))), materialName + "_" + armorType.getName());
    }

    public RegistryEntry<TieredItem> registerSimpleTool(ToolType toolType, Tier tier, float attackDamage, float attackSpeed, String id) {
        return registerSimpleTool(toolType, tier, properties -> properties, attackDamage, attackSpeed, id);
    }

    public RegistryEntry<TieredItem> registerSimpleTool(ToolType toolType, Tier tier, UnaryOperator<Item.Properties> itemProperties, float attackDamage, float attackSpeed, String id) {
        return switch (toolType) {
            case SWORD -> registerItem(() -> new SwordItem(tier, (int) attackDamage, attackSpeed, itemProperties.apply(new Item.Properties())), id);
            case PICKAXE -> registerItem(() -> new com.cerbon.exclusive_weapons.item.custom.PickaxeItem(tier, (int) attackDamage, attackSpeed, itemProperties.apply(new Item.Properties())), id);
            case AXE -> registerItem(() -> new com.cerbon.exclusive_weapons.item.custom.AxeItem(tier, attackDamage, attackSpeed, itemProperties.apply(new Item.Properties())), id);
            case SHOVEL -> registerItem(() -> new ShovelItem(tier, attackDamage, attackSpeed, itemProperties.apply(new Item.Properties())), id);
            case HOE -> registerItem(() -> new HoeItem(tier, (int) attackDamage, attackSpeed, itemProperties.apply(new Item.Properties())), id);
        };
    }

    public RegistryEntry<Item> registerFood(FoodProperties foodProperties, String id) {
        return registerFood(foodProperties, properties -> properties, id);
    }

    public RegistryEntry<Item> registerFood(FoodProperties foodProperties, UnaryOperator<Item.Properties> itemProperties, String id) {
        return registerItem(itemProperties.apply(new Item.Properties().food(foodProperties)), id);
    }

    public RegistryEntry<BlockItem> registerBlockItem(Supplier<Block> block, String id) {
        return registerBlockItem(block, new Item.Properties(), id);
    }

    public RegistryEntry<BlockItem> registerBlockItem(Supplier<Block> block, Item.Properties itemProperties, String id) {
        return registerBlockItem(id, () -> new BlockItem(block.get(), itemProperties));
    }

    public RegistryEntry<BlockItem> registerBlockItem(String id, Supplier<BlockItem> blockItem) {
        return registerItem(blockItem, id);
    }

    public RegistryEntry<Item> registerItem(String id) {
        return registerItem(new Item.Properties(), id);
    }

    public RegistryEntry<Item> registerItem(Item.Properties itemProperties, String id) {
        return registerItem(() -> new Item(itemProperties), id);
    }

    public <T extends Item> RegistryEntry<T> registerItem(Supplier<T> item, String id) {
        return itemRegistry.register(id, item);
    }

    public Collection<RegistryEntry<Item>> getEntries() { return itemRegistry.getEntries(); }
    public Stream<RegistryEntry<Item>> stream() { return itemRegistry.stream(); }
    public Stream<Item> boundStream() { return itemRegistry.boundStream(); }

    public void register() {
        itemRegistry.register();
    }
}
