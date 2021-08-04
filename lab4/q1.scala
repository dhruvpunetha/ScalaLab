package lab4

object q1 {   //for max min
  //main method
  def main(args:Array[String])
  {
    println("Min and Max from 10,20")
    MXMN(10,20);
  }
  def MXMN(a:Int,b:Int)={
    //nested functions
    maxv();
    minv();
    def maxv()={
      if(a>b)
      {
        println("Max is "+a)
      }
      else
      {
        println("Max is "+b)
      }
    }
    def minv()={
      if (a < b)
    {
    println("Min is: " + a)
    }
    else
    {
    println("Min is: " + b)
    } 
    }
  }
}