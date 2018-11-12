val colours = Set("Yellow","Red","Green","Blue","Red","Orange")

colours.contains("Blue")

colours.exists(_ == "Blue")

colours.exists(_.length > 5)

colours.exists(_.length > 7)

colours.forall(_.length > 2)

colours.forall(_.length > 4)