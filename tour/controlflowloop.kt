
fun forFunction(){
    for(number in 1..5){
        println(number)
    }
}
fun forListOf(){
    val cakes = listOf("carrot","chese","chocolate")
    for(cake in cakes){
        println("Yummy $cake cake")
    }
}
fun main(){
    forFunction()
    forListOf()
}