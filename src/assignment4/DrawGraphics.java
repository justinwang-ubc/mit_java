package assignment4;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
public class DrawGraphics {
BouncingBox box;
ArrayList<BouncingBox> boxList;
/** Initializes this class for drawing. */
public DrawGraphics() {
   boxList = new ArrayList<BouncingBox>(); 
    
   BouncingBox box1 = new BouncingBox(200, 50, Color.RED);
  
   
   BouncingBox box2 = new BouncingBox(200, 50, Color.black);
   BouncingBox box3 = new BouncingBox(200, 50, Color.cyan);
   
  
   boxList.add(box1);
   boxList.add(box2);
   boxList.add(box3);
   boxList.get(0).setMovementVector(1, 0);
   boxList.get(1).setMovementVector(-3, -2);
   boxList.get(2).setMovementVector(1, 1);

}
/** Draw the contents of the window on surface. Called 20 times per second. */
public void draw(Graphics surface) {
surface.drawLine(50, 50, 200, 50);

surface.fillRect (150, 100, 25, 40);
surface.fillOval (40, 40, 25, 10);
surface.fillRect(-15, -20, 10, 30);
surface.drawString ("Mr. And Mrs. Smith", 200, 10);
for(BouncingBox box: boxList) {
    box.draw(surface);
}

}
}