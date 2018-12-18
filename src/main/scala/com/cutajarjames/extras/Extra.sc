//Equalitiy

val list1 = List("James", "Ruth", "Tom")

val list2 = List("James", "Ruth", "Tom")

list1 == list2

list1.equals(list2)

list1.eq(list2) //== in Java

val listExtra = "Rob" +: list1

listExtra == list1

listExtra.eq(list1)

listExtra.tail

listExtra.tail == list1

listExtra.tail.eq(list1)
