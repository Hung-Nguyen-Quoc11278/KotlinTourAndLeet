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

fun main(){
    whileFunction()
    doWhileFunction()
}