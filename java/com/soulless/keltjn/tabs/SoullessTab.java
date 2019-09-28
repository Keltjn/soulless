package com.soulless.keltjn.tabs;

import com.soulless.keltjn.init.ItemInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class SoullessTab extends CreativeTabs 
{
	public SoullessTab(String label)
	{
		super("soullesstab");
		this.setBackgroundImageName("soulless.png");
	}
	
	@Override
	public ItemStack getTabIconItem()
	{
		return new ItemStack(ItemInit.ONYX);
	}
	
}
