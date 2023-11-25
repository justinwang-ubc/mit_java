package assignment6;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
public class DrawGraphics {
    

 ArrayList<Mover>  moverss = new ArrayList<Mover>();
 
 
 /** Initializes this class for drawing. */
 public DrawGraphics() {
 Rectangle box1 = new Rectangle(15, 20, Color.RED);
 
 Bouncer movingSprite1 = new Bouncer(100, 170, box1);
 
 moverss.add(movingSprite1);
 
 // becasue u only able yo call the method which ar especiided in the interface , becasue u creat a mover tpe arraylist 
 moverss.get(0).setMovementVector(3, 1);
 
 Text box2 = new Text(Color.blue, 15, 20);
Bouncer movingSprite2 = new Bouncer(100,170,box2);

moverss.add(movingSprite2);
moverss.get(1).setMovementVector(-1, 2);

// create the object 
Rectangle box3 = new Rectangle(15,20,Color.cyan);
Text box4 = new Text(Color.green,15,20);
// move the object 

StraightMover mover1 = new StraightMover(50,70,box3);
StraightMover mover2 = new StraightMover(10,30,box4);

moverss.add(mover2);
moverss.add(mover1);

moverss.get(0).setMovementVector(2, 1);
moverss.get(1).setMovementVector(-1, -2);
 }
 /** Draw the contents of the window on surface. */
 public void draw(Graphics surface) {
    
     
     for(Mover mover : moverss) {
         mover.draw(surface);
     }
 }
} 