package com.cerbon.exclusive_weapons.forge.event;

import com.cerbon.exclusive_weapons.ExclusiveWeapons;
import com.cerbon.exclusive_weapons.forge.event.providers.*;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = ExclusiveWeapons.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class EWEventsForge {

    @SubscribeEvent
    public static void onGatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        //generator.addProvider(event.includeServer(), SOBLootTableProvider.create(packOutput, lookupProvider));
        EWBlockTagsProvider blockTagProvider = generator.addProvider(event.includeServer(), new EWBlockTagsProvider(packOutput, lookupProvider, existingFileHelper));
        generator.addProvider(event.includeServer(), new EWItemTagsProvider(packOutput, lookupProvider, blockTagProvider.contentsGetter(), existingFileHelper));
        generator.addProvider(event.includeServer(), new EWRecipeProvider(packOutput));

        //generator.addProvider(event.includeClient(), new SOBBlockStateProvider(packOutput, existingFileHelper));
        generator.addProvider(event.includeClient(), new EWItemModelProvider(packOutput, existingFileHelper));
        generator.addProvider(event.includeClient(), new EWLanguageProvider(packOutput));
    }
}
