fun main() {
    var a: Int = 10
    var b: Double = a.toDouble()
    var c: String = "10"
    var d: Int = c.toInt()
    var e: String = "11.12"
    var f: Double = e.toDouble()

    println("Integer Value: $a")
    println("Double Value (From Integer): $b")
    println("String Value: $c")
    println("Integer Value1 (From String): $d")
    println("Integer Value2 (From String): $d")
    println("Double Value (From String): $f")
}