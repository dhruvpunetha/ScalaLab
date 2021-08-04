package lab4

object q2 {
  def main(args: Array[String])
  {
    println("To Find Max and Min")
    maxmn(40,56)
  }
  def maxmn(a:Int,b:Int)
  {
    def multimax()={
      maxValue()
      def maxValue() = {
if(a > b)
{
println("Max is: " + a)
}
else
{
println("Max is: " + b)
}
} 
    }
    def multimin()={
      minValue()
      def minValue()={
      if(a<b)
      {
        println("Min is: " + a)
      }
      else
    {
    println("Min is: " + b)
    } 
    }
    }
    multimax();
    
    multimin();
    }
}