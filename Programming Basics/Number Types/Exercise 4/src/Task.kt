// NumberTypes/Task4.kt
package numberTypesExercise4

fun convertToMilliseconds(hours: Int, minutes: Int, seconds: Int): Long =
    ((seconds + minutes * 60L  + hours * 3600L)* 1000)

fun main() {
  println(convertToMilliseconds(1, 30, 0))
}