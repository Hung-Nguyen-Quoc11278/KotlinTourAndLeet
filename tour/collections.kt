// Lists, Sets, Maps
fun readonlyListAndMutableList(){
    val readOnlyShapes = listOf("triangle","square","circle")
    println(readOnlyShapes)
    val shapes: MutableList<String> = mutableListOf("triangle","square","circle")
    println(shapes)
    // change to view only
    val shapesLocked: List<String> = shapes
    // first item on list by index
    println("first item on list: ${readOnlyShapes[0]}")
    // first item on list by function
    println("first item on list: ${readOnlyShapes.first()}")
    // last item onlist by index
    println("last item on list: ${readOnlyShapes[2]}")
    // last item on list by function
    println("last item on list: ${readOnlyShapes.last()}")
    // number items in a list
    println("number items of shapesLocked is:${shapesLocked.count()} ")
    // check item circle is on readOnlyShapes?
    var checkCircle = "circle" in readOnlyShapes
    println("is circle on readOnlyShapes: $checkCircle")
    // add item to shapes 
    shapes.add("hello")
    println(shapes)
    // remove item in shapes
    shapes.remove("circle")
    println(shapes)
}
fun setAndUnique(){
    // more but when print - that just use 1 apple in list
    val readOnlyFruit = setOf("apple","banana","mango","watermelon","apple")
    val fruit: MutableSet<String> = mutableSetOf("apple","apple","apple","banana","mango","watermelon","apple")
    // make fruit to readonly
    val fruitMutableSetReadOnlyBlock: Set<String> = fruit 
    println(fruit)
    println(readOnlyFruit)
    println(fruitMutableSetReadOnlyBlock)
    // number item of Set
    println("number items of fruitMutableSetReadOnlyBlock ${fruitMutableSetReadOnlyBlock.count()}")
    // check apple in Set
    val checkIsappleInSet = "apple" in fruitMutableSetReadOnlyBlock
    println("is apple in set: $checkIsappleInSet")
    // add item in Set
    fruit.add("hello")
    println(fruit)
    // remove item in set
    fruit.remove("apple")
    println(fruit)
}
fun mapKeyValueItem(){
    val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(readOnlyJuiceMenu)
    val juiceMenu: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(juiceMenu)
    // change to read only
    val juiceMenuBlocked: Map<String, Int> = juiceMenu
    println(juiceMenuBlocked) 
    // to show value with key
    println("apple price is: ${juiceMenuBlocked["apple"]}")
    // try to show doesn't exist key
    println("pineapple price is: ${juiceMenuBlocked["pineapple"]}")
    // add key to map
    juiceMenu["coconut"] = 300
    println(juiceMenu)
    println("price of coconut is: ${juiceMenu["coconut"]}")
    // remove key on map
    juiceMenu.remove("apple")
    println(juiceMenu)
    // get number items in map
    println("number items in juiceMenu is: ${juiceMenu.count()}")
    // check is the key existed on map true or false
    var key = "kiwi"
    val checkKey = juiceMenu.containsKey(key)
    println("the $key existed: $checkKey")
    // obtain a collection of the keys
    println("list keys of juiceMenu: ${juiceMenu.keys}")
    // obtain a collection of the values
    println("list value of juiceMenu: ${juiceMenu.values}")
    // check key is on a map keys
    var keyInMap = "kiwi"
    var checkKeyInMap = keyInMap in juiceMenu.keys
    println("the $keyInMap on Map is: $checkKeyInMap")
    // check value is on a map keys
    var valueInMap = 190
    var checkValueInMap = valueInMap in juiceMenu.values
    println("the $valueInMap on Map is: $checkValueInMap")

}
fun main(){
    //List
    println("\n List \n")
    readonlyListAndMutableList()
    //Set
    println("\n Set \n")
    setAndUnique()
    //Map
    println("\n Map \n")
    mapKeyValueItem()
}