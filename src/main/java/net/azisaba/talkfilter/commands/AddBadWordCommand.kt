package net.azisaba.talkfilter.commands

import net.azisaba.talkfilter.TalkFilter
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player
import java.util.*


object AddBadWordCommand: CommandExecutor{
    override fun onCommand(
        sender: CommandSender?,
        command: Command?,
        label: String?,
        args: Array<out String>?
    ): Boolean {
        if (sender !is Player) {
            sender?.sendMessage("You are not Player.")
            return false
        }

        if (!args?.isEmpty()!!) {
            when (args[0].lowercase(Locale.getDefault())) {
                else -> {
                    val badWordType = args[0]
                    sender.sendMessage(badWordType)

                    if (args.isNotEmpty()) {
                        when (args[1].lowercase(Locale.getDefault())) {
                            else -> {
                                var typeX = TalkFilter.instance?.config?.getStringList(badWordType)
                                val badWord = args[1]

                                val badWords = "$typeX,$badWord"

                                val listOfStrings = arrayOf(badWords)
                                TalkFilter.instance?.config?.set(badWordType, listOf(*listOfStrings))
                                TalkFilter.instance?.saveConfig()

                            }
                        }
                    }
                }
            }
        }

        val addbad = "This is AddBadWord Command."
        sender.sendMessage(addbad)
        return true
    }
}

