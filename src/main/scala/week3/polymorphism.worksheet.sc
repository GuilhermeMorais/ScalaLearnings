import week3._

List(1, 2, 3)

List(List(true, false), List(3))

def singleton[T](elem: T) = new Cons[T](elem, new Nil[T])

val one = singleton[Int](1)
//Scala will infer the type
val oneInfer = singleton(1)
val bools = singleton[Boolean](true)

//Scala use type erasure: all type parameters and type arguments are removed before evaluating the program
// Java, Scala have that
// C# and F# doesn't have that.
