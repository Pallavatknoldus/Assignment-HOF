package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class SquareListTest extends AnyFlatSpec {

  val square = new SquareList

  "A condition" should "be correct for map function if list is not empty" in {
    assert(List(1, 9, 4, 25, 16, 49, 36) == square.squareListUsingMap(List(1, 3, 2, 5, 4, 7, 6)))
  }
  "A condition" should "be correct for map function if list is empty" in {
    assert(List() == square.squareListUsingMap(List()))
  }
  "A condition" should "be correct for match function if list is not empty" in {
    assert(List(1, 9, 4, 25, 16, 49, 36) == square.squareListUsingPatternMatching(List(1, 3, 2, 5, 4, 7, 6)))
  }
  "A condition" should "be correct for match function if list is empty" in {
    assert(List() == square.squareListUsingPatternMatching(List()))
  }
}