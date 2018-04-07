package com.kompeteer.core.domain.chess;

import com.kompeteer.core.domain.Player;
import com.kompeteer.core.domain.TwoPlayerGame;

public class ChessGame extends TwoPlayerGame {
    public Player getWhitePlayer() {
        return getPlayer1();
    }

    public Player getBlackPlayer() {
        return getPlayer2();
    }
}
