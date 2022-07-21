package net.azisaba.talkfilter.commands

import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

object RemoveBadWordCommand: CommandExecutor{
    override fun onCommand(
        sender: CommandSender?,
        command: Command?,
        label: String?,
        args: Array<out String>?
    ): Boolean {
        if (sender !is Player) {
            sender?.sendMessage("You are not Player.")
            return true
        }
        val removebad = "This is RemoveBadWord Command."
        sender.sendMessage(removebad)
        return false
    }
}