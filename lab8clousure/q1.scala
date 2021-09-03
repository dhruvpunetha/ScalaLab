package lab8clousure

object q1 {
  def main(args: Array[String])
  {
    var st="hi"
    val printclo=(name: String)=> println(st+" my name is "+name)
   //  val toPrintString = (name: String) => println(s"We are students of $name"+
 //s" and of batch $year")

    printclo("BABA")
  }
}