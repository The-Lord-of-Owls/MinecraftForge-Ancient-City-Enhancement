package net.lord_of_owls.ancientcityenhancement;

import com.mojang.logging.LogUtils;
import net.lord_of_owls.ancientcityenhancement.item.ModCreativeModeTabs;
import net.lord_of_owls.ancientcityenhancement.item.ModItems;
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

        modEventBus.addListener( this::commonSetup );
        MinecraftForge.EVENT_BUS.register( this );

        modEventBus.addListener( this::addCreative );
    }

    private void commonSetup( final FMLCommonSetupEvent event ) {}

    private void addCreative( BuildCreativeModeTabContentsEvent event ) {
        if ( event.getTab() == ModCreativeModeTabs.ANCIENT_TAB.get() ) {
            event.accept(ModItems.OBSIDIAN_LANTERN);
        }
    }

    @Mod.EventBusSubscriber( modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT )
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup( FMLClientSetupEvent event ) {}
    }
}
