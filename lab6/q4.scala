package lab6

object q4 {
  def main(args: Array[String]){
    var L1 = List(1,1,3,3,4,5,6,5)
    var L2 =L1.distinct;
    println(" List without duplicates : ");
    for(a<-L2)
      print(a+" ");
    println();
    var a=4
    println("First index of a : "+L1.indexOf(a));
		println("First index of a : "+L1.indexOf(6, 0));
    
    println("Length of list : "+L1.length);
    println("Sorted List : ");
    for(i<-L1.sorted(Ordering.Int.reverse))
      println(i);
    println("Sum of collection : "+L1.sum);
    println("String of list : "+L1.toString());
    println("Min Element : "+L1.min);
    println("Max Element : "+L1.max);
    println("Last index of 3 : "+L1.lastIndexOf(3));
    println("Last index of 3 : "+L1.lastIndexOf(3,3));    
    println("Map : ");
    for(i<-(L1 zip List.range(1,7)).toMap)
      println(i);
  }  
}