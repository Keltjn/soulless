package com.soulless.keltjn.init;

import java.util.ArrayList;
import java.util.List;

import com.soulless.keltjn.objects.blocks.BlockBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block ONYX_BLOCK = new BlockBase("onyx_block", Material.IRON);
}
