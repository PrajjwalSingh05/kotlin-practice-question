fun greateer(num1:Int,num2:Int,num3:Int):Int
{
    if( num1>num2 && num1>num3)
    {
        return num1
    }
    else if (num2>num1 && num2>num3)
    {
        return num2
    }
    else{
        return num3
    }
}
fun main()
{
    print("Enter the first number:")
    var num1:Int=readln().toInt()
    
    print("Enter the first number:")
    var num2:Int=readln().toInt()
    print("Enter the first number:")
    var num3:Int=readln().toInt()
    print("The Greates number amoung  $num1,$num2,$num3 is ${greateer(num1,num2,num3)}")

}