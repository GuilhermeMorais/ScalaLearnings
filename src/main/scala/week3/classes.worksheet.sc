abstract class IntSet {
  def incl(x: Int): IntSet
  def contains(x: Int): Boolean
  def union(other: IntSet): IntSet
}

//Class example
class Empty extends IntSet {
  def contains(x: Int): Boolean = false
  def incl(x: Int): IntSet = new NonEmpty(x, new Empty, new Empty)
  def union(other: IntSet): IntSet = other

  override def toString(): String = "."
}

//This Class works as a singleton
// singletons are already a value on Scala
// Attention: when is a singleton object you don't need to use new
// down point: you will not see the toString() Call :(
object Empty2 extends IntSet {
  def contains(x: Int): Boolean = false
  def incl(x: Int): IntSet = new NonEmpty(x, new Empty, new Empty)

  def union(other: IntSet): IntSet = other

  override def toString(): String = "."
}

class NonEmpty(elem: Int, left: IntSet, right: IntSet) extends IntSet {
  def contains(x: Int): Boolean = {
    if (x < elem) left contains (x)
    else if (x > elem) right contains (x)
    else true
  }
  def incl(x: Int): IntSet = {
    if (x < elem) new NonEmpty(elem, left incl (x), right)
    else if (x > elem) new NonEmpty(elem, left, right incl (x))
    else this
  }
  def union(other: IntSet): IntSet = {
    ((left union right) union other) incl elem
  }

  override def toString(): String = "{" + left + elem + right + "}"
}

val t1 = new NonEmpty(3, new Empty, new Empty)
val t2 = t1.incl(4)
val t3 = t2 incl 10 //Another way to call the function
val t4 = t3 incl 7

//Dynamic Method Dispatch
