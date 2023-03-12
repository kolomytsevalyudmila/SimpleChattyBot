fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    var c = 0

    for (i in a .. b) {
        c = ((a + b) * (b - a + 1)) / 2
    }
    println(c)
}