// RepetitionWithWhile/Task3.kt
package repetitionWithWhileExercise3

fun sumOfEven(n: Int): Int {
    var num = 0
    var sum  = 0
    while (num <=  n )
    {
        if (num % 2 == 0)   sum += num
        num ++
    }
    return sum
}


fun main() {
  println(sumOfEven(10))  // 30
}