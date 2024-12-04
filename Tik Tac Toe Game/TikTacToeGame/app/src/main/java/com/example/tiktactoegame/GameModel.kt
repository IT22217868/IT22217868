package com.example.tiktactoegame

import android.adservices.adid.AdId
import java.sql.ClientInfoStatus
import kotlin.random.Random

data class GameModel ( //view model
    var gameId: String = "-1",
    var filledPos : MutableList<String> = mutableListOf("","","","","","","","",""),
    var winner : String = "",
    var gameStatus: GameStatus = GameStatus.CREATED,
    var currentPlayer : String = (arrayOf("X","O"))[Random.nextInt(2)]
)

enum class GameStatus{
    CREATED,
    JOINED,
    INPROGRESS,
    FINISHED
}
