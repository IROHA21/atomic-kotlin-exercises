// Summary1/Task10.kt
package summaryIExercise10

fun showSnake(rows: Int, columns: Int) {
    // Calculate how wide each number should be
    val lastNum = rows * columns - 1
    val width = lastNum.toString().length + 1  // digits + 1 space
    val format = "%${width}d"

    var num = 0
    for (row in 0 until rows) {
        if (row % 2 == 0) {
            // Left to right
            for (col in 0 until columns) {
                print(format.format(num++))
            }
        } else {
            // Right to left
            num += columns - 1
            for (col in 0 until columns) {
                print(format.format(num--))
            }
            num += columns + 1
        }
        println()
    }
}

fun main() {
  showSnake(2, 3)
  println()
  showSnake(4, 5)
}
/* Output:
 0 1 2
 5 4 3

  0  1  2  3  4
  9  8  7  6  5
 10 11 12 13 14
 19 18 17 16 15
*/