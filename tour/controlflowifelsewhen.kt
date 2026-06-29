
import kotlin.random.Random
fun changeDbyIfElse(){
    val d: Int
    val check = false
    if(check){
        d = 1
    }else{
        d = 2
    }
    println(d)
}
fun ifElseExpression(){
    val a = 13
    val b = 256
    println(if ( a > b ) a else b)
}

fun whenExpression(){
    val obj = "Hello"
    when(obj){
        // when obj equal to 1
        "1" -> println("One")
        // when obj equal to hello
        "Hello" -> println("Greeting")
        // Default Statement
        else -> println("unknow")
    }
}
fun whenResultForVal(){
    val obj = "Hello"
    val result = when(obj){
        "1" -> "One"
        "Hello" -> "Greeting"
        else -> "Unknow"
    }
    println(result)
}
fun whenWithoutSubject(){
    val trafficLightState = "Yellow"
    val trafficAction = when {
        trafficLightState == "Green" -> "Go"
        trafficLightState == "Yellow" -> "Slow down"
        trafficLightState == "Red" -> "Stop"
        else -> "Malfunction"
    }
    println(trafficAction)
}

fun ex1TwoDiceResult(){
    val firsResult = Random.nextInt(6)
    val secondResult = Random.nextInt(6)
    println("numa: $firsResult numb: $secondResult")
    if(firsResult == secondResult){
        println("You win")
    }else{
        println("You lose")
    }
}

fun ex2GameConsoleButtons(){
    val button = "X"
    val event = when (button){
        "A" -> "Yes"
        "B" -> "No"
        "X" -> "Menu"
        "Y" -> "Nothing"
        else -> "There is not such button"
    }
    println("event: $event")
}

fun main(){
    //if else
    println("\n if else \n")
    changeDbyIfElse()
    //a or b
    println("\n a or b expression \n")
    ifElseExpression()
    //when obj
    println("\n when \n")
    whenExpression()
    //when for val
    println("\n when and result \n")
    whenResultForVal()
    //when without subject
    println("\n when without subject \n")
    whenWithoutSubject()
    //exercise 1
    println("\n ex1 \n")
    ex1TwoDiceResult()
    //exercise 2
    println("\n ex2 \n")
    ex2GameConsoleButtons()
}