fun main()

{   print("Enter the value of num1:")
    var num1:Int=readln().toInt()
   print("Enter the value of num2:")
    var num2:Int=readln().toInt()
    println("Before swapping the value of num is $num1 and value of num2 is ${num2}")
    num1=num1+num2
    num2=num1-num2
    num1=num1-num2
    println("After swapping the value of num is $num1 and value of num2 is ${num2}")

}