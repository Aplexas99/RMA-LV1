package Checkers

import Models.Die

class PokerChecker: Checker {
    override fun check(dice: MutableList<Die>) {
        var counter : Int =0
        for (index in 0..dice.size-3){
            counter=1;
            for (ind in index+1..dice.size-1){
                 if(dice[index].number == dice[ind].number){
                    counter++
                    if (counter>=4){
                        println("Poker")
                        return;
                    }
                }

            }
        }
    }
}