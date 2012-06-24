package kuhn

import processing.core._
import PConstants._
import PApplet._

class Main extends PApplet {
  
  override def setup {
    size(800, 800)
    colorMode(HSB, 100)
    frameRate(999)
    background(0)
    noLoop
  }

  override def draw {
    def pix(f:(Int, Int) => Unit) {
      for (x <- 0 until width; y <- 0 until height) f(x, y)
    }
    pix { (x, y) =>
      stroke(map(x, 0, width, 0, 100), map(y, 0, height, 0, 100), 100)
      point(x, y)
    }
  }
}

object Main {
  def main(args:Array[String]) {
    PApplet.main(Array("kuhn.Main"))
  }
}