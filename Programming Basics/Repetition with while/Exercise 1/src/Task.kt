// RepetitionWithWhile/Task1.kt
package repetitionWithWhileExercise1

fun displayContent(letters : String) {
    var i = 0
    while (i < letters.length) {
        println(letters[i])

        i ++
    }



}

fun main() {
displayContent("abc")
}
/* Expected output:
a
b
c
*/