class Game
{
    val players : MutableList<Player>
    val checkers: MutableList<Checker>
    var playerOnTurn: Int
    var numberOfThrows: Int = 0
    var gameEnd : Boolean = false
    constructor(players: MutableList<Player>, checkers: MutableList<Checker>){
        this.players = players
        this.checkers = checkers
        this.playerOnTurn= 0
    }
    fun throwDice(){
        if(!gameEnd){
            if(numberOfThrows>3){
                println("You can't throw more than 3 times")
            }

            players[playerOnTurn].rollDice()
            players[playerOnTurn].printDice()
            checkAll()
            numberOfThrows++
            if(numberOfThrows==3) {
                if (players.size -1 == playerOnTurn) {
                    println("No more players")
                    gameEnd= true;
                }
                else{
                    playerOnTurn++
                }
            }
        }
        else{
            println("Game ended")
        }
    }

    fun lockDice(position: Int){
        if(position <1 ||position >6){
            println("Invalid position, try again with: 1,2,3,4,5 or 6")
            return
        }
            players[playerOnTurn].dice[position-1].locked=true

    }

    fun checkAll(){
        for(index in 0 .. checkers.size-1){
            checkers[index].check(players[playerOnTurn].dice)
        }
    }
}