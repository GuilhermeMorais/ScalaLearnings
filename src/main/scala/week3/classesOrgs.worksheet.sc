//(willcard import)To import everything use:
// import week3._

//(named import)To import a group of classes use:
// import week3.{Rational, Hello}

//(named import)this way you import the Rational class to the Worksheet, same as java/c#
import week3.Rational

//if you want to use the namespace all the time.
new week3.Rational(1, 2)
new Rational(1, 2)

//trait is like an interface on c# which can have implementations
trait Planar {
  // abstract values
  def height: Int
  def width: Int

  // this is a concrete method
  def surface = height * width
}

abstract class Shape {}

//Example
class Square(side: Int) extends Shape with Planar {
  def height: Int = side
  def width: Int = side
}

//There is a Nothing value on Scala :FacePalm:

//throw an exception: throw Exc
def error(msg: String) = throw new Error(msg)

//There is a Null class for all refVal classes :FacePalm:
//val x = null
//val y: String = x
