package com.slightlyuseful.dankestmod.blocks;


import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;


public class AnimeBodyPillow extends Block {

    public AnimeBodyPillow() {
        super(AbstractBlock.Properties.create(Material.MISCELLANEOUS)
                .hardnessAndResistance(0.1F, 0.1F)
                .sound(SoundType.CLOTH)
                .harvestLevel(3)
                .harvestTool(ToolType.HOE)
        );
    }
}
