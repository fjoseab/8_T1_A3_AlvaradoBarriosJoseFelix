import scala.io.StdIn._
object Sumatoria {
  def sumatoriaRecursiva2(li : Int, ls : Int): Int ={
    if(ls<li) 0 else ls+sumatoriaRecursiva2(li,ls-1)
  }
  
  def main(args: Array[String]): Unit = {
    println("Ingrese limite inferior")
    var num = readInt()
    println("Ingrese limite superior")
    var num2 = readInt() 
    print(sumatoriaRecursiva2(num, num2)) 
  }
}