// RepetitionWithWhile/Task2.kt
package repetitionWithWhileExercise2

fun sum(number: Int): Int {
    var num = 0
    var sum = 0
   while (num <=  number  ){
       sum += num
       num ++
   }
    return sum
}

fun main() {
  println(sum(10))  // 55
}