package com.gmail.hankwu0501.listeners

import io.lumine.xikage.mythicmobs.api.bukkit.events.MythicMobDeathEvent
import org.bukkit.Bukkit
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener

class MMobHandle :Listener{
    @EventHandler
    fun rewardJudge(e: MythicMobDeathEvent){
        val player = e.mob.threatTable?.topThreatHolder?.bukkitEntity?.let { Bukkit.getPlayer(it.uniqueId) }
        player?.let {
            for (item in e.drops){
                it.inventory.addItem(item)
            }
        }
        e.drops.clear()
    }
}