package com.cutajarjames.exercise7

class SwapElements {
  def swapFirstAndSecond(list: List[Any]): List[Any] = list match {
    case x :: y :: t => y :: x :: t
    case l => l
  }
}
