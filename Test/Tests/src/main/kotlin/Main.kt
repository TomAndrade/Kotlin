fun example(){
    println("Something went wrong")
}

fun mean(num1: Int, num2: Int): Double{
    val _result = (num1 + num2) / 2
    return _result.toDouble()
}

fun main() {


    var olaMundo = "Olá, mundo!"

    var d: Double = 1.5678910114568120
    var f: Float = 1.54567f
    var l: Long = 1234567890
    var i: Int = 12345678
    var s: Short = 12312
    val b: Byte = 127
    var c: Char = 'c'
    var boo: Boolean = false

    println(olaMundo)
    println(Int.MAX_VALUE)

    example()

    println(mean(32,52))

}