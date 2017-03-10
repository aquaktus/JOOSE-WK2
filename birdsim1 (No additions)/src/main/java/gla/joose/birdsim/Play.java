package gla.joose.birdsim;

import javax.swing.JFrame;

import gla.joose.birdsim.Methods.DyingBirdsFly;
import gla.joose.birdsim.Methods.FlockBoardFly;
import gla.joose.birdsim.Methods.MovingForageFly;
import gla.joose.birdsim.Methods.StaticForageFly;
import gla.joose.birdsim.boards.Board;
import gla.joose.birdsim.boards.FiveButtonsBoard;
import gla.joose.birdsim.boards.FourButtonsBoard;
import gla.joose.birdsim.boards.TwoButtonsBoard;


/**
 *  @author inah
 *  The main method for bootstrapping BirdSim.
 */
public class Play extends JFrame {
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		Play play = new Play();
		
		/**
		 * Select board type and 
		 * @param The fly behavior that applies to the chosen board
		 */
		Board forageBoard = new FourButtonsBoard(50,80, new MovingForageFly());
		forageBoard.initBoard(play);

	}

}
