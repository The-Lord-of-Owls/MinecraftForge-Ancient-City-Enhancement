package net.lord_of_owls.ancientcityenhancement;

import com.mojang.logging.LogUtils;
import net.lord_of_owls.ancientcityenhancement.block.ModBlock;
import net.lord_of_owls.ancientcityenhancement.item.ModCreativeModeTabs;
import net.lord_of_owls.ancientcityenhancement.item.ModItems;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(AncientCityEnhancement.MOD_ID)
public class AncientCityEnhancement {
    public static final String MOD_ID = "ancientcityenhancement";
    private static final Logger LOGGER = LogUtils.getLogger();

    public AncientCityEnhancement() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModeTabs.register( modEventBus );

        ModItems.register( modEventBus );
        ModBlock.register( modEventBus );

        modEventBus.addListener( this::commonSetup );
        MinecraftForge.EVENT_BUS.register( this );

        modEventBus.addListener( this::addCreative );
    }

    private void commonSetup( final FMLCommonSetupEvent event ) {}

    private void addCreative( BuildCreativeModeTabContentsEvent event ) {
        if ( event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS ) {
            event.accept( ModItems.SOUL_CRYSTAL );
            event.accept( ModItems.SOUL_FUNGUS );
            event.accept( ModBlock.SOUL_FUNGUS_BLOCK );
            event.accept( ModBlock.SOUL_CRYSTAL_BLOCK );
            event.accept( ModBlock.CONTAMINATED_SOIL_BLOCK );
            event.accept( ModBlock.CONTAMINATED_SAND_BLOCK );
        }

        if ( event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS ) {
            event.accept( ModBlock.SKULK_CHEST_BLOCK );
            event.accept( ModBlock.SOUL_FORGE_BLOCK );
            event.accept( ModBlock.POLISHED_OBSIDIAN_BLOCK );
        }

        if ( event.getTabKey() == CreativeModeTabs.INGREDIENTS ) {
            event.accept( ModItems.BOTTLE_OF_SKULK_HONEY );
            event.accept( ModItems.BOTTLE_OF_ACID );
            event.accept( ModItems.POTION_OF_THORNS );
            event.accept( ModItems.POTION_OF_POISON_RESIST );
        }

        if ( event.getTabKey() == CreativeModeTabs.COMBAT ) {
            event.accept( ModItems.POLISHED_OBSIDIAN_CHESTPLATE );
            event.accept( ModItems.POLISHED_OBSIDIAN_HELMET );
            event.accept( ModItems.POLISHED_OBSIDIAN_LEGGINGS );
            event.accept( ModItems.POLISHED_OBSIDIAN_BOOTS );
        }

        if ( event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES ) {
            event.accept( ModItems.POLISHED_OBSIDIAN_PICKAXE );
            event.accept( ModItems.POLISHED_OBSIDIAN_HOE );
            event.accept( ModItems.POLISHED_OBSIDIAN_SHOVEL );
            event.accept( ModItems.POLISHED_OBSIDIAN_AXE );
            event.accept( ModItems.OBSIDIAN_LANTERN );
            event.accept( ModItems.POLISHED_OBSIDIAN_UPGRADE_TEMPLATE );
            event.accept( ModItems.BUCKET_OF_ACID );
        }

        if ( event.getTab() == ModCreativeModeTabs.ANCIENT_TAB.get() ) {
            //Tools and Utilities
            event.accept( ModItems.POLISHED_OBSIDIAN_PICKAXE );
            event.accept( ModItems.POLISHED_OBSIDIAN_HOE );
            event.accept( ModItems.POLISHED_OBSIDIAN_SHOVEL );
            event.accept( ModItems.POLISHED_OBSIDIAN_AXE );
            event.accept( ModItems.OBSIDIAN_LANTERN );
            event.accept( ModItems.POLISHED_OBSIDIAN_UPGRADE_TEMPLATE );
            event.accept( ModItems.BUCKET_OF_ACID );

            //Combat
            event.accept( ModItems.POLISHED_OBSIDIAN_SWORD );
            event.accept( ModItems.POLISHED_OBSIDIAN_CHESTPLATE );
            event.accept( ModItems.POLISHED_OBSIDIAN_HELMET );
            event.accept( ModItems.POLISHED_OBSIDIAN_LEGGINGS );
            event.accept( ModItems.POLISHED_OBSIDIAN_BOOTS );

            //Ingredients
            event.accept( ModItems.POTION_OF_THORNS );
            event.accept( ModItems.POTION_OF_POISON_RESIST );
            event.accept( ModItems.BOTTLE_OF_SKULK_HONEY );
            event.accept( ModItems.BOTTLE_OF_ACID );

            //Natural
            event.accept( ModItems.SOUL_CRYSTAL );
            event.accept( ModItems.SOUL_FUNGUS );
            event.accept( ModBlock.SOUL_FUNGUS_BLOCK );
            event.accept( ModBlock.SOUL_CRYSTAL_BLOCK );
            event.accept( ModBlock.CONTAMINATED_SOIL_BLOCK );
            event.accept( ModBlock.CONTAMINATED_SAND_BLOCK );

            //Building Blocks
            event.accept( ModBlock.SOUL_FUNGUS_BLOCK );
            event.accept( ModBlock.SOUL_CRYSTAL_BLOCK );
            event.accept( ModBlock.SKULK_CHEST_BLOCK );
            event.accept( ModBlock.SOUL_FORGE_BLOCK );
            event.accept( ModBlock.POLISHED_OBSIDIAN_BLOCK );
        }
    }

    @Mod.EventBusSubscriber( modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT )
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup( FMLClientSetupEvent event ) {}
    }
}
