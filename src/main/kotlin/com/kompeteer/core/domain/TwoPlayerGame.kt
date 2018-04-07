package com.kompeteer.core.domain

import java.util.ArrayList

open class TwoPlayerGame : Game() {
    fun setPlayers(player1: Player, player2: Player) {
        clearParticipations()

        addParticipation(player1)
        addParticipation(player2)
    }

    fun getPlayer1(): Player {
        return participations[0].player
    }

    fun getPlayer2(): Player {
        return participations[1].player
    }

    fun setWinner(player: Player) {
        val results = ArrayList<String>()

        if (participations[0].player == player) {
            results.add(participations[0].id)
            results.add(participations[1].id)
        } else {
            results.add(participations[1].id)
            results.add(participations[0].id)
        }

        this.results = results
    }
}