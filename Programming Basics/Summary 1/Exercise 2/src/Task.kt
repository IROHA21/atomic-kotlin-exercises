// Summary1/Task2.kt
package summaryIExercise2

fun other(s: String): String{
    var mutablee = ""
  for (letter in 0 until s.length  ) {

      if (letter % 2 == 0) {
          mutablee += s[letter]

      }


  }
    return mutablee

}



fun main() {
  println(other("cement"))
}
/* Output:
cmn
*/