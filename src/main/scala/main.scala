package kuhn

import processing.core._
import PConstants._

class Main extends PApplet {
  
  override def setup {
    size(500, 500)
    colorMode(HSB, 100)
    frameRate(60)

    background(0)

    loop
  }

  override def draw {

    
    translate(width / 2, height / 2)
    rotate(frameCount / 100f)
    
    fill(50)
    stroke(100)
    strokeWeight(3)
    rect(-width / 4, -height / 4, width / 2, height / 2)
    
  }
}

object Main {
  def main(args:Array[String]) {
    PApplet.main(Array("kuhn.Main"))
  }
}