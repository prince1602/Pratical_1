fun main(){
    print("Enter Number: ")
    var a=readln().toInt()
    var b = fact(a)
    var c = tailRecFac(a)
    println("Factorial of $a = $b")
    println("By TailRec Keyword, Factorial of $a = $c")
}

fun fact(a: Int): Int{
    return if(a==0 || a==1)
        1
    else
        a * fact(a-1)
}

tailrec fun tailRecFac(a: Int, acc: Int = 1): Int {
    return if (a == 0)
        acc
    else tailRecFac(a - 1, acc * a)
}