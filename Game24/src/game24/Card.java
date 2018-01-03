/*
FILE NAME:     Card.java
VERSION:       1.0
DESCRIPTION:   Game24 implementation using JavaFX
CLASS:         COMP 494, Spring 2016 Semester @ SMSU
INSTRUCTOR:    Professor Shushuang Man <mans@smsu.edu>
AUTHORS:       Nikolay Ivanov (Nick) <nikolay.ivanov@smsu.edu>
                     <nnrowan@gmail.com
               Anthony Angrimson <anthony.angrimson@smsu.edu>
                     <angrinord@gmail.com>
LICENSE:       GNU General Public License v.3
               [http://www.gnu.org/licenses/gpl-3.0.en.html]
DATE:          1/25/2016

DOCUMENTATION: Ask Dr. Man @ SMSU or Wikipedia
*/

package game24;

/**
 *
 * @author Nikolay Ivanov & Anthony Angrimson
 */
public class Card {
    public static String card2fname(int face, int suit)
    {
	switch(face) {
	    case 1:
		switch(suit) {
		    case 1: return "images/ace_of_hearts.png";
		    case 2: return "images/ace_of_diamonds.png";
		    case 3: return "images/ace_of_spades.png";
		    case 4: return "images/ace_of_clubs.png";
		}

	    case 2:
		switch(suit) {
		    case 1: return "images/2_of_hearts.png";
		    case 2: return "images/2_of_diamonds.png";
		    case 3: return "images/2_of_spades.png";
		    case 4: return "images/2_of_clubs.png";
		}
		
	    case 3:
		switch(suit) {
		    case 1: return "images/3_of_hearts.png";
		    case 2: return "images/3_of_diamonds.png";
		    case 3: return "images/3_of_spades.png";
		    case 4: return "images/3_of_clubs.png";
		}
		
	    case 4:
		switch(suit) {
		    case 1: return "images/4_of_hearts.png";
		    case 2: return "images/4_of_diamonds.png";
		    case 3: return "images/4_of_spades.png";
		    case 4: return "images/4_of_clubs.png";
		}
		
	    case 5:
		switch(suit) {
		    case 1: return "images/5_of_hearts.png";
		    case 2: return "images/5_of_diamonds.png";
		    case 3: return "images/5_of_spades.png";
		    case 4: return "images/5_of_clubs.png";
		}
		
	    case 6:
		switch(suit) {
		    case 1: return "images/6_of_hearts.png";
		    case 2: return "images/6_of_diamonds.png";
		    case 3: return "images/6_of_spades.png";
		    case 4: return "images/6_of_clubs.png";
		}
		
	    case 7:
		switch(suit) {
		    case 1: return "images/7_of_hearts.png";
		    case 2: return "images/7_of_diamonds.png";
		    case 3: return "images/7_of_spades.png";
		    case 4: return "images/7_of_clubs.png";
		}
		
	    case 8:
		switch(suit) {
		    case 1: return "images/8_of_hearts.png";
		    case 2: return "images/8_of_diamonds.png";
		    case 3: return "images/8_of_spades.png";
		    case 4: return "images/8_of_clubs.png";
		}
		
	    case 9:
		switch(suit) {
		    case 1: return "images/9_of_hearts.png";
		    case 2: return "images/9_of_diamonds.png";
		    case 3: return "images/9_of_spades.png";
		    case 4: return "images/9_of_clubs.png";
		}
		
	    case 10:
		switch(suit) {
		    case 1: return "images/10_of_hearts.png";
		    case 2: return "images/10_of_diamonds.png";
		    case 3: return "images/10_of_spades.png";
		    case 4: return "images/10_of_clubs.png";
		}
		
	    case 11:
		switch(suit) {
		    case 1: return "images/jack_of_hearts.png";
		    case 2: return "images/jack_of_diamonds.png";
		    case 3: return "images/jack_of_spades.png";
		    case 4: return "images/jack_of_clubs.png";
		}
		
	    case 12:
		switch(suit) {
		    case 1: return "images/queen_of_hearts.png";
		    case 2: return "images/queen_of_diamonds.png";
		    case 3: return "images/queen_of_spades.png";
		    case 4: return "images/queen_of_clubs.png";
		}
		
	    case 13:
		switch(suit) {
		    case 1: return "images/king_of_hearts.png";
		    case 2: return "images/king_of_diamonds.png";
		    case 3: return "images/king_of_spades.png";
		    case 4: return "images/king_of_clubs.png";
		}
		
	}
	
	return "null";
    }
}
