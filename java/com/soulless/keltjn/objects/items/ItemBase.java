package com.soulless.keltjn.objects.items;

import com.soulless.keltjn.Soulless;
import com.soulless.keltjn.init.ItemInit;
import com.soulless.keltjn.util.interfaces.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel
{

	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Soulless.SOULLESSTAB);
		
		ItemInit.ITEMS.add(this);
	}
	
	@Override
	public void registerModels()
	{
		Soulless.proxy.registerItemRenderer(this, 0, "Inventory");
	}
}
