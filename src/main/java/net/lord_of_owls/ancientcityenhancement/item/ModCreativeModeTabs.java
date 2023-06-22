package net.lord_of_owls.ancientcityenhancement.item;

import net.lord_of_owls.ancientcityenhancement.AncientCityEnhancement;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create( Registries.CREATIVE_MODE_TAB, AncientCityEnhancement.MOD_ID );

    public static RegistryObject<CreativeModeTab> ANCIENT_TAB = CREATIVE_MODE_TABS.register( "ancient_tab", () -> CreativeModeTab.builder().icon( () -> new ItemStack( ModItems.OBSIDIAN_LANTERN.get() ) ).title( Component.translatable("creativemodetab.ancient_tab") ).build() );

    public static void register( IEventBus eventBus ) {
        CREATIVE_MODE_TABS.register( eventBus );
    }
}


