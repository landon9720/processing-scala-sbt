package kuhn

import processing.core._
import PConstants._

class Main extends PApplet {
  
  override def setup {
    size(200, 200)
    colorMode(HSB)
    frameRate(10)
    loop
  }
  
  var r:Float = 0

  override def draw {
    background(0)
    
    translate(width / 2, height / 2)
    rotate(r)
    
    fill(50)
    stroke(0)
    strokeWeight(3)
    rect(-width / 2, -height / 2, width, height)
    
    r += PI / 100
  }
}

object Main {
  def main(args:Array[String]) {
    PApplet.main(Array("kuhn.Main"))
  }
}