fun main(args: Array<String>) = with(System.`in`.bufferedReader()) {
    
    val totalPrice = readLine().toInt()
    val count = readLine()
    var result = 0 
    for (i in 0 until count.toInt()) {

        val input = readLine().split(" ")
        result += input[0].toInt()*input[1].toInt()
    }
    
    if(result == totalPrice){
        println("Yes")
    } else {
        println("No")
    }
}