package net.azisaba.talkfilter

import net.azisaba.talkfilter.commands.AddBadWordCommand
import net.azisaba.talkfilter.commands.BadWordsCommand
import net.azisaba.talkfilter.commands.RemoveBadWordCommand
import net.azisaba.talkfilter.events.FilterChatEvent
import org.bukkit.Bukkit
import org.bukkit.plugin.java.JavaPlugin


class TalkFilter : JavaPlugin() {
    companion object{
        var instance : TalkFilter? = null
    }

    init {
        instance = this
    }


    override fun onEnable() {

        saveDefaultConfig()

        logger.info("Enabling ChatFilter v0.0.1")
        getCommand("addbadword")?.executor = AddBadWordCommand
        getCommand("badwords")?.executor = BadWordsCommand
        getCommand("removebadword")?.executor = RemoveBadWordCommand

        Bukkit.getPluginManager().registerEvents(FilterChatEvent, this)

    }

    override fun onDisable() {
        // Plugin shutdown logic
    }

}