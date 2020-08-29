case class FirstName(val fisrst_name:String) extends AnyVal
case class LastName(val last_name:String) extends AnyVal
case class Age(val age:Int) extends AnyVal
object info{
  def displatDetails(args:Array[String])
  {val first_name=new FirstName(readLine())
    val last_name=new LastName(readLine())
    val age=new Age(scala.io.StdIn.readInt())
    println(s"$first_name $last_name is $age years old")
    }
  }