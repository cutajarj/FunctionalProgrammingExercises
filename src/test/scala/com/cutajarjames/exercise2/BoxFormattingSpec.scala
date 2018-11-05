package com.cutajarjames.exercise2

import org.scalatest.{FlatSpec, Matchers}

class BoxFormattingSpec extends FlatSpec with Matchers {

  it should "output correctly if input has only one word" in {
    (new BoxFormatting).boxFormat("One") shouldEqual "*******\n* One *\n*******"
  }

  it should "output correctly if input has multple single length words" in {
    (new BoxFormatting).boxFormat("1 2 3") shouldEqual "*****\n* 1 *\n* 2 *\n* 3 *\n*****"
  }

  it should "output correctly if input has multple variable length words" in {
    (new BoxFormatting).boxFormat("Mary had a little Lamb") shouldEqual "**********\n* Mary   *\n* had    *\n* a      *\n* little *\n* Lamb   *\n**********"
  }

}
