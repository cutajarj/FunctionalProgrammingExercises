/* case class Account(username: String, password: String)

case class UserAccount(override val username: String,
                       override val password: String,
                       fullName: String, age: Option[Int]) extends Account(username, password)

case class AdminAccount(override val username: String,
                       override val password: String,
                       fullName: String, permissions: List[String]) extends Account(username, password)
DOES NOT COMPILE!!
*/

abstract class Account(username: String, password: String)

case class UserAccount(username: String,
                       password: String,
                       fullName: String, age: Option[Int]) extends Account(username, password)

case class AdminAccount(username: String,
                        password: String,
                        fullName: String, permissions: List[String]) extends Account(username, password)

val admin = AdminAccount("admin", "abc", "The Big boss", List())
