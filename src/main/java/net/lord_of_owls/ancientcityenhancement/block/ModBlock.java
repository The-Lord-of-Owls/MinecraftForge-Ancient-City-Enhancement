package net.lord_of_owls.ancientcityenhancement.block;

import net.lord_of_owls.ancientcityenhancement.AncientCityEnhancement;
import net.lord_of_owls.ancientcityenhancement.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlock {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create( ForgeRegistries.BLOCKS, AncientCityEnhancement.MOD_ID );

    public static final RegistryObject<Block> SOUL_FUNGUS_BLOCK = registerBlock("soul_fungus_block", () -> new Block(BlockBehaviour.Properties.copy( Blocks.SCULK).strength(6f ).requiresCorrectToolForDrops() ) );
    public static final RegistryObject<Block> SOUL_CRYSTAL_BLOCK = registerBlock("soul_crystal_block", () -> new Block(BlockBehaviour.Properties.copy( Blocks.AMETHYST_BLOCK ).strength(6f ).requiresCorrectToolForDrops() ) );
    public static final RegistryObject<Block> SKULK_CHEST_BLOCK = registerBlock("skulk_chest_block", () -> new Block(BlockBehaviour.Properties.copy( Blocks.CHEST ).strength(6f ).requiresCorrectToolForDrops() ) );
    public static final RegistryObject<Block> SOUL_FORGE_BLOCK = registerBlock("soul_forge_block", () -> new Block(BlockBehaviour.Properties.copy( Blocks.FURNACE ).strength(6f ).requiresCorrectToolForDrops() ) );
    public static final RegistryObject<Block> POLISHED_OBSIDIAN_BLOCK = registerBlock("polished_obsidian_block", () -> new Block(BlockBehaviour.Properties.copy( Blocks.OBSIDIAN ).strength(6f ).requiresCorrectToolForDrops() ) );
    public static final RegistryObject<Block> CONTAMINATED_SOIL_BLOCK = registerBlock("contaminated_soil_block", () -> new Block(BlockBehaviour.Properties.copy( Blocks.DIRT ).strength(6f ).requiresCorrectToolForDrops() ) );
    public static final RegistryObject<Block> CONTAMINATED_SAND_BLOCK = registerBlock("contaminated_sand_block", () -> new Block(BlockBehaviour.Properties.copy( Blocks.SAND ).strength(6f ).requiresCorrectToolForDrops() ) );


    private static <T extends Block> RegistryObject<T> registerBlock( String name, Supplier<T> block ) {
        RegistryObject<T> toReturn = BLOCKS.register( name, block );
        registerBlockItem( name, toReturn );
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem( String name, RegistryObject<T> block ) {
        return ModItems.ITEMS.register(name, () -> new BlockItem( block.get(), new Item.Properties() ) );
    }

    public static void register( IEventBus eventBus ) {
        BLOCKS.register( eventBus );
    }
}


