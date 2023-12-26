import kotlin.math.pow
import kotlin.math.sqrt
fun main(){
    println("Enter the value of x1")
    var x1:Int=readln().toInt()
    
    println("Enter the value of x2")
    var x2:Int=readln().toInt()

    println("Enter the value of y1")
    var y1:Int=readln().toInt()

    println("Enter the value of y2")
    var y2:Int=readln().toInt()
    
    var distance=(x2-x1).toDouble().pow(2)+(y2-y1).toDouble().pow(2)
    var result=sqrt(distance)
    print("The ecludian distance is ${result}")

}