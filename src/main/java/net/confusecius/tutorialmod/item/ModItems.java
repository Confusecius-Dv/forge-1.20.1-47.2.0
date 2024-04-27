package net.confusecius.tutorialmod.item;

import net.confusecius.tutorialmod.TutorialMod;
import net.confusecius.tutorialmod.item.custom.metalDetectorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> MUNE = ITEMS.register("mune",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SUNE = ITEMS.register("sune",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BASKAR_INGOT = ITEMS.register("baskar_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item>BAT_WING = ITEMS.register("bat_wing",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BLUE_KYBER_CRYSTAL = ITEMS.register("blue_kyber_crystal",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GREEN_KYBER_CRYSTAL = ITEMS.register("green_kyber_crystal",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RED_KYBER_CRYSTAL = ITEMS.register("red_kyber_crystal",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PURPLE_KYBER_CRYSTAL = ITEMS.register("purple_kyber_crystal",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> WHITE_KYBER_CRYSTAL = ITEMS.register("white_kyber_crystal",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector",
            () -> new metalDetectorItem(new Item.Properties().durability(100)));

    public static final RegistryObject<Item> CHOCOLATE = ITEMS.register("chocolate",
            () -> new Item(new Item.Properties().food(ModFoods.CHOCOLATE)));




    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
