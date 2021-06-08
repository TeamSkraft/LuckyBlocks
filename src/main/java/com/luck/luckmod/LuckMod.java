package com.luck.luckmod;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;






@Mod(LuckMod.MOD_ID)
public class LuckMod{
	public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "luck";


    public LuckMod() {	
    	IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
    	bus.addListener(this::setup);
    	
    	//ItemInit.ITEMS.register(bus);
    	//BlockInit.BLOCKS.register(bus);
        
    	//MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, OreGeneration::generateOres);
    	MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event){
    	
    } 
}
