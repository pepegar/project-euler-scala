package me.jlgarcia

import org.scalatest.{WordSpec, Matchers}

class FirstProblemSpec extends WordSpec with Matchers {
  "FirstProblem" should {
    val first = new FirstProblem

    "return all the multiples of three" in {
      val multiplesOfThree = first.getMultiples(3)

      multiplesOfThree.length should be (333)
    }

    "return all the multiples of five" in {
      val first = new FirstProblem
      val multiplesOfFive = first.getMultiples(5)

      multiplesOfFive.length should be (200)
    }

    "return the sum of all the multiples of three an five" in {
      val multiplesOfFive = first.getMultiples(5)
      val multiplesOfThree = first.getMultiples(3)
      val allNumbers = IndexedSeq.concat(multiplesOfThree, multiplesOfFive)
      val multiplesOfThreeAndMultiplesOfThree = collection.SortedSet(allNumbers: _*).toSet
      first.getSum(multiplesOfThreeAndMultiplesOfThree) should be (234168)
    }
  }
}
