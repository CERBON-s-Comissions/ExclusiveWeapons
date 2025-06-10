package com.cerbon.exclusive_weapons.neoforge.event.providers;

import com.cerbon.exclusive_weapons.ExclusiveWeapons;
import com.cerbon.exclusive_weapons.item.EWItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class EWItemModelProvider extends ItemModelProvider {

    public EWItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, ExclusiveWeapons.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        EWItems.REGISTRY.boundStream().forEach(this::basicItem);
    }
}
