package com.slightlyuseful.dankestmod.items;

import com.slightlyuseful.dankestmod.DankestMod;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class SunnySideUpEgg extends Item {
    public SunnySideUpEgg(){
        super(new Item.Properties()
            .group(DankestMod.TAB)
            .food(new Food.Builder()
                    .hunger(8)
                    .saturation(12.8f)
                    .effect(() -> new EffectInstance(Effects.SPEED, 600, 2), 1)
                    .setAlwaysEdible()
                    .build())
        );
    }
}