fun main(){
    yearConverter(2)
    println()
    getCharFromString("Hello World!")
    //println()
    convertMilesInKm(52.0)
    println(changeCharFromString("Hello World!"))
}

// Escrever uma função que converta anos em meses, dias, horas, minutos e segundos, respectivamente:
fun yearConverter(year: Int){
    val months = year * 12
    val days = months * 30
    val hours = days * 24
    val minutes = hours * 60
    val seconds = minutes * 60

    print("Year selected: $year\n Months: $months\n Days: $days\n Hours: $hours\n Minutes: $minutes\n Seconds: $seconds")
}

// Escrever uma função que mostre a quantidade de caracteres de uma string:
fun getCharFromString(string: String){
    println("String length: ${string.length}")
}

// Escreva uma função que converta milhas em quilômetros:
fun convertMilesInKm(miles: Double) {
    val km = miles * 1.6
    println("Miles: $miles => Kilometers: $km")
}

// Escreva uma função que substitua determinado caractere por outro:
fun changeCharFromString(string: String): String{
    val newString = string.replace("l","*").lowercase()
    return newString
}