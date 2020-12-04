data class Book(val name : String, val publisher: String, var reviewScore: Int)


fun main(args: Array<String>){
    val book = Book("Kotlin", "Mehrdad Jannesar",5)

    println("Name of the book is " + book.name)
    println("Publisher Name " + book.publisher)
    println("Review of the book is " + book.reviewScore)
    book.reviewScore = 7
    println("Review of the book is " + book.reviewScore)
    println("Printing all the info all together " + book.toString())
    println("Example of the hashcode = " + book.hashCode())
//    println(args)
}