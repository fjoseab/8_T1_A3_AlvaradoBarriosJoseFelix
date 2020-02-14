import scala.io.StdIn._

object CocientesEnteros {
  def cociente(num1:Int, num2:Int): Int ={
    if(num1>=num2){
      cociente(num1-num2, num2)
    }else{
      num1
    }
  }
  
  def main(args: Array[String]): Unit = {
    println("Ingrese numero 1")
    var num1 = readInt()
    println("Ingrese numero 2")
    var num2 = readInt()
    print(cociente(num1, num2))
  }
}