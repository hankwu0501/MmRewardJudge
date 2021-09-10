package com.gmail.hankwu0501

import com.gmail.hankwu0501.listeners.MMobHandle
import org.bukkit.Bukkit
import org.bukkit.plugin.java.JavaPlugin

class MmRewardJudge: JavaPlugin() {
    companion object{
        lateinit var instance:MmRewardJudge
    }
    init{
        instance = this
    }
    override fun onEnable() {
        Bukkit.getPluginManager().registerEvents(MMobHandle(), this)
        instance.logger.info("插件啟動成功")
    }

}