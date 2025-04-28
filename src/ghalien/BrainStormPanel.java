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

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
/**
 * Purpose: The reponsibility of BrainStormPanel is ...
 *
 * BrainStormPanel is-a ...
 * BrainStormPanel is ...
 */
public class BrainStormPanel extends JPanel
{
	public void paintComponent(Graphics g)
	{
		ImageIcon shipIcon = new ImageIcon("tempspaceship.jpg", "space ship");
		//Image ship = "tempspaceship.jpg";
		g.drawOval(100, 100, 50, 50);
		try
		{
			BufferedImage ship = ImageIO.read(getClass().getResource("tempspaceship.jpg"));
			Image image = ship;
			g.drawImage(image, 100, 100, 50, 50, null);
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
