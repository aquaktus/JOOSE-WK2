package gla.joose.birdsim.pieces;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Calendar;


import gla.joose.birdsim.Methods.PaintArcGrow;
/**
 * A Bird piece.
 */
public class GrowingBird extends Piece {
    public Color color;
    
    /**
     * Hatches a <code>Bird</code>.
     **/
    
	// time since the bird last ate :(
    public long lastMealTime;
    
    public GrowingBird() {
    	color = Color.black;
    	setPaintMethod(new PaintArcGrow());
    	lastMealTime=Calendar.getInstance().getTimeInMillis();
    }
    
    /**
     * Hatches a <code>Bird</code> of the given color.
     * 
     * @param color The <code>Color</code> of the new piece.
     **/
     GrowingBird(Color color) {
        this.color = color;
    }
     
     public void changeColor(Color c){
    	 color = c;
    	 
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
