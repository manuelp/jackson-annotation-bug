package it.example.jacksonAnnotationBug

import it.example.jacksonAnnotationBugLib.Animal
import it.example.jacksonAnnotationBugLib.Animal._

object Main extends App {
  val mason: Animal = Skunk("Mason")

  println(s"Hello: ${mason.toString}")
}
