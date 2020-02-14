import scala.io.StdIn._

object Factorial {
   def factorial(numero : Int, numeroBase : Int, suma:Int): Int={
    if(numero==numeroBase){
      suma
    }
    else{
      if(numero==0){
        0
      }else{
        factorial(numero, numeroBase+1, suma+(suma*numeroBase))  
      }
    }
    
  }
  def main(args: Array[String]): Unit = {
    println("Ingrese numero para buscar factorial")
    var num = readInt()
    print(factorial(num, 1, 1))
  }
}