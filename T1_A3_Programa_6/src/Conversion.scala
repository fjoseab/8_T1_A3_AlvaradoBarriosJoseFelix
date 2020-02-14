

object Conversion {
  def conversion(num:Int):Unit={
    if(num<2){
      print(num)
    }else{
      conversion(num/2)
      print(num%2)
    }
  }
  
  def main(args: Array[String]): Unit = {
    conversion(88)
  }
}