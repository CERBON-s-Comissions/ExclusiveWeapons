package com.cerbon.exclusive_weapons.forge.event.providers;

import com.cerbon.exclusive_weapons.ExclusiveWeapons;
import com.cerbon.exclusive_weapons.item.EWItems;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.data.LanguageProvider;

import java.util.Arrays;
import java.util.stream.Collectors;

public class EWLanguageProvider extends LanguageProvider {

    public EWLanguageProvider(PackOutput output) {
        super(output, ExclusiveWeapons.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        EWItems.ITEMS.boundStream().forEach(this::addTranslation);

        add("itemGroup.exclusive_weapons.ew_creative_tab", "Exclusive Weapons");
    }

    private void addTranslation(Item item) {
        String path = BuiltInRegistries.ITEM.getKey(item).getPath();

        String translation = Arrays.stream(path.split("_"))
                .map(word -> Character.toUpperCase(word.charAt(0)) + word.substring(1))
                .collect(Collectors.joining(" "));

        add(item, translation);
    }
}
