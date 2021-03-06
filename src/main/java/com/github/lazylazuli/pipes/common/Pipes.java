package com.github.lazylazuli.pipes.common;

import com.github.lazylazuli.lib.common.mod.LazyLazuliMod;
import com.github.lazylazuli.lib.common.mod.Proxy;
import com.github.lazylazuli.pipes.common.network.GuiHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Pipes.MODID,
	 version = Pipes.VERSION + "-" + Pipes.BUILD,
	 acceptedMinecraftVersions = Pipes.MCVERSION,
	 dependencies = "required-after:lazylazulilib@[2.0.0]",
	 updateJSON = Pipes.UPDATE)
public final class Pipes extends LazyLazuliMod
{
	public static final String MODID = "lazylazulipipes";
	
	public static final String MCVERSION = "1.12";
	
	public static final String VERSION = "2.0.1";
	public static final String BUILD = "35";
	
	public static final String UPDATE = "https://github.com/lazylazuli/Pipes/releases/download/Latest/update.json";
	
	@Mod.Instance(MODID)
	public static Pipes instance;
	
	@SidedProxy(clientSide = "com.github.lazylazuli.pipes.client.ClientProxy",
				serverSide = "com.github.lazylazuli.pipes.common.CommonProxy")
	public static Proxy proxy;
	
	@Mod.InstanceFactory
	public static Pipes initializeMod()
	{
		Pipes mod = new Pipes();
		MinecraftForge.EVENT_BUS.register(mod);
		return mod;
	}
	
	@Override
	public String getId()
	{
		return MODID;
	}
	
	@Override
	public Proxy getProxy()
	{
		return proxy;
	}
	
	static final GuiHandler GUI_HANDLER = new GuiHandler();
	
	@Override
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		super.preInit(event);
	}
	
	@Override
	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		super.init(event);
	}
}
