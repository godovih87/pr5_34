fun main() {
    try{
        println("Введите сторону a")
        val a = readLine()!!.toInt()
        println("Введите сторону b")
        val b = readLine()!!.toInt()
        println("Введите сторону c")
        val c = readLine()!!.toInt()
        println("Введите сторону d")
        val d = readLine()!!.toInt()
    when{
        (a>c&&b>d)-> println("Конверты можно сложить в друг друга")
        else-> println("Конверты не могут быть вложены в друг друга")
    }
    }
    catch (b: Exception){
        println("Введен символ")
    }
}