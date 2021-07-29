package questions //package is a keyword

object third {    // object is a keyword
   def main(args: Array[String]) // def is a keyword private is keyword
  {
    var i=1
     while(i<3)  //while and true are both keyword 
    {
      val r=scala.io.StdIn.readLine(); //val is a keyword
      i=i+1
      printf("You entered : %s",r)
      if(r=="1") //if is a keyword
        printf("YOU ENTERED 1")
        else   // else is keyword
          println("NOT 1")
      println()
    };
    var a = 0 //var is a keyword
     do
     {
        i=i+1
     }
     while(i<10);
      // for loop execution with a range
      for( a <- 1 to 10){   //for is a keyword
         println( "Value of a: " + a );
      }
      
      var te=null  //null is keyword
      try {
// try is keyword
        } 
catch {  //catch is keyword
    
    case _: Throwable => println("Got some other kind of Throwable exception")  //case is keyword
} finally { //finally is keyword
  
}

  }
   private def functionToAdd(a :Int, b :Int): Int={    //private is keyword
    var sum: Int=0
   sum=a+b
    return sum //return is keyword
  }
}