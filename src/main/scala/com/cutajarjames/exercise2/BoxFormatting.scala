package com.cutajarjames.exercise2

/**
  * Write a function that takes a String input, splits the string on separate lines (separator "\n")
  * and returns a formatted string as shown in the examples.
  *
  * Assume the input's length is at least one character
  *
  * Examples:
  *       boxFormat(“Mary had a little Lamb”) returns:
  *       **********
  *       * Mary   *
  *       * had    *
  *       * a      *
  *       * little *
  *       * Lamb   *
  *       **********
  *
  *       boxFormat(“One”) returns:
  *       *******
  *       * One *
  *       *******
  *
  *       boxFormat(“1 2 3”) returns:
  *       *****
  *       * 1 *
  *       * 2 *
  *       * 3 *
  *       *****
  *
  */
class BoxFormatting {

  def boxFormat(input: String): String = {
    val words = input.split(" ")
    val maxLength = words.map(_.length).max
    val paddedWords = words
      .map(word => word + (" " * (maxLength - word.length)))
      .map(word => s"* $word *")
    val startEndLine = "*" * (maxLength + 4)
    (startEndLine +: paddedWords :+ startEndLine).mkString("\n")
  }

}
