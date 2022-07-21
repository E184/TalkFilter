package net.azisaba.talkfilter.events

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.AsyncPlayerChatEvent

object FilterChatEvent: Listener {
    @EventHandler
    fun onChat(e: AsyncPlayerChatEvent) {
        var filterlist = "あ"
        if (e.message == filterlist) {
            e.message = "メッセージクリア"
        }

        // val p = e.player
        // e.message = "${p.displayName} がサーバーに入りました"
    }
}