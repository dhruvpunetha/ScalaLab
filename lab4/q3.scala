package lab4

object q3 {
  def main(args:Array[String])
  {
    println("even or odd 10")
    NES(10);
  }
  def NES(a:Int)={
    eve()
    def eve()={
      if(a%2==0)
      {
        println(a+" is even")
      }
      else
      {
        println(a+" is odd")
      }
    }
  }
}