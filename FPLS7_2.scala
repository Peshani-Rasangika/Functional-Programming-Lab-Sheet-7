def calculateSquare():List[Int] = {
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
    newList = emptyList.map(num => num * num)
    newList

}

@main def ls7q2() = {
    val numbers = calculateSquare()
    println("Square of numbers: ")
    print(numbers)
}
