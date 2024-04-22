package net.confusecius.tutorialmod.item;

import net.confusecius.tutorialmod.TutorialMod;
import net.confusecius.tutorialmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("tutorial_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.MUNE.get()))
                    .title(Component.translatable("creativetab.tutorial_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.MUNE.get());
                        pOutput.accept(ModItems.SUNE.get());
                        pOutput.accept(ModItems.BASKAR_INGOT.get());
                        pOutput.accept(ModItems.BAT_WING.get());

                        pOutput.accept(ModItems.BLUE_KYBER_CRYSTAL.get());
                        pOutput.accept(ModItems.GREEN_KYBER_CRYSTAL.get());
                        pOutput.accept(ModItems.RED_KYBER_CRYSTAL.get());
                        pOutput.accept(ModItems.PURPLE_KYBER_CRYSTAL.get());
                        pOutput.accept(ModItems.WHITE_KYBER_CRYSTAL.get());

                        pOutput.accept(Items.DIAMOND);

                        pOutput.accept(ModBlocks.MUNE_BLOCK.get());
                        pOutput.accept(ModBlocks.SUNE_BLOCK.get());
                        pOutput.accept(ModBlocks.MUNE_ORE.get());
                        pOutput.accept(ModBlocks.SUNE_ORE.get());



                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}