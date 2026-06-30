fun whileFunction(){
    var cakesEaten = 0
    var numberOfCakes = 10
    while(cakesEaten <= numberOfCakes){
        if(cakesEaten != 0){
            println("Eat a cake $cakesEaten")
        }
        cakesEaten++
    }
}

fun doWhileFunction(){
    var cakesEaten = 10
    var cakesBaked = 0
    do{
        if(cakesBaked != 0){
            println("Bake a cake $cakesBaked")
        }
        cakesBaked++
    }while(cakesBaked <= cakesEaten)
}

fun ex1PizzaSlicesWhile(){
    var pizzaSlices = 0
    while(pizzaSlices <8){
        println("There's only $pizzaSlices slice/s of pizza :(")
        pizzaSlices++
    }
    println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")
}

fun ex1PizzaSlicesDoWhile(){
    var pizzaSlices = 0
    do{
        println("There's only $pizzaSlices slices/s of pizza : (")
        pizzaSlices++
    }while(pizzaSlices < 8)
    println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")
}

fun fizzBuzzEx2Way1(){
    var number: Int
    for(number in 1..100){
        if(number %3 == 0 && number %5 == 0 ){
            println("$number : fizzbuzz")
        }else if(number %3 == 0){
            println("$number : fizz")
        }else if(number %5 == 0){
            println("$number : buzz")
        }else{
            println(number)
        }
    }
}

fun fizzBuzzEx2Way2(){
    var number: Int
    for(number in 1..100){
        var result = when{
            number %15 == 0 -> "$number fizzbuzz"
            number %5 == 0 -> "$number buzz"
            number %3 == 0 -> "$number fizz"
            else -> number
        }
        println(result)
    }
}

fun startWithLEx3(){
    val words = listOf("dinosaur", "limousine", "magazine", "language")
    for(word in words){
        if(word.startsWith("l")){
            println(word)
        }
    }
}

fun main(){
    // whileFunction()
    // doWhileFunction()
    // ex1PizzaSlicesWhile()
    // ex1PizzaSlicesDoWhile()
    // fizzBuzzEx2Way1()
    // fizzBuzzEx2Way2()
    startWithLEx3()
}