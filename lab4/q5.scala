package lab4

object q5 {
  def main(args:Array[String])
  {
    println("inline")
   //var va:Int=10    
    //va=inc(va)
   /* def inc(x:Int): Int =x+1
    var fa=inc _
    printf("Answer after increment "+fa(10))*/
    var icre=(x:Int)=>x+1
    println(icre(12))//increment func
    val add = (x: Int, y: Int) => x + y
    println(add(1, 2))
    var isI0=(x:Int)=> x==0
    println(isI0(1))
  }
}