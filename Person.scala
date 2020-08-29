class Person(val name: String) extends Ordered [Person]{
    override def toString = name
    def compare(that: Person) =
    this.name compare that.name
}
class PersonAge(val age: Int) extends Ordered [PersonAge] {def compare(that: PersonAge) =this.age compare that.age}
object test{
  def main(args:Array[String]){
    var personOne = new Person(readLine())
    var personTwo = new Person(readLine())
    val personOneAge=new PersonAge(scala.io.StdIn.readInt())
    val personTwoAge=new PersonAge(scala.io.StdIn.readInt())
     if((personOne compare personTwo)!=0){println(personOneAge compare personTwoAge)}
     else println(personOne compare personTwo)
    }
}