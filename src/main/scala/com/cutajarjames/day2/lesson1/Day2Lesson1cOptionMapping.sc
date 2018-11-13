val middleName = Some("Arthur")

val name = "Eric"

val surname = "Blair"

if (middleName.isDefined)
  s"$name ${middleName.get} $surname"
else s"$name $surname"

val middleName1 = None

if (middleName1.isDefined)
  s"$name ${middleName.get} $surname"
else s"$name $surname"

middleName.map(mn => s"$name $mn $surname")
  .getOrElse(s"$name $surname")

s"$name ${middleName.getOrElse("")} $surname"

//If .isDefined should ring alarm bells!
