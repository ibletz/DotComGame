package dotComGame;
import java.util.ArrayList;

/**
 * DotCom object occupying a set number of cells on a game board.
 * Sets its location on the board through passed location information.
 * Checks for hits from user guesses, and reduces its internal ArrayList
 * Size until it is empty, at which point it is killed.
 * @author O'Reilly
 * @since  1.0
 * @see    Head First Java, 2nd Edition 2005 O'Reilly 
 */
public class DotCom {
	
	private ArrayList<String> locationCells;
	private String name;
	
	/**
	 * Sets the location of the DotCom object on the game grid.
	 * @param locations cells DotCom will occupy on the game grid.
	 */
	public void setLocationCells(ArrayList<String> locations) {
		locationCells = locations;
		// initialize locationCells with location on game grid
	}
	
	/**
	 * Checks to see if user's guess was a hit, miss, or kill on DotCom.
	 * If the guess was a hit, the method reduces its locationCells
	 * ArrayList by one. Once the ArrayList is empty, the DotCom is killed.
	 * @param userInput cell location of user's guess.
	 * @return			result of guess, "miss", "hit", or "kill".
	 */
	public String checkYourself(String userInput) {
		String result = "miss";
		int index = locationCells.indexOf(userInput);
		
		if (index >= 0) {
				// if user guess is greater than zero, guess is in the list
			locationCells.remove(index);
				// remove cell at user guess location
			if (locationCells.isEmpty()) {
				// if list is empty, DotCom is killed
				result = "kill";
			} else {
				result = "hit";
			}
		}
		return result;
	}
	
	/**
	 * Setter for DotCom name.
	 * @param aName String to set dotCom's name to.
	 */
	public void setName(String aName) {
		name = aName;
	}
	
	/**
	 * Getter for DotCom name.
	 * @return	name of DotCom object.
	 */
	public String getName() {
		return name;
	}
}