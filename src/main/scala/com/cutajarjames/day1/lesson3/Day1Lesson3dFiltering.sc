val colours = Set("Yellow","Red","Green","Blue","Red","Orange")

colours.filter(c => c.length > 4)

colours.filter(_ == "Blue")

colours.filter(_.equals("Blue"))

colours.filter(_ != "Blue")

colours.filterNot(_ == "Blue")
