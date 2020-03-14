package com.lagosscala

object PatternMatchingEx extends App {

  //simple constant patterns ( match is an expression )
  def matchIt(x : Any) : Unit = x match {
    case 10 => println(s"Got a number $x")
    case true => println(s"Got a boolean $x")
    case 2.0 => println(s"got a double $x")
    case _ =>println(s"you are on your own $x")
  }
  matchIt(false)

  //variable loads
  def wordsAndOpposite(word : String): String = ???

  def wordsAndOpposite2(word : String) : String  = ???

  //Typed Pattern Matches
  /*
  * object obj = "A String Value";
  * if(obj instanceOf String) { do something }
  */
  def describeType(x : Any) = ???

  //Guards - Adds a predicate to a pattern match on the left side
  def describeNumber(num : Int) : String = ???



  //match tuples
  def matchTuple3(tup3 : (Int , Boolean , String)) : String = tup3 match {
    case(1,flag,strVal)=>s"Turple consists of [ 1 ] followed by [$flag] followed by [ $strVal]"
    case(i,false,"yemi")=>s"Turple consists of [ $i ] followed by [false] followed by [yemi]"
    case(a,b,c)=>s"Turple consists of [ $a ] followed by [$b] followed by [ $c]"

  }
  println(s"${matchTuple3(3,false,"hello")}")

  // pattern matching with case classes



  //pattern match with Val on tuples / case class ( Extractors )

  //for and pattern matching
}
