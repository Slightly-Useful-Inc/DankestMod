package com.slightlyuseful.dankestmod.util;

import com.slightlyuseful.dankestmod.DankestMod;
import com.slightlyuseful.dankestmod.blocks.BlockItemBase;
import com.slightlyuseful.dankestmod.blocks.CumBlock;
import com.slightlyuseful.dankestmod.items.ItemBase;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
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



    //Blocks Only
    public static final RegistryObject<Block> CUM_BLOCK = BLOCKS.register("cum_block", CumBlock::new);


    //Block Items
    public static final RegistryObject<Item> CUM_BLOCK_ITEM = ITEMS.register("cum_block", ()-> new BlockItemBase(CUM_BLOCK.get()));



}
