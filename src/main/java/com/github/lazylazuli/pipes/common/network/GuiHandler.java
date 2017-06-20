package com.github.lazylazuli.pipes.common.network;

import com.github.lazylazuli.pipes.client.gui.inventory.GuiWindowedPipe;
import com.github.lazylazuli.pipes.common.inventory.ContainerWindowedPipe;
import com.github.lazylazuli.pipes.common.tile.TilePipe;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler
{
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		return new ContainerWindowedPipe((TilePipe) world.getTileEntity(new BlockPos(x, y, z)));
	}
	
	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		return new GuiWindowedPipe((TilePipe) world.getTileEntity(new BlockPos(x, y, z)));
	}
}
