val numbers = Array(5, 4, 3, 7, 2, 8)

def findMin(currMin: Int, index: Int = 0): Int = {
  if (index >= numbers.size) currMin
  else {
    val n = numbers(index)
    findMin(math.min(currMin, n), index + 1)
  }
}

findMin(Int.MaxValue)

numbers.foldLeft(Int.MaxValue)((currMin, n) => math.min(currMin, n))

numbers.foldLeft(0)((sum, n) => sum + n)

numbers.foldLeft(0)(_ + _)