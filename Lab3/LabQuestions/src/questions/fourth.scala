package questions

object fourth {
  def main(args: Array[String])
  {
    println("Sum is: "+ functionToAdd(10,15));
  }
  //declaration and definition of function
  def functionToAdd(a :Int, b :Int): Int={
    var sum: Int=0
   sum=a+b
    return sum
  }
}