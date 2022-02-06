def square(x:Double) = x * x
def abs(x:Double) = if x > 0 then x else -x

/** Calculate the Square root of Parameter x */
def sqrt(x:Float) = 
  def sqrIter(guess:Float): Float=
    if isGoodEnough(guess) then guess
    else sqrIter(improve(guess))


  def improve(guess:Float) =
    (guess+x/guess) / 2 

  def isGoodEnough(guess:Float) = 
    abs(guess*guess-x) < 0.001 
    
  
  sqrIter(1.0)



@main def test = println(sqrt(2))

test


