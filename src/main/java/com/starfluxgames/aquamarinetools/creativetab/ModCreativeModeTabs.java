package com.starfluxgames.aquamarinetools.creativetab;

import com.starfluxgames.aquamarinetools.AquamarineTools;
import com.starfluxgames.aquamarinetools.block.ModBlocks;
import com.starfluxgames.aquamarinetools.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AquamarineTools.MOD_ID);

    public static final Supplier<CreativeModeTab> AQUAMARINE_TOOLS_TAB = CREATIVE_MODE_TAB.register("aquamarine_tools_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.AQUAMARINE.get()))
                    .title(Component.translatable("creativetab." + AquamarineTools.MOD_ID + ".aquamarine_tools_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.AQUAMARINE);
                        output.accept(ModBlocks.AQUAMARINE_BLOCK);
                        output.accept(ModBlocks.AQUAMARINE_SAND_ORE);
                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
