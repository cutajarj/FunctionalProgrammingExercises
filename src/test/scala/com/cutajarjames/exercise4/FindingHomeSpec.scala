package com.cutajarjames.exercise4

import org.scalatest.{FlatSpec, Matchers}

class FindingHomeSpec extends FlatSpec with Matchers {
  it should "output the user.home" in {
    System.setProperty("user.home", "/Users/cutajar")
    System.setProperty("doc.home", "/documents")
    System.setProperty("appdata.home", "/appdata")
    (new FindingHome).findAHome() shouldEqual Some("/Users/cutajar")
  }

  it should "output the doc.home" in {
    System.getProperties.remove("user.home")
    System.setProperty("doc.home", "/documents")
    System.setProperty("appdata.home", "/appdata")
    (new FindingHome).findAHome() shouldEqual Some("/documents")
  }

  it should "output the /appdata" in {
    System.getProperties.remove("user.home")
    System.getProperties.remove("doc.home")
    System.setProperty("appdata.home", "/appdata")
    (new FindingHome).findAHome() shouldEqual Some("/appdata")
  }

  it should "output None if none of the properties are set" in {
    System.getProperties.remove("user.home")
    System.getProperties.remove("doc.home")
    System.getProperties.remove("appdata.home")
    (new FindingHome).findAHome() shouldEqual None
  }

  it should "output None if properties have a whitespace emtpy string" in {
    System.setProperty("user.home", " ")
    System.setProperty("doc.home", "   ")
    System.setProperty("appdata.home", "")
    (new FindingHome).findAHome() shouldEqual None
  }
}
