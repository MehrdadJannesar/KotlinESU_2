import java.lang.Exception

fun main(args:Array<String>){

    try {
        val myVar: Int = 12
        val v:String = "welcome Kotlin Course!"
//        v.toInt()

    }catch (e:Exception){
        e.printStackTrace()

    }finally {

        print(" Done! Bye!   ")

    }


}