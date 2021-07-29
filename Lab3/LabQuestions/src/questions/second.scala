package questions

object second {
  def main(args: Array[String])
  {
    while(true)
    {
      val result=scala.io.StdIn.readLine();
      //display the string that is given by user
      printf("You have entered : %s",result)
      println()
    }
  }
}