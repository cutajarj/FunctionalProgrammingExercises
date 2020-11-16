
val x = -5

Option(x).filter(x => x > 0)

Option.when(x > 0)(x)

Option.unless(x > 0)(x)

def fact(x:Int): Int = if (x == 1) 1 else x * fact(x - 1)

fact(5)

Option.when(x > 0)(fact(x))

//Option(fact(x)).filter(x => x > 0)
