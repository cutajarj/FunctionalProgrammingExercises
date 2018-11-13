package com.cutajarjames.exercise4

import scala.collection.JavaConverters._

/**
  * Write a function that looks for a system property "user.home",
  * if it doesn't exists it looks for "doc.home" and if doesn't exist
  * it looks for "appdata.home". The property should be returned in an option,
  * which is None if none of the properties are found.
  * The value should be ignored if it contains an empty string such as "" or "    "
  *
  * Examples:
  * System.setProperty("user.home", "/Users/cutajar")
  * System.setProperty("doc.home", "/documents")
  * System.setProperty("appdata.home", "/appdata")
  * findAHome() returns Some("/Users/cutajar")
  *
  * System.getProperties.remove("user.home")
  * System.setProperty("doc.home", "/documents")
  * System.setProperty("appdata.home", "/appdata")
  * findAHome() returns Some("/documents")
  *
  * System.getProperties.remove("user.home")
  * System.getProperties.remove("doc.home")
  * System.setProperty("appdata.home", "/appdata")
  * findAHome() returns Some("/appdata")
  *
  * System.getProperties.remove("user.home")
  * System.getProperties.remove("doc.home")
  * System.getProperties.remove("appdata.home")
  * findAHome() returns None
  *
  * System.setProperty("user.home", " ")
  * System.setProperty("doc.home", "   ")
  * System.setProperty("appdata.home", "")
  * findAHome() returns None
  */
class FindingHome {
  def findAHome(): Option[String] = Some("")
}
