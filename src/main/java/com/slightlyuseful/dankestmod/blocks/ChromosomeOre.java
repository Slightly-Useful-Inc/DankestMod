package com.slightlyuseful.dankestmod.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class ChromosomeOre extends OreBlock {

    public ChromosomeOre() {
        super(AbstractBlock.Properties.create(Material.IRON)
            .hardnessAndResistance(3.0F, 4.0F)
            .sound(SoundType.STONE)
            .harvestLevel(4)
            .harvestTool(ToolType.HOE)

        );
    }
}
