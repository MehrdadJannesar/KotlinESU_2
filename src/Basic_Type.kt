fun main(args: Array<String>){
//    Events

//    val/var name_variable: data_type = value
// Numbers
//    val a: Int = 1000
//    val d: Double = 100.00
//    val f: Float = 100.00f
//    val l: Long = 10000004
//    val s: Short = 10
//    val b: Byte = 1
//
//    println("Your Int value is " + a);
//    println("Your float value is " + f);
//    println("Your byte value is " + b);

  // Chars
//    val letter: Char //defining a variable
//    letter = 'A'     // Assigning a value to it
//    println("Assigning a value to it $letter")

//    Boolean
//
//    val bool : Boolean
//    bool = true
//    print("Your bool value is " + "$bool")

    // String

//    var rawString: String = "I am Raw String"
//    val escapedString : String = "I am escaped String!\n"
//    escapedString = "Hello"
//    println("Hello!" + escapedString)
//    println("Hey!!" + rawString)

//    Array
//
//val numbers : IntArray = intArrayOf(1,2,3,4)
//println("Hey!! I am array Example " + numbers[2])

    //collections
//    mutable List; --> taghir pazir
//    immutable List --> taghir naa pazir

//    val numbers: MutableList<Int> = mutableListOf(1,2,3)
//    val readOnlyView: List<Int> = numbers
//
//    println("my mutable list -- "+ numbers)
//    numbers.add(4)
//    println("my mutable list after addition -- " + numbers)
//    println(readOnlyView)
//    readOnlyView.clear()

    val items = listOf(1,2,3,4)
    println("Frist element of our list ----> " + items.first())
    println("Last element of our list ----> " + items.last())
    println("Even numbers of our list ----> " + items.filter { it % 2 == 0 })

//    {key:value}
//    key to value

    val readWriteMap = hashMapOf("foo" to 1, "bar" to 2)
    println(readWriteMap["bar"])

    val strings = hashSetOf("a","b","c","c","b")
    println("My set value are: " + strings)

//    items.add("Mehrdad")
}