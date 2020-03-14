package com.lagosscala

object ControlStructuresEx  extends App{
//println("A simple for loop from 1 to 5 inclusive")
//  for(numberOfCounts <-1 to 5){
//    println(s"Number of donuts to buy = $numberOfCounts")
//  }

//  for(numberOfCounts <-1 to 10 by 2){
//    println(s"Number of donuts to buy = $numberOfCounts");
//  }
//  for(numberOfCounts <-1 until 10 by 3){
//    println(s"Number of donuts to buy = $numberOfCounts");
//  }

  val donutIngredients = List("Sugar", "flour", "egg york", "syrup", "flavorings")
//  for(i <- donutIngredients if i == "Sugar"){
//    println(s"found: $i")
//
//  }
//  for(i <- 0 to 40 if i%2 !=0){
//    println(s"odd numbers: $i")
//  }
  var anInt = 8
  while (anInt>2){
    println(anInt)
    anInt = anInt -1
  }

}
