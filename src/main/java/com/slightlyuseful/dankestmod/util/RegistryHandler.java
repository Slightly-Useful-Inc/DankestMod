package com.slightlyuseful.dankestmod.util;

import com.slightlyuseful.dankestmod.DankestMod;
import com.slightlyuseful.dankestmod.blocks.BlockItemBase;
import com.slightlyuseful.dankestmod.blocks.CumBlock;
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

    public static final RegistryObject<Item> SOCK = ITEMS.register("sock", ItemBase::new);

    // Tools Only
    public static final RegistryObject<SwordItem> CUM_SOCK = ITEMS.register("cum_sock", ()-> new SwordItem(ItemTier.CUM, 6, 0.0F, new Item.Properties().group(DankestMod.TAB)));


    // Armor Only
    public static RegistryObject<ArmorItem> CUM_HELMET = ITEMS.register("cum_helmet", ()->
            new ArmorItem(ArmorMaterial.CUM, EquipmentSlotType.HEAD, new Item.Properties().group(DankestMod.TAB)));


    //Blocks Only
    public static final RegistryObject<Block> CUM_BLOCK = BLOCKS.register("cum_block", CumBlock::new);


    //Block Items
    public static final RegistryObject<Item> CUM_BLOCK_ITEM = ITEMS.register("cum_block", ()-> new BlockItemBase(CUM_BLOCK.get()));



}
