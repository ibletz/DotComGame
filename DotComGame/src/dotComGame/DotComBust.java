package dotComGame;
import java.util.ArrayList;

public class DotComBust {
	
	//instance variables
	
	//gamehelper instance named helper
	private GameHelper helper = new GameHelper();
	
	//arraylist to hold the dotcoms calld dotcomlist
	private ArrayList<DotCom> dotComList = new ArrayList<DotCom>();
	
	//numofguesses to track user guesses
	private int numOfGuesses = 0;
	
	/////
	//methods
	
	//setupgame - to create and initialize dotcom objs with names and locations
	//and display instructions
	void setUpGame() {
		//create three dotCom objects
		//set a name for each dotCom
		//add dotcoms to the dotComList ArrayList
		//REPEAT with each dotcom in the arraylist
			//call placeDotCom method on helper obj, to get 
	}
	
	//startplaying - asks for user input and calls checkuserguess method until
	// all dotcom objs are killed
	void startPlaying() {
		
	}
	
	//checkuserguess - loops through all remaining dotcom objs and calls 
	//each dotcom objects checkYourself method
	void checkUserGuess(String userGuess) {
		
	}
	//finishgame  - prints message about user's preformance and how many guesses
	// they took
	void finishGame() {
		
	}

}
