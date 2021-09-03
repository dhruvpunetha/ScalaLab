package lab8clousure

object q2 {
  def main(args: Array[String])
 {
 val voting=18
 val isworthy=(age:Int)=> age>=voting
 val ans=isworthy(11)
 if(ans)
 {
   println("YES CAN VOTE")
 }
 else
 {
   println("CANNOT VOTE")
 }
 } 
}