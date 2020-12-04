//class name_class{
//    //class body
//    //event
//}

//class myClass{
//
//    //Property
//    private var name: String = "Kotlin"
//    // member function
//    fun printMe(){
//        print("You are at the best location!" + name)
//    }
//
//
//}

//class Outer{
//    class Nested{
//        fun printMe() = "Welcome to the my course!"
//    }
////    class Nested2{
////
////    }
//}

interface Human{
    fun think()
}


fun main(args: Array<String>){

    var programmer: Human = object : Human{
        override fun think() {
            print("I am an example of Interface")
        }
    }
    programmer.think()

}