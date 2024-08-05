def filterEvenNumbers():List[Int] = {
    var emptyList = List.empty[Int]
    var newList  = List.empty[Int]
    
    var continue = true

    println("Enter the numbers(Enter 'Done' to finish)")
    while(continue){
        
        var input = scala.io.StdIn.readLine()
        if(input == "Done") {
            continue = false  
        } else {
            val number = input.toInt
            emptyList = emptyList:+number
        }
        
    }
    println("Entered numbers:")
    println(emptyList)
    newList = emptyList.filter(num => num % 2 == 0 && num !=  0)
    newList

}

@main def ls7q1() = {
    val numbers = filterEvenNumbers()
    println("Even numbers: ")
    print(numbers)
}