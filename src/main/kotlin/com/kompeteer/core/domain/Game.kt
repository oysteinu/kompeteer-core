package com.kompeteer.core.domain

import java.util.*
import java.util.stream.Collectors

open class Game {
    val participations = ArrayList<Participation>()
    var results: MutableList<String>? = null

    fun addParticipation(player: Player) {
        val order = participations.size + 1

        val participation = Participation(order, player)
        addParticipation(participation)
    }

    fun addParticipation(participation: Participation) {
        participations.add(participation)
    }

    fun clearParticipations() {
        participations.clear()
        results?.clear()
    }

    protected fun getParticipation(player: Player): Participation? {
        val candidates = participations.stream()
                .filter { it.player == player }
                .collect(Collectors.toList())

        if (candidates.isEmpty()) {
            return null
        }

        return candidates[0]
    }
}