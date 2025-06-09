package com.cerbon.exclusive_weapons.registry;

import com.cerbon.exclusive_weapons.platform.Services;
import net.minecraft.core.Registry;

public class ResourcefulRegistries {

    public static <T> ResourcefulRegistry<T> create(Registry<T> registry, String id) {
        return Services.PLATFORM.create(registry, id);
    }
}
