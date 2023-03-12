fun main() {
    val totalSeconds = System.currentTimeMillis() / 1000 // dont change this line
    // enter your code
    val calc0 = totalSeconds / 86400
    val calc5 = totalSeconds-(calc0 * 86400)
    val calc1 = calc5 / 3600
    val calc2 = (calc5 - (calc1*5)) / 3600
    val calc3 = (calc5 - (calc1*5)) % 60
    
    println("$calc1:$calc2:$calc3")
}
