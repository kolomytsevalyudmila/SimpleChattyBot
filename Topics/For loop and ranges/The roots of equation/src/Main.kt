fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()
    val d = readln().toInt()

    for (x in 0..1000){
        var result = a * x * x * x + b * x * x + c * x + d
        if (result == 0) println(x)
     }
}