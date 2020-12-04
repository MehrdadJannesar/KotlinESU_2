//class name_cls(input args){
//    class body
//}

class Person(val firstname: String, var age: Int){
    val message: String = "Hi"
    constructor(name: String, age : Int, message: String): this(name,age){
    }
}


fun main(args: Array<String>){

    val person1 = Person("Kotlin", 10)
    print("${person1.message} " + "${person1.firstname} " + "Welcome to the example of secondary constructor," +
            "your age is - ${person1.age}")


}