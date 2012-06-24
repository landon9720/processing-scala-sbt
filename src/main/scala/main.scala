import processing.core._;

object ProcessingTest extends PApplet {
  
  override def setup {
    colorMode(HSB, 100)
    size(400, 400)
    loop
  }

  override def draw():Unit = {
    background(50)
    translate(width / 2, height / 2)
    ellipse(0, 0, 100, 100)
  }

  def main(args: Array[String]): unit = {
    var frame = new javax.swing.JFrame("Test")
    var applet = ProcessingTest
    frame.getContentPane().add(applet)
    applet.init
    frame.pack
    frame.setVisible(true)
  }
}