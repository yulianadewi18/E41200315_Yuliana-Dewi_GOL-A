/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_A;

/**
 *
 * @author Yuliana Dewi
 */
import java.awt.*;
import java.applet.*;
public class DrawShapes extends Applet {
    Font font;
    Color redColor;
    Color blueColor;
    Color backgroundColor;
    
    public void init() {
    //The Font is Arial size, 18, and is italicized
    font = new Font("Arial", Font.ITALIC,18);
    
    //Some colors are predefined in the Color class
    redColor = Color.red;
    backgroundColor = Color.orange;
    
    //Colors can be created using Red, Green, Blue Values
    blueColor = new Color(0, 0 , 122);
    
    //Set the background Color of the applet
    setBackground(backgroundColor);
    }
    
    public void stop(){
    }
    
    public void paint(Graphics graph) {
        
        graph.setFont(font);
        graph.drawString("Draw Shapes", 90, 20);
        graph.setColor(blueColor);
        graph.drawRect(120, 120, 120, 120);
        graph.setColor(redColor);
        graph.fillArc(110, 110, 50, 50, 0, 360);
        graph.setColor(Color.CYAN);
        graph.drawRect(50,50,50,50);
        graph.fillRect(50,50,60,60);
    }
}
