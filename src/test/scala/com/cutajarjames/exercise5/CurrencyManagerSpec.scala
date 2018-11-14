package com.cutajarjames.exercise5

import org.scalatest.{FlatSpec, Matchers}

class CurrencyManagerSpec extends FlatSpec with Matchers {

  it should "usd to usd should remain unchanged" in {
    val manager = new CurrencyManager(List(RateToDollar("USD", 1.0),
      RateToDollar("EUR", 1.13),
      RateToDollar("GBP", 1.30)))

    manager.convert(CurrencyAmount("USD",520.45), "USD") shouldEqual Some(CurrencyAmount("USD",520.45))
  }

  it should "usd to dkk should return none if rate does not exist" in {
    val manager = new CurrencyManager(List(RateToDollar("USD", 1.0),
      RateToDollar("EUR", 1.13),
      RateToDollar("GBP", 1.30)))

    manager.convert(CurrencyAmount("USD",520.45), "DKK") shouldEqual None
  }

  it should "dkk to usd should return none if rate does not exist" in {
    val manager = new CurrencyManager(List(RateToDollar("USD", 1.0),
      RateToDollar("EUR", 1.13),
      RateToDollar("GBP", 1.30)))

    manager.convert(CurrencyAmount("DKK",520.45), "USD") shouldEqual None
  }


  it should "gbp to usd should work correctly" in {
    val manager = new CurrencyManager(List(RateToDollar("USD", 1.0),
      RateToDollar("EUR", 1.13),
      RateToDollar("GBP", 1.30)))

    val result = manager.convert(CurrencyAmount("GBP",520.45), "USD")
    result.map(c => (math rint c.amount * 100) / 100) shouldEqual Some(676.58)
    result.map(_.currency) shouldEqual Some("USD")
  }

  it should "gbp to eur should work correctly" in {
    val manager = new CurrencyManager(List(RateToDollar("USD", 1.0),
      RateToDollar("EUR", 1.13),
      RateToDollar("GBP", 1.30)))

    val result = manager.convert(CurrencyAmount("GBP",520.45), "EUR")

    result.map(c => (math rint c.amount * 100) / 100) shouldEqual Some(598.75)
    result.map(_.currency) shouldEqual Some("EUR")

  }


}
