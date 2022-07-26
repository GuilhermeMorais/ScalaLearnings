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
  def max(that: Rational) = if (this.less(that)) that else this
}

//Without simplification  on the denominator before hand
class Rational2(x: Int, y: Int) {

  require(y != 0, "denominator must be nonzero")
  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
  val numer = x
  val demon = y

  def add(that: Rational2) =
    new Rational2(numer * that.demon + that.numer * demon, demon * that.demon)
  def neg: Rational2 = new Rational2(-numer, demon)
  def sub(that: Rational2) = add(that.neg)
  override def toString(): String = {
    val g = gcd(this.numer, this.demon)
    return s"${numer / g}/${demon / g}"
  }

  def less(that: Rational2) = this.numer * that.demon < that.numer * this.demon
  def max(that: Rational2) = if (this.less(that)) that else this

}

val x = new Rational(1, 3)
var y = new Rational(5, 7)
val z = new Rational(3, 2)

x.sub(y).sub(z)
y.add(y)
x.less(y)
x.max(y)

// var strange = new Rational(1, 0) Expected to throw an Illegal Exception
// strange.add(strange)

new Rational(2)
