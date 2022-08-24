package de.bacherik.tvshow.block.init;

import de.bacherik.tvshow.Main;
import de.bacherik.tvshow.block.base.TBlock;
import de.bacherik.tvshow.block.blocks.BlockCopper;
import de.bacherik.tvshow.util.IInitModel;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;

public class TBlocks {
    @GameRegistry.ObjectHolder(Main.MOD_ID + ":block_copper")
    public static final BlockCopper COPPER = new BlockCopper("block_copper");

    public static final TBlock[] BLOCKS = new TBlock[]
            {
                    COPPER
            };

    @SideOnly(Side.CLIENT)
    public static void initializeBlockModels() {
        for (IInitModel block : BLOCKS) {
            block.initializeModel();
        }
    }

    public static void registerBlocks(final RegistryEvent.Register<Block> event) {
        final IForgeRegistry<Block> registry = event.getRegistry();
        registry.registerAll(BLOCKS);
    }

    public static void registerItemBlocks(final RegistryEvent.Register<Item> event) {
        for (TBlock block : BLOCKS) {
            block.registerItemBlock(event);
        }
    }
}
