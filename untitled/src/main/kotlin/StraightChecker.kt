class StraightChecker(): Checker{
    override fun check(dice: MutableList<Die>) {
        val sortedDice : MutableList<Int> = mutableListOf<Int>()
        for (index in 0..dice.size-1){
            sortedDice.add(dice[index].number)
        }
        sortedDice.sort()
        var cleanedDice : List<Int> = mutableListOf<Int>()
        cleanedDice = sortedDice.distinct()

        if(cleanedDice.size<5){
            return;
        }
        else{
            if(cleanedDice.contains(1) && cleanedDice.contains(2)
                && cleanedDice.contains(3) && cleanedDice.contains(4)
                && cleanedDice.contains(5) )
            {
                println("Straight")
            }
            else if(cleanedDice.contains(6) && cleanedDice.contains(2)
                    && cleanedDice.contains(3) && cleanedDice.contains(4)
                    && cleanedDice.contains(5) )
                {
                    println("Straight")
                }
            }

        }
        }

