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
* Version: 2025-04-21
*/
package ghalien;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Graphics;

import org.junit.jupiter.api.Test;

/**
 * Purpose: The reponsibility of TestAlienInvasion is ...
 *
 * TestAlienInvasion is-a ...
 * TestAlienInvasion is ...
 */
class TestAlienInvasion
{
//
//	@Test
//	void testPlayer()
//	{
//		Player grace = new Player("Grace");
//		assertEquals("Grace", grace.toString());
//	}
	
	@Test
	void testPlayer()
	{
		Player grace = new Player();
		grace.setName("Grace");
		assertEquals("Grace", grace.toString());
		
		int xMove = 400;
		int yMove = 400;
		
		//assertEquals(xMove - 50, grace.getXLocation());
	}

}
