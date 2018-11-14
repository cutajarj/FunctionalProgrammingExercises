package com.cutajarjames.day2.lesson2

class Cat (name: String, age: Int) {
  def meow(): String = s"Meow! my name is $name"

  def humanAge:Int = age * Cat.CatYears
}

object Cat {
  private val CatYears = 7

  def apply(name: String, age: Int): Cat = new Cat(name, age)
}
