package com.cerbon.exclusive_weapons.platform.services;

import com.cerbon.exclusive_weapons.registry.ResourcefulRegistry;
import net.minecraft.core.Registry;

public interface IPlatformHelper {

    <T> ResourcefulRegistry<T> create(Registry<T> registry, String id);
}
