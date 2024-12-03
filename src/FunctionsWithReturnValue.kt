fun main() {

    val pow = printPower2(3, 5)
    println("3 to the power of 5 is : $pow")
    println(multiply(3, 5))

    val list = listOf(66, 4, 1, 2, 3)
    printFirstItem(list)

    // -------------------------------

    val list2 = listOf(3, 2, 5, 1, 5, 6, 7)
    println("The list looks like the following: $list2")
    println("Search for this number:")
    val input = readLine()?.toInt()
    if(input != null){
        println("The index of $input is ${indexOf(list2, input)}")
    }


}

fun printFirstItem(list: List<Int>) = println(list[0])

fun multiply(a: Int, b: Int) = a * b

fun printPower2(base: Int, exponent: Int): Int{
    var result2 = 1
    for(i in 1..exponent){
        result2 *= base
    }
    return result2
//    println("after") // it wont execute
}

// -----------------------------------------------------

fun indexOf(list2: List<Int>, value: Int): Int{
    for(i in 0 until list2.size-1){
        if(list2[i] == value){
            return i
        }
    }
    return -1
}

