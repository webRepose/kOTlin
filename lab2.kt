Laba 2
Agalakov Daniel VTI

class Calculator {
    fun add(a: Int, b: Int): Int {
        return a + b
    }
    fun multiply(a: Int, b: Int, c: Int): Int { 
        return a * b * c 
    } 
}


 fun main() {
    sum(5.6, 10.8)
    proizved(5.9, 10.4, 15.6)
    name("Clown")
    
    val calculator = Calculator()
    val result1 = calculator.add(5, 7)
    println("Сумма: $result1")
    
    val result2 = calculator.multiply(2, 3, 4) 
    println("Произведение: $result2") 
}

 fun sum(num1: Int, num2: Int) {
     println(num1 + num2)
 }
 
 fun sum(num1: Double, num2: Double) {
     println(num1 + num2)
 }
 
 fun proizved(num1:Int, num2:Int, num3:Int) {
     println(num1 * num2 * num3)
 }
 
  fun proizved(num1:Double, num2:Double, num3:Double) {
     println(num1 * num2 * num3)
 }
 
  fun name(name:String) {
     println("Hello ${name}")
 }
