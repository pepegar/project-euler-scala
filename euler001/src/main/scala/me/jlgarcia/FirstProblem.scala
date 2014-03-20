package me.jlgarcia

class FirstProblem {

  def getMultiples(i: Int) : IndexedSeq[Int] = {
    1 to 1000 filter {
      _ % i == 0
    }
  }

  def getSum(set: Set[Int]) : Int = {
    set.foldLeft(0)(_+_)
  }
  
}
