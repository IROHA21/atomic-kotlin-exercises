// VarAndVal/Task3.kt
package varAndValExercise3

fun main() {
  var x = 1
  var y = 2


  x = y + x
  y = x - y
  x = x - y

  println(x)
  println(y)
}