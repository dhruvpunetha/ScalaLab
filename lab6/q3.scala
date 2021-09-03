package lab6

object q3 {
  def main(args: Array[String]): Unit = {
    var b=List.range(1, 10)
    println("Original List:");
    for(i<- b)
      println(i);
    b=b.reverse;
    println("Reversed List is :");
    for(i<- b)
      println(i);
    
    var a=List.fill(10)(1)
    println("Uniform List:");
    for(i<- a)
      println(i);
  }
}