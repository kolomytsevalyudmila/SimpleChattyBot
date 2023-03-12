fun main() {
    val n = readln().toInt()
    var a = 0
    var b = 0
    var c = 0
    var d = 0
    repeat(n){
        var grades = readln().toInt()
        var res = when (grades) {
            2 -> {
                d++
            }
            3 -> {
                c++
            }
            4 -> {
                b++
            }
            5 -> {
                a++
            }

            else -> {
                println("Не корректная оценка")
            }
        }
    }
    println("$d $c $b $a")
}