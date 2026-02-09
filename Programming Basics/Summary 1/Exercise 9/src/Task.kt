// Summary1/Task9.kt
package summaryIExercise9

fun printTriangle(n: Int) {
    var spaces = n-1
    var j = 1
  for (i in 0 until n) {
      println(" ".repeat(spaces) + "#".repeat(j))
        spaces--
      do {
          j++
      }while(j % 2 == 0)
  }
}

fun main() {
  printTriangle(4)
}
/* Output:
   #
  ###
 #####
#######
*/
