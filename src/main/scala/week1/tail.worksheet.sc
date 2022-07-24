import scala.annotation.tailrec
def gcd(a: Int, b: Int): Int =
  if (b == 0) a else gcd(b, a % b)

gcd(14, 21)
14 % 21
21 % 14
14 % 7

def factorial(n: Int): Int =
  if (n == 0) 1 else n * factorial(n - 1)

factorial(4)
factorial(5)

def tailFactorial(n: Int): Int = {
  def loop(acc: Int, n: Int): Int =
    if (n == 0) acc
    else loop(acc * n, n - 1)
  loop(1, n)
}

tailFactorial(4)
tailFactorial(5)
