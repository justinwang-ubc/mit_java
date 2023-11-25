package assignment6;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
public class DrawGraphics {
    

 ArrayList<Bouncer> objects = new ArrayList<Bouncer>();
 
 
 /** Initializes this class for drawing. */
 public DrawGraphics() {
 Rectangle box1 = new Rectangle(15, 20, Color.RED);
 
 Bouncer movingSprite1 = new Bouncer(100, 170, box1);
 
 objects.add(movingSprite1);
 objects.get(0).setMovementVector(3, 1);
 
 Text box2 = new Text(Color.blue, 15, 20);
Bouncer movingSprite2 = new Bouncer(100,170,box2);

objects.add(movingSprite2);
objects.get(1).setMovementVector(-1, 2);
 }
 /** Draw the contents of the window on surface. */
 public void draw(Graphics surface) {
     for(Bouncer object: objects) {
         object.draw(surface);
     }
 }
} 