fun factorial(num:Int ):Int
{
    var temp=num
    var fact=1
    for(i in 1..temp)
    {
        fact=fact*i

  }
  return fact
}
fun main()
{
    println("Enter a Numnber:")
    var num:Int=readln().toInt()
    println("The factorial of the number $num is ${factorial(num)}")

}