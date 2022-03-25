import kotlin.random.Random

class Die{
    var number: Int
    var locked: Boolean

    constructor(){
        this.number=1
        this.locked=false
    }

    fun roll() {
        if (!locked) {
            number = Random.nextInt(1, 7)
        }
    }

}