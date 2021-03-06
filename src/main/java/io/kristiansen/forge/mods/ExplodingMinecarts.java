package io.kristiansen.forge.mods;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraftforge.event.entity.minecart.MinecartCollisionEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * Created by ieu94897 on 04/04/2017.
 */
public class ExplodingMinecarts {

    @SubscribeEvent
    public void explode(MinecartCollisionEvent event){
        EntityMinecart minecart = event.getMinecart();
        minecart.worldObj.createExplosion(
                minecart,
                minecart.posX,
                minecart.posY,
                minecart.posZ,
                2,
        false);}
}
