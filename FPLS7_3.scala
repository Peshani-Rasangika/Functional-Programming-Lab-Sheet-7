def filterPrime():List[Int] = {
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
    newList = emptyList.filter(num => {
        if (num <= 1) {
            false
        } else if (num == 2) {
            true
        } else {
            !(2 until num).exists(i => num % i == 0)
        }
    })
    newList

}

@main def ls7q3() = {
    val numbers = filterPrime()
    println("Prime numbers: ")
    print(numbers)
}