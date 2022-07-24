//Classes are evaluated as a Value.
class Rational(x: Int, y: Int) {

  require(y != 0, "denominator must be nonzero")
  // Second constructor
  def this(x: Int) = this(x, 1)

  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
  private val commonDenominator = gcd(x, y)
  val numer = x / gcd(x, y)
  val demon = y / gcd(x, y)

  def add(that: Rational) =
    new Rational(numer * that.demon + that.numer * demon, demon * that.demon)
  def neg: Rational = new Rational(-numer, demon)
  def sub(that: Rational) = add(that.neg)
  override def toString(): String = s"${numer}/${demon}"

  def less(that: Rational) = this.numer * that.demon < that.numer * this.demon
  def <(that: Rational) = this.numer * that.demon < that.numer * this.demon
  def max(that: Rational) = if (this < that) that else this

  def +(that: Rational) = add(that)
  def -(that: Rational) = this + -that

  // replace the neg Operation!
  def unary_- : Rational = new Rational(-numer, demon)
}

val x = new Rational(1, 3)
var y = new Rational(5, 7)
val z = new Rational(3, 2)

x.sub(y).sub(z)
y.add(y)
x.less(y)
x.max(y)

y + y
x - y - z
-x
x < y

//Wrong
//(((((((a + b) ^?) c) ?^) d) less) a) ==> (b | c)

//Correct
//((a + b) ^? (c ?^ d)) less ((a ==> b) | c)
