package gradledemo

import shapeless._

object App {
  def main(args: Array[String]): Unit = {
    println(1 :: "a" :: true :: HNil)
  }
}
