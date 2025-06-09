package com.cerbon.exclusive_weapons.neoforge.platform;

import com.cerbon.exclusive_weapons.neoforge.registry.NeoForgeResourcefulRegistry;
import com.cerbon.exclusive_weapons.platform.services.IPlatformHelper;
import com.cerbon.exclusive_weapons.registry.ResourcefulRegistry;
import net.minecraft.core.Registry;

public class NeoForgePlatformHelper implements IPlatformHelper {

    @Override
    public <T> ResourcefulRegistry<T> create(Registry<T> registry, String id) {
        return new NeoForgeResourcefulRegistry<>(registry, id);
    }
}
