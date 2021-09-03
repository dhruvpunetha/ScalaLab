package lab6

object Q1 {
  //for loop from previous video
  def main(args: Array[String])
  {
    var a=0;
    var b=0;
    for(a<-1 to 20)   //using to
      print(" "+a);
    println();
    for(a<-1 until 20) //using until
      print(" "+a);
    println();
    for(a<-1 to 5;b<-1 until 5){   // using ; to separate
      println("Value of a : "+a);
      println("Value of b : "+b);
    val numList=List(1,2,3,4,5,6);
    for(a<-numList)   //traversing list
      println("Value of a : "+a);
		val numList2=List(1,2,3,4,5,6,7,8,9,10);
    for(a<-numList2 if a!=3;if a<8)
      println("Value of a : "+a);
		var retVal = for{a<-numList2 if a!=3;if a<8}yield a
		for(a<-retVal)
  		println("Value of a : "+a);
    }
    
    
    
    
  }
  
}