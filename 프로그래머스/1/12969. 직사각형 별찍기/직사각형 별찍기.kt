fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(' ').map(String::toInt)
    
    var sb = StringBuilder()
    
    for(i in 0 until b){
        for(j in 0 until a){
           sb.append("*")
        }
        sb.append("\n")
    }
    println(sb)
}