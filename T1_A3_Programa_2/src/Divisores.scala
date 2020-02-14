import scala.io.StdIn._

object Divisores {
  def div(numero : Int, numeroBase : Int): Unit={
    if(numero==0){
    }
    else{
      if((numeroBase%numero)==0){
        println(numero)
        div(numero-1, numeroBase)
      }else{
        div(numero-1, numeroBase)  
      }
      
      
    }
  }
  def main(args: Array[String]): Unit = {
    println("Ingrese numero para buscar divisores")
    var num = readInt()
    div(num, num)
  }
}