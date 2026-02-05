// InKeyword/Task4.kt
package theInKeywordExercise4

// isValidCharacter

fun isValidIdentifier(s: String): Boolean {

    if (s.isEmpty()) return false
    if (s[0] !in "_" && s[0] !in 'a'..'z'  ) return false
    for (i in s){
        if (i !in "_" && i !in 'a'..'z' && i !in '0'..'9'  ) return false
    }



    return true


}

fun main() {
  println(isValidIdentifier("name"))  // true
  println(isValidIdentifier("0name"))
    println(isValidIdentifier("n01"))// false
}