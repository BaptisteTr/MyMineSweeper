package MyMineSweeper.gameModel

/**
 * Created by baptiste on 03/06/17.
 */
class Board(height : Int, width : Int){
    val SMALL = 1
    val MEDIUM = 2
    val BIG = 3

    var height : Int = 0
        private set

    var width : Int = 0
        private set

    init{
        this.height = height
        this.width = width
    }

    constructor(size : Int) : this(0,0)
    {
        when(size) {
            SMALL -> {
                height = 8
                width = 8
            }
            MEDIUM -> {
                height = 16
                width = 16
            }
            BIG -> {
                height = 30
                width = 16
            }
        }
    }

}