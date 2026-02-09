// Summary1/Task8.kt
package summaryIExercise8



fun reverseDecimal(number: Int): Int {
    var Worker = number
    var Result : Int = 0

    while  (Worker != 0){


        Result = (Result * 10) + (Worker % 10)
        Worker /= 10



    }
    return Result
}

fun main() {
  println(reverseDecimal(1234))  // 4321
}