package de.bacherik.tvshow.block.blocks;

import de.bacherik.tvshow.block.base.TBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockCopper extends TBlock {
    public BlockCopper(String unlocalizedName) {
        //String unlocalizedName, CreativeTabs tabs, float hardness, float resistance, Material blockMaterial, MapColor blockMapColor, SoundType soundType
        super(unlocalizedName, CreativeTabs.MISC, 5.0F, 10.0F, Material.ROCK, MapColor.SILVER, SoundType.ANVIL);
    }
}
