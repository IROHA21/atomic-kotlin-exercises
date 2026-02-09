// Summary1/Task6.kt
package summaryIExercise6

fun everyFifthNonSpace(s: String) {

    var num = 0
  for (letter in s){
      if (letter !in " "){
          num++
      }
      if (num == 5){
          println("$letter")
          num = 0
      }
  }


}

fun main() {
  everyFifthNonSpace("abc d e fgh ik")
}
/* Output:
e
k
*/