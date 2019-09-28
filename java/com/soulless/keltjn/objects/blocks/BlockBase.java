package com.soulless.keltjn.objects.blocks;

import com.soulless.keltjn.Soulless;
import com.soulless.keltjn.init.BlockInit;
import com.soulless.keltjn.init.ItemInit;
import com.soulless.keltjn.util.interfaces.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel 
{
	public BlockBase(String name, Material material)
	{
		super(material);
		setUnlocalizedName(name);
		setCreativeTab(Soulless.SOULLESSTAB);
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	@Override
	public void registerModels()
	{
		Soulless.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}
