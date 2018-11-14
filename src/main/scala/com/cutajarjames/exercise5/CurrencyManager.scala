package com.cutajarjames.exercise5

case class CurrencyAmount(currency: String, amount: Double)

case class RateToDollar(currencySrc: String, rate: Double)

class CurrencyManager(rates: List[RateToDollar]) {
  val conversionTable: Map[String, Double] = rates.map(r => r.currencySrc -> r.rate).toMap

  def convert(money: CurrencyAmount, toCurrency: String): Option[CurrencyAmount] = {
    val rateToDollar = conversionTable.get(money.currency)
    val moneyInDollars = rateToDollar.map(r => money.copy(amount = money.amount * r))
    val dollarToTargetRate = conversionTable.get(toCurrency).map(r => 1 / r)

    moneyInDollars.flatMap(dollar => dollarToTargetRate
      .map(r => dollar.copy(amount = dollar.amount * r, currency = toCurrency)))
  }
}
