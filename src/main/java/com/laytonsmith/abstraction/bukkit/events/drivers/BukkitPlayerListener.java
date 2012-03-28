/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laytonsmith.abstraction.bukkit.events.drivers;

import com.laytonsmith.abstraction.bukkit.events.BukkitPlayerEvents;
import com.laytonsmith.core.events.Driver;
import com.laytonsmith.core.events.EventUtils;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChangedWorldEvent;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.event.player.PlayerTeleportEvent;

/**
 *
 * @author Layton
 */
public class BukkitPlayerListener implements Listener{
    
    @EventHandler(priority=EventPriority.LOWEST)
    public void onPlayerJoin(PlayerJoinEvent e){
        EventUtils.TriggerListener(Driver.PLAYER_JOIN, "player_join", new BukkitPlayerEvents.BukkitMCPlayerJoinEvent(e));
    }
    
    @EventHandler(priority=EventPriority.LOWEST)
    public void onPlayerInteract(PlayerInteractEvent e){
        EventUtils.TriggerListener(Driver.PLAYER_INTERACT, "player_interact", new BukkitPlayerEvents.BukkitMCPlayerInteractEvent(e));
    }  

    @EventHandler(priority=EventPriority.LOWEST)
    public void onPlayerRespawn(PlayerRespawnEvent event) {
        EventUtils.TriggerListener(Driver.PLAYER_SPAWN, "player_spawn", new BukkitPlayerEvents.BukkitMCPlayerRespawnEvent(event));
    }
    
    @EventHandler(priority= EventPriority.LOWEST)
    public void onPlayerChat(PlayerChatEvent event){
        EventUtils.TriggerListener(Driver.PLAYER_CHAT, "player_chat", new BukkitPlayerEvents.BukkitMCPlayerChatEvent(event));
    }
    
    @EventHandler(priority= EventPriority.LOWEST)
    public void onPlayerChangedWorld(PlayerChangedWorldEvent event){
        EventUtils.TriggerListener(Driver.WORLD_CHANGED, "world_changed", new BukkitPlayerEvents.BukkitMCWorldChangedEvent(event));
    }
    
    @EventHandler(priority = EventPriority.LOWEST)
    public void onPlayerTeleport(PlayerTeleportEvent event){
        if(!event.getFrom().getWorld().equals(event.getTo().getWorld())){
            EventUtils.TriggerListener(Driver.WORLD_CHANGED, "world_changed", new BukkitPlayerEvents.BukkitMCWorldChangedEvent(new PlayerChangedWorldEvent(event.getPlayer(), event.getFrom().getWorld())));
        }
    }
    

}
