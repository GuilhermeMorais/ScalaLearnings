val x = 0
def f(y: Int) = y + 1

val result = {
  val x = f(3);
  x * x
} + x
// x on line 7 is ZERO.
