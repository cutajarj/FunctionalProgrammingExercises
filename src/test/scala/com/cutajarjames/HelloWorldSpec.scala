package com.cutajarjames

import org.scalatest.{FlatSpec, Matchers}

class HelloWorldSpec extends FlatSpec with Matchers {
  it should "validate that specs libs are properly installed" in {
    "Hello World" shouldEqual "Hello World"
  }
}
