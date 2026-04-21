fun main(args: Array<String>) = with(System.`in`.bufferedReader()) {

    val (notListenCount,notSeeCount) = readLine().split(" ").map { it.toInt() }

    val notListen = HashSet<String>()
    repeat(notListenCount) {
        notListen.add(readLine())
    }
    val result = mutableListOf<String>()
    repeat(notSeeCount) {
        val name = readLine()
        if (notListen.contains(name)) {
            result.add(name)
        }
    }

    println(result.size)
    result.sort()
    
    result.forEach {
        println(it)
    }

}

