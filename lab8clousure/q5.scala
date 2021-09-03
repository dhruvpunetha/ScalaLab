package lab8clousure
trait Dog
{
// Abstract method
def doggomethod
}
//Trait 2
trait Tailwagger
{
// Non-abstract method
def woof
{
println("woof woof")
}
}
trait Runner
{
// Non-abstract method
def run
{
println("i love to run")
}
}
// DemoClass inherits multiple traits
class Animal extends Dog with Tailwagger with Runner
{
// Implementation of abstract method
def doggomethod()
{
println("My name is Lucky the doggo")
}
} 



object q5 {
   def main(args: Array[String])
{
  val dogy = new Animal();
dogy.doggomethod
dogy.run
dogy.woof
}
}