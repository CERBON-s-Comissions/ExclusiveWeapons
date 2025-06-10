package com.cerbon.exclusive_weapons.neoforge.event.providers;

import com.cerbon.exclusive_weapons.ExclusiveWeapons;
import com.cerbon.exclusive_weapons.item.EWItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class EWItemTagsProvider extends ItemTagsProvider {

    public EWItemTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> provider, CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, provider, blockTags, ExclusiveWeapons.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {
        EWItems.ITEMS.boundStream().forEach(item -> {
            if (item instanceof ArmorItem armorItem) {
                this.tag(ItemTags.TRIMMABLE_ARMOR).add(item);

                switch (armorItem.getType()) {
                    case HELMET -> this.tag(ItemTags.HEAD_ARMOR).add(item);
                    case CHESTPLATE -> this.tag(ItemTags.CHEST_ARMOR).add(item);
                    case LEGGINGS -> this.tag(ItemTags.LEG_ARMOR).add(item);
                    case BOOTS -> this.tag(ItemTags.FOOT_ARMOR).add(item);
                }
            }
            else if (item instanceof SwordItem)
                this.tag(ItemTags.SWORDS).add(item);

            else if (item instanceof PickaxeItem)
                this.tag(ItemTags.PICKAXES).add(item);

            else if (item instanceof AxeItem)
                this.tag(ItemTags.AXES).add(item);

            else if (item instanceof ShovelItem)
                this.tag(ItemTags.SHOVELS).add(item);

            else if (item instanceof HoeItem)
                this.tag(ItemTags.HOES).add(item);
        });
    }
}
