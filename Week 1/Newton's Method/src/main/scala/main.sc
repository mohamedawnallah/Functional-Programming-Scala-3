import math._
/** Calculate the Square root of Parameter x */

def sqrIter(guess:Float,x:Float): Float=
  if isGoodEnough(guess,x) then guess
  else sqrIter(improve(guess,x),x)


def improve(guess:Float,x:Float) =
  (guess+x/guess) / 2 

def isGoodEnough(guess:Float,x:Float) =
  math.abs(guess*guess-x) < 0.001 
  


sqrIter(1.41321985816,0.001)
