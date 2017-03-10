package gla.joose.birdsim.pieces;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Calendar;

import gla.joose.birdsim.Methods.PaintArc;
/**
 * A Bird piece.
 */
public class Bird extends Piece {
    public Color color;
    public long lastMealTime;
    /**
     * Hatches a <code>Bird</code>.
     **/
    
	// time since the bird last ate :(
    
    
    public Bird() {
    	color = Color.black;
    	setPaintMethod(new PaintArc());
    	lastMealTime=Calendar.getInstance().getTimeInMillis();
    }
    
    /**
     * Hatches a <code>Bird</code> of the given color.
     * 
     * @param color The <code>Color</code> of the new piece.
     **/
     Bird(Color color) {
        this.color = color;
    }
   
    
    /**
     * Draws this <code>Bird</code> on the given <code>Graphics</code>.
     * Drawing should be limited to the provided <code>java.awt.Rectangle</code>.
     * 
     * @param g The graphics on which to draw.
     * @param r The rectangle in which to draw.
     */
     public void paint(Graphics g, Rectangle r) {
     	pm.paint(g, r, color);
     }
}
