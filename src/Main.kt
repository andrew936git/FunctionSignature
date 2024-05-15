import kotlin.math.abs

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //1
    println("Введите число:")
    val number = readln().toInt()
    println("Введите степень")
    val degree = readln().toInt()
    println("Числол $number в степени $degree равно ${myPow(number, degree)}")
//2
    println("Введите 2 целых числа")
    val num1 = readln().toInt()
    val num2 = readln().toInt()
    println("Произведение всех чисел равно ${composition(num1, num2)}")
//3
    println("Введите 2 целых числа")
    var number1 = readln().toInt()
    var number2 = readln().toInt()
    if (number1 > number2){
        number1 += number2
        number2 = number1 -number2
        number1 -= number2
    }
    println("Наибольший общий делитель равен ${gcd(number1, number2)}")
}

fun myPow(number: Int, degree: Int):Double{
    var result = 1.0
    for (i in 1..abs(degree)){
        result *= number
    }
    if(degree < 0)result = 1 / result
    return result
}

fun composition(a: Int, b: Int):Int{
    var result = a
    for (i in a+1..b){
        result *= i
    }
    return  result
}
fun gcd(a: Int, b: Int):Int{
    var divisor = 0
    for (i in 1..b){
        if (a % i == 0 && b % i == 0) divisor = i
    }
    return divisor
}