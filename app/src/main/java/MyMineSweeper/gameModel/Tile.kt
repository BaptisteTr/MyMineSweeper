package MyMineSweeper.gameModel

/**
 * Created by baptiste on 03/06/17.
 */
class Tile constructor(isBomb: Boolean) {
    val NOTHING = 0
    val FLAG = 1
    val QUESTION_MARK = 2

    var printNumber : Int = 0
        get() = this.printNumber
        set(value){
            if(value < 0){
                field = 0
            } else if (value > 8){
                field = 8
            }
        }

    var isClicked : Boolean = false
        get() = this.isClicked
        private set

    var statusPrint : Int = NOTHING
        get() = this.statusPrint
        private set

    val isBomb: Boolean = isBomb

    fun click() : Boolean {
        if(!this.isClicked) {
            this.isClicked = true
        }

        return isBomb
    }

    fun iterateStatus(){
        if(statusPrint == NOTHING){
            statusPrint = FLAG
        } else if(statusPrint == FLAG){
            statusPrint = QUESTION_MARK
        } else if(statusPrint == QUESTION_MARK) {
            statusPrint = NOTHING
        }
    }

}