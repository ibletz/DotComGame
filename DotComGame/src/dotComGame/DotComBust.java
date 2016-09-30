package dotComGame;
import java.util.ArrayList;

public class DotComBust {
	
		
	private GameHelper helper = new GameHelper();
		// arraylist to hold the dotcoms calld dotcomlist
	private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
		// numofguesses to track user guesses
	private int numOfGuesses = 0;
	
	
	// setupgame - to create and initialize dotcom objs with names and locations
	// and display instructions
	void setUpGame() {
		DotCom one = new DotCom();
		one.setName("Pets.com");
		DotCom two = new DotCom();
		two.setName("eToys.com");
		DotCom three = new DotCom();
		three.setName("Go2.com");
		dotComsList.add(one);
		dotComsList.add(two);
		dotComsList.add(three);
		
		// user instructions
		System.out.println("Your goal is to sink three dot coms.");
		System.out.println("Pets.com, eToys.com, & go2.com");
		System.out.println("Try to sink them all in the fewest number of guesses.");
		
		// for each DotCom object set its location
		for (DotCom dotComToSet : dotComsList) {
			ArrayList<String> newLocation = helper.placeDotCom(3);
			dotComToSet.setLocationCells(newLocation);
		}
	}
	
	// startplaying - asks for user input and calls checkuserguess method until
	// all dotcom objs are killed
	private void startPlaying() {
		while(!dotComsList.isEmpty()) {
			String userGuess = helper.getUserInput("Enter a guess");
			checkUserGuess(userGuess);
		}
		finishGame();
	}
	
	// checkuserguess - loops through all remaining dotcom objs and calls 
	// each dotcom objects checkYourself method
	private void checkUserGuess(String userGuess) {
		numOfGuesses++;
		String result = "miss";
		
		for(int x=0; x<dotComsList.size(); x++) {
			result = dotComsList.get(x).checkYourself(userGuess);
			
			if(result.equals("hit"))
				break;
			if(result.equals("kill")) {
				dotComsList.remove(x);
				break;
			}
		}
		System.out.println(result);
	}
	
	// finishgame  - prints message about user's preformance and how many guesses
	// they took
	void finishGame() {
		System.out.println("All DotComs are dead! Your stock is now worthless.");
		if(numOfGuesses <= 18) {
			System.out.println("It only took you " + numOfGuesses + " guesses.");
			System.out.println("You got out before your options sank.");
		} else {
			System.out.println("Took you long enough. "+ numOfGuesses + " guesses.");
			System.out.println("Fish are dancing with your options.");
		}
	}
	
	
	public static void main(String[] args) {
		DotComBust game = new DotComBust();
		game.setUpGame();
		game.startPlaying();
	}
}
