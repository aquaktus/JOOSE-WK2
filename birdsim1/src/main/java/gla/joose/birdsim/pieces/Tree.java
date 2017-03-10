package gla.joose.birdsim.pieces;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import gla.joose.birdsim.Methods.PaintSquare;

public class Tree extends Piece {
	public Color color;
        
    
    public Tree() {
    	color = Color.green;
    	setPaintMethod(new PaintSquare());
    	
    }
    
     Tree(Color color) {
        this.color = color;
    }
   
    
    /**
     * calls paint from the designed paint method
     * 
     * @param g The graphics on which to draw.
     * @param r The rectangle in which to draw.
     */
     public void paint(Graphics g, Rectangle r) {
     	pm.paint(g, r, color);
     }

}
