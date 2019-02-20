package com.cutajarjames.exercise5

case class CurrencyAmount(currency: String, amount: Double)

case class RateToDollar(currencySrc: String, rate: Double)

class CurrencyManager(rates: List[RateToDollar]) {

  /**
    * Implement this function that converts the currency amount passed in to the target currency
    * The conversion should be done using the list of rates (to dollar) passed in the constructor
    *
    * If the list of rates doesn't have the target or source currency, it should return None
    *
    * Examples:
    *
    * val cm = new CurrencyManager(List(RateToDollar("USD", 1.0), RateToDollar("EUR", 1.13), RateToDollar("GBP" -> 1.30)))
    * cm.convert(CurrencyAmount("GBP",520.45), "EUR") should return Some(CurrencyAmount("EUR",598.75))
    * cm.convert(CurrencyAmount("GBP",520.45), "DKK") should return None
    */
  def convert(money: CurrencyAmount, toCurrency: String): Option[CurrencyAmount] = {
    Some(CurrencyAmount("", 0.0))
  }
}
