package com.cerbon.exclusive_weapons.platform;

import com.cerbon.exclusive_weapons.ExclusiveWeapons;
import com.cerbon.exclusive_weapons.platform.services.IPlatformHelper;

import java.util.ServiceLoader;

public class Services {
    public static final IPlatformHelper PLATFORM = load(IPlatformHelper.class);

    public static <T> T load(Class<T> clazz) {
        final T loadedService = ServiceLoader.load(clazz)
                .findFirst()
                .orElseThrow(() -> new NullPointerException("Failed to load service for " + clazz.getName()));
        ExclusiveWeapons.LOGGER.debug("Loaded {} for service {}", loadedService, clazz);
        return loadedService;
    }
}
