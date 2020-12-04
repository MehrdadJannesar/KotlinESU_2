open class ABC{

    open fun think(){
        print("Hey!! I am thinking ")
    }

}


class BCD: ABC(){ // inheritence happend usin default constructor

    override fun think(){
        print("I am from Child!")
    }

}

fun main(args: Array<String>){

    var a = BCD()
    a.think()

}