// LoopingAndRanges/Task4.kt
package loopingAndRangesExercise4

fun showHalfTriangle(n: Int) {
   val sting = "#"
  for (i in 1..n) {
      println(sting.repeat(i))

  }
}

fun main() {
  showHalfTriangle(4)
}
/* Output:
#
##
###
####
*/