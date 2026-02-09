// Summary1/Task7.kt
package summaryIExercise7

fun countDigits(number: Int, digit: Int): Int {
  var worker = number
  var occurrences = 0
  while (worker > 0) {
      val currentDigit = worker % 10  // Get the last digit

      if (currentDigit == digit) {  // Compare the digit itself
          occurrences++
      }

      worker /= 10  // Remove the last digit
  }
  return occurrences
}

fun main() {
  println(countDigits(764241, 4)) // 2
}