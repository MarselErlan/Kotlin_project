fun main() {
//    printThreeLines()
//    printThreeLines()
    printPower(3, 5)
    printPower(5, 2)
    printPower(7, 8)
    printPower(2, 10)

    sumUpTon(10)



}

fun printPower(base: Int, exponent: Int){
    var result = 1
    for(i in 1..exponent){
        result *= base
    }
    println("$base to the power of $exponent is $result")
}

fun printThreeLines(){

    println("First")
    println("Second")
    println("Third")

}

//-------------------------

fun sumUpTon(n: Int){
    var result2 = 0
    for(i in 1..n){
        result2 += i
    }
    println("The sum of the values from 1 to $n is $result2")
}


