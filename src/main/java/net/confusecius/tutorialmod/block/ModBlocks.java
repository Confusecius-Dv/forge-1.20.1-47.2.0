package net.confusecius.tutorialmod.block;

import net.confusecius.tutorialmod.TutorialMod;
import net.confusecius.tutorialmod.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;


public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, TutorialMod.MOD_ID);

    public static final RegistryObject<Block> MUNE_BLOCK = registerBlock("mune_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK).sound(SoundType.AMETHYST).strength(3.3f, 8.8f).lightLevel((state) -> 7)));
    public static final RegistryObject<Block> SUNE_BLOCK = registerBlock("sune_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK).sound(SoundType.AMETHYST).strength(3.3f, 8.8f).lightLevel((state) -> 9)));

    public static final RegistryObject<Block> SUNE_ORE = registerBlock("sune_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .sound(SoundType.AMETHYST)
                    .strength(2.2f,8.8f)
                    .lightLevel((state) -> 6)
                    .requiresCorrectToolForDrops(), UniformInt.of(5,8)));
    public static final RegistryObject<Block> MUNE_ORE = registerBlock("mune_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .sound(SoundType.AMETHYST)
                    .strength(2.2f, 8.8f)
                    .lightLevel((state) -> 4)
                    .requiresCorrectToolForDrops(), UniformInt.of(5, 8  )));


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

//    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
//        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
//    }

    private static <T extends Block> RegistryObject<BlockItem> registerBlockItem(String name, RegistryObject<T> block){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
