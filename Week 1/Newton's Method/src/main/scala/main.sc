def square(x:Double) = x * x
def abs(x:Double) = if x > 0 then x else -x

/** Calculate the Square root of Parameter x */
def sqrt(x:Float) = {
  def sqrIter(guess:Float,x:Float): Float=
    if isGoodEnough(guess,x) then guess
    else sqrIter(improve(guess,x),x)


  def improve(guess:Float,x:Float) =
    (guess+x/guess) / 2 

  def isGoodEnough(guess:Float,x:Float) = 
    abs(guess*guess-x) < 0.001 
    
  
  sqrIter(1.0,x)
}


@main def test = println(sqrt(2))

test