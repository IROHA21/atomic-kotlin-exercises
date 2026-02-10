// ObjectsEverywhere/Task3.kt
package objectsEverywhereExercise3

fun isPalindrome(s: String): Boolean =
  s.reversed() == s

fun isPalIgnoreCase(s: String): Boolean =
  isPalindrome(s.lowercase())

fun isPalIgnoreSpecial(s: String): Boolean {
    var newstring : String = ""
    for (letter in s){
        if (letter in 'A'..'Z' || letter in 'a'..'z'){ newstring += letter}
    }

    return isPalIgnoreCase(newstring)
}

fun main() {
  println(isPalIgnoreSpecial("Was It A Rat I Saw? ..."))  // true
}