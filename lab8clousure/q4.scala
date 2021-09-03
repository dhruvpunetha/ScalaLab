package lab8clousure
trait mTrait1
{
// Abstract method
def AbstractMethod
}
//Trait 2
trait Trait2
{
// Non-abstract method
def nonAbstractMethod
{
println("Hi")
}
}
// DemoClass inherits multiple traits
class DemonClass extends mTrait1 with Trait2
{
// Implementation of abstract method
def AbstractMethod() 
{
println("My name is what")
}
} 
object q4 {
  def main(args: Array[String])
{
val demoClassObj = new DemonClass();
demoClassObj.AbstractMethod
demoClassObj.nonAbstractMethod
} 
}