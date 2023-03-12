fun main() {
    var num1 = readln().first()
    var num2 = readln().first()
    var num3 = readln().first()

    var result = (num2 == ++num1) && (num3 == ++num2)

    println(result)
}