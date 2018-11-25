val priceList = Map("Lettuce" -> 100.0,
  "Mushrooms" -> 150.0,
  "Peppers" -> 120.0,
  "Onion" -> 130.0)

priceList("Onion")

//priceList("Carrot")

priceList.get("Onion")

priceList.get("Carrot")

val shoppingList = List("Lettuce", "Onion", "Tomato")

shoppingList.map(item => priceList.get(item))

shoppingList.map(priceList.get(_))

shoppingList.map(priceList.get)

shoppingList.flatMap(priceList.get)

shoppingList.flatMap(priceList.get).sum
