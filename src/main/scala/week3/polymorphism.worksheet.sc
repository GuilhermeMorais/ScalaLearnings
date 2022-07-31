import week3._

List(1, 2, 3)

List(List(true, false), List(3))

def singleton[T](elem: T) = new Cons[T](elem, new Nil[T])

def nth[T](pos: Int, llist: List[T]): T = {

  if (pos == 0) llist.head
  else if (llist.isEmpty)
    throw new IndexOutOfBoundsException("go guess somewhere else, mate")
  else nth(pos - 1, llist.tail)
  // if (pos < 0) throw new InderOutOfBoundsException("?")
  // if (llist.isEmpty) throw new InderOutOfBoundsException("?")
}

val one = singleton[Int](1)
//Scala will infer the type
val oneInfer = singleton(1)
val bools = singleton[Boolean](true)

//Scala use type erasure: all type parameters and type arguments are removed before evaluating the program
// Java, Scala have that
// C# and F# doesn't have that.

val listA = new Cons(1, new Cons(2, new Cons(3, new Nil)))

nth(1, listA)
nth(4, listA)
