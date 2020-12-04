fun main(args:Array<String>){
//    println(MyFunction("kotlin course!"))

///////// Lambda Function
//    val mylambda: (String)->Unit = {s:String->print(s)}
//    val v:String = "Kotlin Course!"
//    mylambda(v)


//    val mylambda: (String)->Unit = {s:String->print(s)}
//    val v:String = "Kotlin Course!"
//    myFun(v,mylambda)

}
//inline function
fun myFun(a:String, action: (String) -> Unit){
    //statements
    print("Hey!!")
    action(a)// call to lambda function
}



//fun name_function(arguments: argumentType): ReturnType{
//    //Statements
//}
//////// Simple/Base Function
//fun MyFunction(x: String): String{
//    var c:String = "Hey!! welcome to "
//    return (c + x)
//}

