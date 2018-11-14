package com.cutajarjames.exercise5

case class CurrencyAmount(currency: String, amount: Double)

case class RateToDollar(currencySrc: String, rate: Double)

class CurrencyManager(rates: List[RateToDollar]) {

  def convert(money: CurrencyAmount, toCurrency: String): Option[CurrencyAmount] = {
    Some(CurrencyAmount("", 0.0))
  }
}
