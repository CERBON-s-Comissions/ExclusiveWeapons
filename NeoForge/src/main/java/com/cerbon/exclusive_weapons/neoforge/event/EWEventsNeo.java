package com.cerbon.exclusive_weapons.neoforge.event;

import com.cerbon.exclusive_weapons.ExclusiveWeapons;
import com.cerbon.exclusive_weapons.neoforge.event.providers.EWItemModelProvider;
import com.cerbon.exclusive_weapons.neoforge.event.providers.EWLanguageProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = ExclusiveWeapons.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class EWEventsNeo {

    @SubscribeEvent
    public static void onGatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        //generator.addProvider(event.includeServer(), SOBLootTableProvider.create(packOutput, lookupProvider));
        //SOBBlockTagProvider blockTagProvider = generator.addProvider(event.includeServer(), new SOBBlockTagProvider(packOutput, lookupProvider, existingFileHelper));
        //generator.addProvider(event.includeServer(), new SOBItemTagProvider(packOutput, lookupProvider, blockTagProvider.contentsGetter(), existingFileHelper));
        //generator.addProvider(event.includeServer(), new SOBRecipeProvider(packOutput, lookupProvider));

        //generator.addProvider(event.includeClient(), new SOBBlockStateProvider(packOutput, existingFileHelper));
        generator.addProvider(event.includeClient(), new EWItemModelProvider(packOutput, existingFileHelper));
        generator.addProvider(event.includeClient(), new EWLanguageProvider(packOutput));
    }
}
