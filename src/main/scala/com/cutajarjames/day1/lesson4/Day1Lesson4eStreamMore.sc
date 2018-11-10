val incSeq = Stream.from(1)
incSeq.take(10).toList

val squares = Stream.from(1).map(n => n * n)
squares.take(10).toList
squares(123)

val oddSquares = squares.filter(_ % 2 == 1)
oddSquares.take(10).toList

val randomNs = Stream.continually(math.random())
randomNs.take(10).toList
randomNs(123)
randomNs(123)
