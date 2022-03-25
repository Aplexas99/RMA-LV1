class Player {
    val id: Int
    val name: String
    val dice: MutableList<Die>

    constructor(id: Int, name:String){
        this.id=id;
        this.name=name;
        val d1 = Die(); val d2=Die() ; val d3=Die() ;
        val d4=Die(); val d5=Die() ; val d6=Die();
        this.dice= mutableListOf(d1,d2,d3,d4,d5,d6)
    }
    fun rollDice(){
        for(index in 0 .. dice.size-1){
            dice[index].roll();
        }
    }
    fun printDice(){
        for(index in 0 .. dice.size-1){
            print(dice[index].number);
            print(" , ");
        }
        println()
    }
}