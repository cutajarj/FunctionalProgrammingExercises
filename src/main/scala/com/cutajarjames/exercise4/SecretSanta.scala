package com.cutajarjames.exercise4

/**
  * Implement the secret santa algorithm.
  * The method accepts a list of names and outputs a random pairing, of who's buying
  * a xmas present to whom.
  * Everyone should buy and receive only one gift
  *
  * Examples:
  * generateGiftPairing(List("James", "Ruth", "Isabel") should return a random pairing such as
  * Map("Ruth" -> "James", "Isabel" -> "Ruth", "James" -> "Isabel")
  */
class SecretSanta {
  def generateGiftPairing(names: List[String]): Map[String, String] = {
    Map("no" -> "no")
  }
}

