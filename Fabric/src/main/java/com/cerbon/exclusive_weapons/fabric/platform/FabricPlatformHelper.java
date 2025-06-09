package com.cerbon.exclusive_weapons.fabric.platform;

import com.cerbon.exclusive_weapons.fabric.registry.FabricResourcefulRegistry;
import com.cerbon.exclusive_weapons.platform.services.IPlatformHelper;
import com.cerbon.exclusive_weapons.registry.ResourcefulRegistry;
import net.minecraft.core.Registry;

public class FabricPlatformHelper implements IPlatformHelper {

    @Override
    public <T> ResourcefulRegistry<T> create(Registry<T> registry, String id) {
        return new FabricResourcefulRegistry<>(registry, id);
    }
}
