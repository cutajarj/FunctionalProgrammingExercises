val str = "James"

def justVowels(s: String): Seq[Char] =
  s.toSeq.filter(c => "aeiou".contains(c))


justVowels("James")

val names = List("James", "Ruth", "Judith")

names.map(n => justVowels(n).toList)

names.flatMap(n => justVowels(n))

names.map(justVowels).flatten
