package net.azisaba.talkfilter.commands

import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

object BadWordsCommand: CommandExecutor{
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
        val wordlist = "This is BadWords Command."
        sender.sendMessage(wordlist)
        return false
    }
}