package com.knoldus

import scala.annotation.tailrec

class SquareList {

  def squareListUsingMap(enteredList: List[Int]): List[Int] = enteredList.map(eachElement => eachElement * eachElement)

  @tailrec
  final def squareListUsingPatternMatching(enteredList: List[Int], accumulator: List[Int] = List()): List[Int] =
    enteredList match {
      case List() => accumulator
      case headOfList :: tailOfList => squareListUsingPatternMatching(tailOfList, accumulator :+ (headOfList * headOfList))
    }
}