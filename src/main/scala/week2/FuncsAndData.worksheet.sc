class Rational(x: Int, y: Int) {
  def numer = x
  def demon = y

  // Created after the addRational func bellow.
  def add(that: Rational) =
    new Rational(numer * that.demon + that.numer * demon, demon * that.demon)

  // Created after the makeString func
  override def toString(): String = s"${numer}/${demon}"

  // My initial way was :new Rational(-1 * numer, -1 * demon)
  def neg: Rational = new Rational(-numer, demon)

  // Same as the teacher.
  def sub(that: Rational) = add(that.neg)
}

val x = new Rational(1, 3)
var y = new Rational(5, 7)
val z = new Rational(3, 2)

x.numer
x.demon

def addRational(r: Rational, s: Rational): Rational = {
  new Rational(r.numer * s.demon + s.numer * r.demon, r.demon * s.demon)
}

def makeString(r: Rational) = s"${r.numer}/${r.demon}"

makeString(addRational(new Rational(1, 2), new Rational(2, 3)))

makeString(x.add(y))
x.add(y)

var zMinus = new Rational(-3, -2)
var zMinus2 = z.neg

//Validating function SUB
var value1 = new Rational(2, 5)
var value2 = new Rational(4, 7)
value2.sub(value1)

x.sub(y).sub(z)
