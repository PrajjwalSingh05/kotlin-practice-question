fun dgit_square(num:Int):Int
{
    var result:Int=0
    var temp:Int=num
    var rem:Int=0

    while(temp>0)
    {
        rem=temp%10
        result=result+rem*rem
        temp=temp/10

    }
    return result
}
fun main()
{
    print("Entert the value of num")
    var num:Int=readln().toInt()
    var answer=dgit_square(num)
    println("The square of the digit is $answer")
}