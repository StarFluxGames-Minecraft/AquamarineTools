package com.starfluxgames.aquamarinetools.item;

import com.starfluxgames.aquamarinetools.AquamarineTools;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(AquamarineTools.MOD_ID);

    public static final DeferredItem<Item> AQUAMARINE = ITEMS.register("aquamarine",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
