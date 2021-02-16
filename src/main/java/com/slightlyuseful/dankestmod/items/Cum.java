package com.slightlyuseful.dankestmod.items;

import com.slightlyuseful.dankestmod.DankestMod;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class Cum extends Item {
    //Pain
    public Cum() {
        super(new Item.Properties()
                .group(DankestMod.TAB)
                .food(new Food.Builder()
                        .hunger(3)
                        .saturation(8.0F)
                        .effect(()->new EffectInstance(Effects.STRENGTH, 3000, 3), 1)
                        .effect(()->new EffectInstance(Effects.NAUSEA, 3000, 3), 1)
                        .setAlwaysEdible()
                        .build())

        );
    }
}
