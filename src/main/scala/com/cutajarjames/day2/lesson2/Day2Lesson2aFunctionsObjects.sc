val myFunction = (s: String) => s.toInt

def parseInt(s: String): Int = s.toInt

val myFunction2: String => Int = parseInt

myFunction("3")

myFunction2("3")

//In math we say "Function f is applied to 3"
myFunction2.apply("3")

//What about objects becoming functions?