class Dog(name: String, age: Int) {
  def woof(): String = s"Woof! my name is $name"

  def humanAge:Int = age * Dog.DogYears //7
}

//This is called the companion object
object Dog {
  private val DogYears = 7

  def apply(name: String, age: Int): Dog = new Dog(name, age)
}

val myDog = new Dog("Fido", 7)
myDog.woof()

val opt = Some("abc")

val opt1 = new Some("abc")

val opt2 = Some.apply("abc")

val myDog2 = Dog("Bobo", 4)

