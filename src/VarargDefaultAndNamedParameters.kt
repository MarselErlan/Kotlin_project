fun main() {
    val array = intArrayOf(10, 20, 2500)
//    val max = getMax(listOf(1, 2, 3)) // we can't to that -> vararg
    val max = getMax(1, 2, 3, 4, *array, 5 ,6, 7, 65, 456, 3, 2, 1)
    println("The maximum is $max")

    searchFor("How to become a good programmer")
    searchFor("How to become the best Kotlin programmer", "Bing")
    searchFor(searchEngine = "Bing2", search = "How to become the best Kotlin programmer")

    val sum = alternatingSum(3, 4, 5, 2, 1, 2, 3)
    println("The alternating sum is $sum")
}

// default parameters
fun searchFor(search: String, searchEngine: String = "Google"){
    println("Searching for `$search` on $searchEngine")
}

//fun getMax(list: List<Int>): Int{
//}
fun getMax(vararg numbers: Int): Int{
    var max = numbers[0]
    for(number in numbers){
        if(number > max){
            max = number
        }
    }
    return max
}

fun alternatingSum(vararg numbers: Int): Int{
    var sum = 0
    var toggle = true
    for(number in numbers){
        if(toggle){
            sum += number
        }else{
            sum -= number
        }
        toggle = !toggle
    }
    return sum
}