package com.cutajarjames.exercise4

import org.scalatest.{FlatSpec, Matchers}

class SecretSantaSpec extends FlatSpec with Matchers {
  it should "output the correct pairing for 3 items" in {
    val pairing = (new SecretSanta).generateGiftPairing(List("James", "Ruth", "Isabel"))
    pairing.keys shouldEqual Set("James", "Ruth", "Isabel")
    pairing.values.size shouldEqual 3
    pairing.values.toSet shouldEqual Set("James", "Ruth", "Isabel")
    pairing.foreach{case (v,k) => v shouldNot be(k)}
  }

  it should "output the correct pairing for 10 items" in {
    val pairing = (new SecretSanta).generateGiftPairing(List("a", "b", "c", "d", "e", "f", "g", "h", "i", "k"))
    pairing.keys shouldEqual Set("a", "b", "c", "d", "e", "f", "g", "h", "i", "k")
    pairing.values.size shouldEqual 10
    pairing.values.toSet shouldEqual Set("a", "b", "c", "d", "e", "f", "g", "h", "i", "k")
    pairing.foreach{case (v,k) => v shouldNot be(k)}
  }

  it should "output self pairing in case of one name" in {
    val pairing = (new SecretSanta).generateGiftPairing(List("James"))
    pairing.size shouldEqual 1
    pairing.get("James") should contain("James")
  }

}
