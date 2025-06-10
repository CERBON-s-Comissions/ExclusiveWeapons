package com.cerbon.exclusive_weapons.item;

import com.cerbon.exclusive_weapons.ExclusiveWeapons;
import com.cerbon.exclusive_weapons.registry.RegistryEntry;
import com.cerbon.exclusive_weapons.registry.ResourcefulRegistries;
import com.cerbon.exclusive_weapons.registry.ResourcefulRegistry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class EWCreativeTabs {
    public static final ResourcefulRegistry<CreativeModeTab> CREATIVE_TABS = ResourcefulRegistries.create(
            BuiltInRegistries.CREATIVE_MODE_TAB,
            ExclusiveWeapons.MOD_ID
    );

    public static final RegistryEntry<CreativeModeTab> EW_TAB = CREATIVE_TABS.register(
            "ew_creative_tab",
            () -> CreativeModeTab.builder(CreativeModeTab.Row.TOP, 6)
                    .title(Component.translatable("itemGroup.exclusive_weapons.ew_creative_tab"))
                    .icon(() -> new ItemStack(EWItems.SUPER_IRON_PICKAXE.get()))
                    .displayItems((itemDisplayParameters, output) -> EWItems.ITEMS.boundStream().forEach(output::accept))
                    .build()
    );

    public static void register() {
        CREATIVE_TABS.register();
    }
}
