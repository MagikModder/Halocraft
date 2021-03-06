package haloCraft.blocks;

import haloCraft.HaloCraft;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Niobium_Ore extends Block 
{
	public Niobium_Ore() 
	{
		super(Material.iron);
		this.setBlockName("Niobium Ore");
		this.setBlockTextureName(HaloCraft.NAME + ":" + "Niobium Ore");
		this.setResistance(15);
		this.setHardness(3);
		this.setStepSound(soundTypeStone);
		this.setHarvestLevel("pickaxe", 2);
		this.setCreativeTab(HaloCraft.tabBlocks);
	}
}