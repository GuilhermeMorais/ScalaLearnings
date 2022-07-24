import java.io.DataOutput
import math.abs

val tolerance = 0.0001
def isCloseEnough(x: Double, y: Double) = {
  abs((x - y) / x) / x < tolerance
}
def fixedPoint(f: Double => Double)(firstGuess: Double) = {
  def iterate(guess: Double): Double = {
    printf("guess = " + guess)
    val next = f(guess)
    if (isCloseEnough(guess, next)) next
    else iterate(next)
  }
  iterate(firstGuess)
}

fixedPoint(x => 1 + x / 2)(1)

def sqrt(x: Double) = fixedPoint(y => (y + x / y) / 2)(1)
sqrt(2)
sqrt(16)
sqrt(144)

def averageDamp(f: Double => Double)(x: Double) = (x + f(x)) / 2

def sqrtNew(x: Double) = fixedPoint(averageDamp(y => x / y))(1)
sqrtNew(16)
sqrtNew(144)
