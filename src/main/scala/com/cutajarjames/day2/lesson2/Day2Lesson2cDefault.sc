class Dog(name: String, age: Int) {
  def this(name: String) = {
    this(name, 0)
  }

  def woof(): String = s"Woof! my name is $name"

}

val d = new Dog("Fido")

class Dog2(name:String, age:Int = 0) {

  def woof(): String = s"Woof! my name is $name"
}

val d1 = new Dog2("Fido", 8)

val d2 = new Dog2("Fido")

def sayHello(name:String = "no name") = s"Hello $name"

sayHello()

class Dog3(name:String, age:Int = 0) {

  override def toString: String = s"Woof! my name is $name"
}

val d3 = new Dog3("Fido")
