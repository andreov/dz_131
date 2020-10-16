fun main() {
    val numberSec=12*60//*60
    val wordSec="был(а) в сети только что"
    val wordToDay="был(а) в сети сегодня"
    val wordYesterDay="был(а) в сети вчера"
    val wordLong="был(а) в сети давно"
    when (numberSec){
        in 1..60 -> println(wordSec)
        in 60..60*60 -> println(minuteWord(numberSec))
        in 60*60+1..60*60*24 -> println(hourWord(numberSec))
        in 60*60*24+1..60*60*24*2 -> println(wordToDay)
        in 60*60*24*2+1..60*60*24*3 -> println(wordYesterDay)
        else -> println(wordLong)
    }

}

fun minuteWord (numberSec:Int):String {
    val minute:Int=numberSec/60
    val word1="был(а) в сети $minute минуту назад"
    val word2="был(а) в сети $minute минуты назад"
    val word5="был(а) в сети $minute минут назад"
    val result:String=when(minute){
        2,4,22,24,32,34,42,44,52,54 -> word2
        1,21,31,41,51-> word1
        else -> word5
    }
    return result
}

fun hourWord (numberSec:Int):String {
    val hour:Int=numberSec/(60*60)
    val word1="был(а) в сети $hour час назад"
    val word2="был(а) в сети $hour часа назад"
    val word5="был(а) в сети $hour часов назад"
    val result:String=when(hour){
        2,3,4,22,23,24 -> word2
        1,21-> word1
        else -> word5
    }
    return result
}