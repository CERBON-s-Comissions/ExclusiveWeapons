package com.cerbon.exclusive_weapons.fabric;

import com.cerbon.exclusive_weapons.ExclusiveWeapons;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ModInitializer;

public class ExclusiveWeaponsFabric implements ModInitializer, ClientModInitializer {

    @Override
    public void onInitialize() {
        ExclusiveWeapons.init();
    }

    @Override
    public void onInitializeClient() {}
}