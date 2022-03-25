fun main(args: Array<String>) {

    val straightChecker = StraightChecker();
    val pokerChecker = PokerChecker();
    val jambChecker = JambChecker();
    val checkers = mutableListOf<Checker>(straightChecker,pokerChecker,jambChecker);

    val player1 = Player(0,"P1")

    val players = mutableListOf<Player>(player1)

    val game = Game(players,checkers)
    while (!game.gameEnd) {
        var position : String
        println("Type 'r' for throwing dice,'l' for locking ")
        var option = readLine()
        when (option){
            "r" -> game.throwDice()
            "l" ->  {
                println("Input positions you would like to lock")
                position=readLine().toString()
                game.lockDice(position.toInt())
            }
            "r" -> game.throwDice()
            "r" -> game.throwDice()
        }

    }

}