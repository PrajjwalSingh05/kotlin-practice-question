fun main()
{
    println("Entert the value if num")
    var num1:Int=readln().toInt()
    var num=num1
    var newnum=0
    while(num1>0)
    {
        var rem:Int=num1%10
        newnum=rem+newnum*10
        num1=num1/10

    }
    print("The original number is ${num} and reverse of it is ${newnum}")
}