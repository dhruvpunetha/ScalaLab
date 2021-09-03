package lab8clousure
trait Trait1
{
// Abstract method
def abstractMethod
// Non-abstract method
def nonAbstractMethod
{ 
println("I AM NON ABSTRACT" +
" NICE TO MEET YA")
}
} 
class DemoClass extends Trait1
{
def abstractMethod()
{
println("I AM ABSTRACT")
}
} 

object q3 {
  def main(args: Array[String])
{
val printVal = new DemoClass();
printVal.abstractMethod
printVal.nonAbstractMethod
} 
}