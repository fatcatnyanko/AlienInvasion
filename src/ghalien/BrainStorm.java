/**
* Lead Author(s):
* @author Grace Ho; student ID
* @author Full name; student ID
* <<Add additional lead authors here>>
*
* Other Contributors:
* Full name; student ID or contact information if not in class
* <<Add additional contributors (mentors, tutors, friends) here, with contact information>>
*
* References:
* Morelli, R., & Walde, R. (2016).
* Java, Java, Java: Object-Oriented Problem Solving
* https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
*
* <<Add more references here>>
*
* Version: 2025-04-27
*/
package ghalien;

/**
 * Purpose: The reponsibility of BrainStorm is ...
 *
 * BrainStorm is-a ...
 * BrainStorm is ...
 */

import java.awt.Graphics;
import java.awt.Image;
import java.awt.*;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class BrainStorm
{

	/**
	 * Purpose: 
	 * @param args
	 */
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Shapes");
		frame.setSize(600,600);
		frame.setLocation(500,250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel draw = new JPanel();
		frame.setContentPane(new BrainStormPanel());
		frame.setVisible(true);
	}

}
