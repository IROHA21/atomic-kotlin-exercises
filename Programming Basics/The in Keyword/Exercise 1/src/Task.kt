// InKeyword/Task1.kt
package theInKeywordExercise1

fun getAlphabet(): String {
    var result = ""
    for (letter in 'a'..'z') {
        result += letter
    }
    return result
}

fun main() {
  println(getAlphabet())  // abcdefghijklmnopqrstuvwxyz
}