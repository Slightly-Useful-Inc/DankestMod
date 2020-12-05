package com.slightlyuseful.dankestmod.items;

import com.slightlyuseful.dankestmod.DankestMod;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class EmeraldEgg extends Item {
    public EmeraldEgg(){
        super(new Item.Properties()
                .group(DankestMod.TAB)
                .food(new Food.Builder()
                        .hunger(8)
                        .saturation(12.8f)
                        .effect(() -> new EffectInstance(Effects.HERO_OF_THE_VILLAGE, 12000, 2), 1)
                        .setAlwaysEdible()
                        .build())
        );
    }
}
