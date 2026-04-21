fun main(args: Array<String>) = with(System.`in`.bufferedReader()) {

    val input = readLine().split(" ").sumOf { it.toLong() }
    println(input)
}

