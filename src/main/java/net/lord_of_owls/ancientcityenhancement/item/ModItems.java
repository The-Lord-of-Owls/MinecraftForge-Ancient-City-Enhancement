package net.lord_of_owls.ancientcityenhancement.item;

import net.lord_of_owls.ancientcityenhancement.AncientCityEnhancement;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create( ForgeRegistries.ITEMS, AncientCityEnhancement.MOD_ID );

    public static final RegistryObject<Item> OBSIDIAN_LANTERN = ITEMS.register( "obsidian_lantern", () -> new Item( new Item.Properties() ) );
    public static final RegistryObject<Item> POLISHED_OBSIDIAN_UPGRADE_TEMPLATE = ITEMS.register( "polished_obsidian_upgrade_template", () -> new Item( new Item.Properties() ) );
    public static final RegistryObject<Item> POLISHED_OBSIDIAN_SWORD = ITEMS.register( "polished_obsidian_sword", () -> new Item( new Item.Properties() ) );
    public static final RegistryObject<Item> POLISHED_OBSIDIAN_PICKAXE = ITEMS.register( "polished_obsidian_pickaxe", () -> new Item( new Item.Properties() ) );
    public static final RegistryObject<Item> POLISHED_OBSIDIAN_HOE = ITEMS.register( "polished_obsidian_hoe", () -> new Item( new Item.Properties() ) );
    public static final RegistryObject<Item> POLISHED_OBSIDIAN_SHOVEL = ITEMS.register( "polished_obsidian_shovel", () -> new Item( new Item.Properties() ) );
    public static final RegistryObject<Item> POLISHED_OBSIDIAN_AXE = ITEMS.register( "polished_obsidian_axe", () -> new Item( new Item.Properties() ) );
    public static final RegistryObject<Item> POLISHED_OBSIDIAN_CHESTPLATE = ITEMS.register( "polished_obsidian_chestplate", () -> new Item( new Item.Properties() ) );
    public static final RegistryObject<Item> POLISHED_OBSIDIAN_HELMET = ITEMS.register( "polished_obsidian_helmet", () -> new Item( new Item.Properties() ) );
    public static final RegistryObject<Item> POLISHED_OBSIDIAN_LEGGINGS = ITEMS.register( "polished_obsidian_leggings", () -> new Item( new Item.Properties() ) );
    public static final RegistryObject<Item> POLISHED_OBSIDIAN_BOOTS = ITEMS.register( "polished_obsidian_boots", () -> new Item( new Item.Properties() ) );
    public static final RegistryObject<Item> POTION_OF_THORNS = ITEMS.register( "potion_of_thorns", () -> new Item( new Item.Properties() ) );
    public static final RegistryObject<Item> POTION_OF_POISON_RESIST = ITEMS.register( "potion_of_poison_resist", () -> new Item( new Item.Properties() ) );
    public static final RegistryObject<Item> BOTTLE_OF_SKULK_HONEY = ITEMS.register( "bottle_of_skulk_honey", () -> new Item( new Item.Properties() ) );
    public static final RegistryObject<Item> BOTTLE_OF_ACID = ITEMS.register( "bottle_of_acid", () -> new Item( new Item.Properties() ) );
    public static final RegistryObject<Item> BUCKET_OF_ACID = ITEMS.register( "bucket_of_acid", () -> new Item( new Item.Properties() ) );
    public static final RegistryObject<Item> SOUL_CRYSTAL = ITEMS.register( "soul_crystal", () -> new Item( new Item.Properties() ) );
    public static final RegistryObject<Item> SOUL_FUNGUS = ITEMS.register( "soul_fungus", () -> new Item( new Item.Properties() ) );


    public static void register( IEventBus eventBus ) {
        ITEMS.register( eventBus);
    }
}


