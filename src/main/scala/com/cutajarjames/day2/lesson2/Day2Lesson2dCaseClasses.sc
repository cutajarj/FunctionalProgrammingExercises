case class UserAccount(username: String, password: String, fullName: String, age: Option[Int])

val account1 = UserAccount("cutajarj", "123456", "James Cutajar", None)

val account2 = UserAccount("cutajarj", "123456", "James Cutajar", None)
val account3 = UserAccount("blogsj", "dfsdfs", "Joe Blogs", Some(25))

account1 == account2
account1 == account3
account1.toString

account1.fullName

//Immutability!!!
//account1.fullName = "fgdfg"

val account4 = account1.copy(fullName = "James Smith")
account1

val nextYeasAccounts = List(account1, account2, account3)
  .map { acc =>
    val newAge = acc.age.map(_ + 1)
    acc.copy(age = newAge)
  }

