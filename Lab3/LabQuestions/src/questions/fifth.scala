package questions

object fifth {
  def main(args: Array[String])
  {
    println("Sum is: "+ functionToAdd(10,15));
  }
  //declaration and definition of function
  def functionToAdd(a :Int, b :Int): Int={
    val sum: Int=a+b
    return sum
  }
}