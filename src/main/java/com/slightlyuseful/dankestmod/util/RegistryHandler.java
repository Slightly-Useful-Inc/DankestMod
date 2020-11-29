package com.slightlyuseful.dankestmod.util;

import com.slightlyuseful.dankestmod.DankestMod;
import com.slightlyuseful.dankestmod.blocks.BlockItemBase;
import com.slightlyuseful.dankestmod.blocks.CumBlock;
import com.slightlyuseful.dankestmod.blocks.GraphiteBlock;
import com.slightlyuseful.dankestmod.items.ItemBase;
import com.slightlyuseful.dankestmod.tools.ItemTier;
import net.minecraft.block.Block;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import com.slightlyuseful.dankestmod.armor.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, DankestMod.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, DankestMod.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // Items Only

    public static final RegistryObject<Item> CUM = ITEMS.register("cum", ItemBase::new);

    public static final RegistryObject<Item> BLACK_SOCK = ITEMS.register("black_sock", ItemBase::new);

    public static final RegistryObject<Item> WHITE_SOCK = ITEMS.register("white_sock", ItemBase::new);

    public static final RegistryObject<Item> ORANGE_SOCK = ITEMS.register("orange_sock", ItemBase::new);

    public static final RegistryObject<Item> MAGENTA_SOCK = ITEMS.register("magenta_sock", ItemBase::new);

    public static final RegistryObject<Item> LIGHT_BLUE_SOCK = ITEMS.register("light_blue_sock", ItemBase::new);

    public static final RegistryObject<Item> YELLOW_SOCK = ITEMS.register("yellow_sock", ItemBase::new);

    public static final RegistryObject<Item> LIME_SOCK = ITEMS.register("lime_sock", ItemBase::new);

    public static final RegistryObject<Item> PINK_SOCK = ITEMS.register("pink_sock", ItemBase::new);

    public static final RegistryObject<Item> GRAY_SOCK = ITEMS.register("gray_sock", ItemBase::new);

    public static final RegistryObject<Item> LIGHT_GRAY_SOCK = ITEMS.register("light_gray_sock", ItemBase::new);

    public static final RegistryObject<Item> CYAN_SOCK = ITEMS.register("cyan_sock", ItemBase::new);

    public static final RegistryObject<Item> PURPLE_SOCK = ITEMS.register("purple_sock", ItemBase::new);

    public static final RegistryObject<Item> BLUE_SOCK = ITEMS.register("blue_sock", ItemBase::new);

    public static final RegistryObject<Item> BROWN_SOCK = ITEMS.register("brown_sock", ItemBase::new);

    public static final RegistryObject<Item> GREEN_SOCK = ITEMS.register("green_sock", ItemBase::new);

    public static final RegistryObject<Item> RED_SOCK = ITEMS.register("red_sock", ItemBase::new);

    public static final RegistryObject<Item> GRAPHITE = ITEMS.register("graphite", ItemBase::new);


    // Tools Only
    public static final RegistryObject<SwordItem> CUM_SOCK = ITEMS.register("cum_sock", ()-> new SwordItem(ItemTier.CUM, 6, 0.0F, new Item.Properties().group(DankestMod.TAB)));


    // Armor Only
    public static RegistryObject<ArmorItem> CUM_HELMET = ITEMS.register("cum_helmet", ()->
            new ArmorItem(ArmorMaterial.CUM, EquipmentSlotType.HEAD, new Item.Properties().group(DankestMod.TAB)));


    //Blocks Only
    public static final RegistryObject<Block> CUM_BLOCK = BLOCKS.register("cum_block", CumBlock::new);

    public static final RegistryObject<Block> GRAPHITE_BLOCK = BLOCKS.register("graphite_block", GraphiteBlock::new);


    //Block Items
    public static final RegistryObject<Item> CUM_BLOCK_ITEM = ITEMS.register("cum_block", ()-> new BlockItemBase(CUM_BLOCK.get()));
    public static final RegistryObject<Item> GRAPHITE_BLOCK_ITEM = ITEMS.register("graphite_block", ()->new BlockItemBase(GRAPHITE_BLOCK.get()));




}
