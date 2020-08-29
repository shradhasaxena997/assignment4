import scala.collection.mutable.ArrayBuffer
  abstract class IntQueue {
    def get(): Int
    def put(x: Int)
   }
  class BasicIntQueue extends IntQueue {
    private val buf = new ArrayBuffer[Int]
    def get() = buf.remove(0)
    def put(x: Int) { buf += x }
   }
  trait Doubling extends IntQueue { abstract override def put(x: Int) { super.put(2 * x) } }
  trait Squaring extends IntQueue { abstract override def put(x: Int) { super.put(x * x) } }
  class DoubleQueue extends BasicIntQueue with Doubling
  class SquaredQueue extends BasicIntQueue with Squaring
  object queue{
   def main(args:Array[String]){
     val queue1 = new DoubleQueue
     val queue2 = new SquaredQueue
     queue1.put(scala.io.StdIn.readInt())
     println(queue1.get())
     queue2.put(scala.io.StdIn.readInt())
     println(queue2.get())
     }
 }  
     

   
   
  
 