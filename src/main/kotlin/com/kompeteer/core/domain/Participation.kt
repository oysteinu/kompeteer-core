package com.kompeteer.core.domain

import java.util.*

class Participation(id: String?, val order: Int, val player: Player) {
    val id: String

    constructor(order: Int, player: Player) : this(null, order, player) {

    }

    init {
        if (id == null) {
            this.id = UUID.randomUUID().toString()
        } else {
            this.id = id
        }
    }
}