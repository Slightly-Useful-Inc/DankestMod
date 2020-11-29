package com.slightlyuseful.dankestmod.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class GraphiteBlock extends Block {
    public GraphiteBlock(){
        super(AbstractBlock.Properties.create(Material.IRON)
                .hardnessAndResistance(3.0F, 4.0F)
                .sound(SoundType.METAL)
                .harvestLevel(2)
                .harvestTool(ToolType.PICKAXE)
        );

    }
}
