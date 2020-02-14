import scala.io.StdIn._

object Division {
  def division(num1:Int, num2:Int): Int={
    if(num2>num1){
      0
    }else{
      1+division(num1-num2, num2)
    }
  }
  
  def main(args: Array[String]): Unit = {
    println("Ingrese numero 1")
    var num1 = readInt()
    println("Ingrese numero 2")
    var num2 = readInt()
    println(division(num1, num2))
  }
}