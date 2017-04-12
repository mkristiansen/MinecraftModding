package io.kristiansen.forge.mods;

import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class DiamondOreTrap {
	@SubscribeEvent
	public void explode(BreakEvent event) { 
	        if (event.getState().getBlock() != Blocks.DIAMOND_ORE) { 
	                return;
	        }
	        
	        BlockPos pos = event.getPos();
	        event.getWorld().createExplosion(null, 
	        		pos.getX(), pos.getY(), pos.getZ(),
	                        10, true);
	}	
}
