package de.bacherik.tvshow.block.base;

import de.bacherik.tvshow.Main;
import de.bacherik.tvshow.util.IInitModel;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class TBlock extends Block implements IInitModel {
    public TBlock(String unlocalizedName, CreativeTabs tabs, float hardness, float resistance, Material blockMaterial, MapColor blockMapColor, SoundType soundType) {
        super(blockMaterial, blockMapColor);
        this.setTranslationKey(Main.appendModID(unlocalizedName));
        this.setRegistryName(unlocalizedName);
        this.setCreativeTab(tabs);
        this.setHardness(hardness);
        this.setResistance(resistance);
        this.setSoundType(soundType);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void initializeModel() {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }

    public void registerItemBlock(final RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new ItemBlock(this).setRegistryName(getRegistryName()));
    }
}
