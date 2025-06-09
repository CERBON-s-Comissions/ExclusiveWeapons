package com.cerbon.exclusive_weapons.forge.platform;

import com.cerbon.exclusive_weapons.forge.registry.ForgeResourcefulRegistry;
import com.cerbon.exclusive_weapons.platform.services.IPlatformHelper;
import com.cerbon.exclusive_weapons.registry.ResourcefulRegistry;
import net.minecraft.core.Registry;

public class ForgePlatformHelper implements IPlatformHelper {

    @Override
    public <T> ResourcefulRegistry<T> create(Registry<T> registry, String id) {
        return new ForgeResourcefulRegistry<>(registry, id);
    }
}
