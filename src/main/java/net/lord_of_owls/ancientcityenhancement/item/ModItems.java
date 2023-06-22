package net.lord_of_owls.ancientcityenhancement.item;

import net.lord_of_owls.ancientcityenhancement.AncientCityEnhancement;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create( ForgeRegistries.ITEMS, AncientCityEnhancement.MOD_ID );

    public static final RegistryObject<Item> OBSIDIAN_LANTERN = ITEMS.register( "obsidian_lantern", () -> new Item( new Item.Properties() ) );


    public static void register( IEventBus eventBus ) {
        ITEMS.register( eventBus );
    }
}