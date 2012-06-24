package kuhn

import processing.core._
import PConstants._

class Main extends PApplet {
  
  override def setup {
    size(500, 500)
    colorMode(HSB, 100)
    frameRate(60)
    loop
  }
  
  var r:Float = 0

  override def draw {
    background(0)
    
    translate(width / 2, height / 2)
    rotate(r)
    
    fill(50)
    stroke(100)
    strokeWeight(3)
    rect(-width / 4, -height / 4, width / 2, height / 2)
    
    r += PI / 50
  }
}

object Main {
  def main(args:Array[String]) {
    PApplet.main(Array("kuhn.Main"))
  }
}