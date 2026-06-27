fun customers(){
    var customers = 10
    println("1. $customers")
    customers = 8
    println("2. $customers")
    customers = customers + 3
    println("3. $customers")
    customers +=7
    println("4. $customers")
    customers -=2
    println("5. $customers")
    customers *=3
    println("6. $customers")
    customers /=2
    println("7. $customers")
}
fun basictype(){
    val year: Int = 2026 //Byte, Short, Int, Long
    val score: UInt = 100u //UByte, UShort, UInt, ULong
    val currentTemp: Float = 24.5f
    val price: Double = 19.99 //Float, Double
    val isEnable: Boolean = true //Boolean
    val separator: Char = ','//Char
    val message: String = "Hello!"// String
    println("$year $score $currentTemp $isEnable $separator $message")
}
fun declaredType(){
    val d: Int
    d = 10
    print("declared $d")
}
fun main(){
    customers()
    basictype()
    declaredType()
}
