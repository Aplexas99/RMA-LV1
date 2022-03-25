import Checkers.Checker
import Checkers.JambChecker
import Checkers.PokerChecker
import Checkers.StraightChecker
import Models.Game
import Models.Player

fun main(args: Array<String>) {

    val straightChecker = StraightChecker();
    val pokerChecker = PokerChecker();
    val jambChecker = JambChecker();
    val checkers = mutableListOf<Checker>(straightChecker,pokerChecker,jambChecker);

    val players = mutableListOf<Player>()

    val game = Game(players,checkers)

    var menu = true
    while (menu){
        println("Press 'p' to add player or press 'y' to start game")
        var option = readLine()
        var playerId = 0
        var playerName: String
        var numberOfPlayers:Int
        numberOfPlayers=players.size-1;
        when(option){


            "p" -> {
                println("Input player name")
                playerName= readLine().toString()

                players.add(Player(playerId,playerName))
                playerId++
                if(numberOfPlayers<players.size-1) {
                    println("Player $playerName added")
                    numberOfPlayers= players.size-1
                }
                else{
                    error("Player not added")
                }
            }
            "y" -> {
                if(players.size>1){
                    menu=false
                }
                else{
                    println("Please add players to start game")
                }
            }
        }
    }
    while (!game.gameEnd) {
        var position : String
        println("On turn ${game.getPlayerOnTurnName()}")
        println("Type 'r' for throwing dice,'l' for locking,'e' to end your turn")
        var option = readLine()
        when (option){
            "r" -> game.throwDice()
            "l" ->  {
                println("Input positions you would like to lock")
                position=readLine().toString()
                if (position.toIntOrNull()!=null){

                    if(position.toInt()>6 || position.toInt()<1){
                        println("Invalid position, it must be 1-6. Please try again")

                    }else {
                        game.lockDice(position.toInt())
                    }
                } else{
                    println("Please input number from 1 to 6, try again")

                }
            }
            "e" -> game.endTurn()
        }

    }

}