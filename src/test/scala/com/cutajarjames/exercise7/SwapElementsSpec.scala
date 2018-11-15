package com.cutajarjames.exercise7

import org.scalatest.{FlatSpec, Matchers}

class SwapElementsSpec extends FlatSpec with Matchers {
  it should "swap the first two elements with list of 4 items" in {
    (new SwapElements).swapFirstAndSecond(List(1, 2, 3, 4)) shouldEqual List(2, 1, 3, 4)
  }

  it should "not swap anything if the list is one element" in {
    (new SwapElements).swapFirstAndSecond(List(9)) shouldEqual List(9)
  }

  it should "not swap anything if the list is empty" in {
    (new SwapElements).swapFirstAndSecond(List()) shouldEqual List()
  }

  it should "swap the first two elements with list of 2 items" in {
    (new SwapElements).swapFirstAndSecond(List(5, 9)) shouldEqual List(9, 5)
  }
}
