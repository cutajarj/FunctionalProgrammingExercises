def commentOnName(name:Option[String]) = name match {
  case Some("James") => "James is a nice name"
  case Some(x) => s"$x is also a nice name"
  case None => "Faceless man?"
}

commentOnName(Some("James"))

commentOnName(Some("Ruth"))

commentOnName(None)


