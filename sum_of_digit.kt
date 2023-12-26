fun main()
{
    println("Enter the value")
    var num:Int=readln().toInt()
    var sum:Int=0
    while(num>0)
    {
        var rem:Int=num%10
        sum=sum+rem
        num=num/10

    }
    println("The sum of digitis : ${sum}")
}