package assignment6;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.BasicStroke;
import java.awt.Graphics2D;
public class Text implements Sprite{
   
    private Color color;
    private int width;
    private int height; 
    
    
   public Text(Color color, int width, int height){
        
        this.color = color; 
        this.width = width;
        this.height = height;
    }

   public void draw(Graphics surface, int leftX, int topY) {
       surface.setColor(this.color);
      surface.fillOval(leftX, topY, width, height);
      surface.setColor(Color.black);
      ((Graphics2D) surface).setStroke(new BasicStroke(3.0f));
      surface.drawOval(leftX, topY, width, height);;
   }
    /** Returns the width of the sprite. */
   public  int getWidth() {
        return width;
    }
    /** Returns the height of the sprite. */
    public int getHeight() {
        return height;
    }
}
