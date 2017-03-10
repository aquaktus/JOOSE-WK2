package gla.joose.birdsim.Methods;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

import gla.joose.birdsim.Interfaces.PaintMethod;

public class PaintOval implements PaintMethod {
	public void paint(Graphics g, Rectangle r, Color color) {
		g.setColor(color);
		g.fillOval(r.x, r.y, r.width, r.height);
	}
}
