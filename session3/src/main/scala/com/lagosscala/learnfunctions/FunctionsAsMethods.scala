package com.lagosscala.learnfunctions


/**
*
  * When functions are members of an object they are called Methods \
  * Example methods
  */
object FunctionsAsMethods extends App {


    def area(width: Int, breath: Int) : Int = {
      width * breath
    }

    /**Methods can house control statement and many other scala features**/
    def speak(name: String) : String = {
      if(name == "John"){
        s"My name is John"
      }else{
        s"You just renamed me as $name"
      }
    }

}

object FunctionAsMethodsApp extends App {
  println(FunctionsAsMethods.area(2, 3))
  println(FunctionsAsMethods.speak("John"))
  println(FunctionsAsMethods.speak("Abraham"))
}