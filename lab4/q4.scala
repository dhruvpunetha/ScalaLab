package lab4

object q4 {
  def main(args:Array[String])
  {
    println("even or odd 10")
    NES(11);
  }
  def NES(a:Int)={
    nes2()
    def nes2()
    {
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
}