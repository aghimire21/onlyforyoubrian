

import java.util.Scanner;
import java.util.Date;
//red,blue,yellow,green
public class Driver {
    public static void main(String[] args) {
    	GameRecord gameRecord = new GameRecord();
    	Rules.printIntro();
    	System.out.println("Press Enter to Continue");
    	
    	Scanner bucky = new Scanner(System.in);
    	String skip = bucky.nextLine();
	
    	System.out.println("Enter Number of Players (Supports 2,3 or 4 players.): ");
    	int numberofplayers = bucky.nextInt();
    	while (numberofplayers < 2 || numberofplayers > 4) 
    	{
    		System.out.println("There can only be 2, 3 or 4 players!!");
	    	System.out.println("Please play by the rules and not waste my time!!");
		    System.out.println("Re-enter Number of Players (Only Supported 2,3 or 4): ");
		    numberofplayers = bucky.nextInt();
    	}
	
    	Record record = new Record(numberofplayers);
    	
    	Game game1 = null;
	
    	if (numberofplayers == 2) {
    		System.out.println("Player 1: Red Pawns");
    		System.out.println("Player 2: Blue Pawns");				
    		game1= new Gamefor2();
    	}
    	else if (numberofplayers == 3) {
    		System.out.println("Player 1: Red Pawns");
    		System.out.println("Player 2: Blue Pawns");
    		System.out.println("Player 3: Yellow Pawns");
    		game1 = new Gamefor3();
    	} 
    	else if (numberofplayers == 4) {
	   
    		System.out.println("Player 1: Red Pawns");
    		System.out.println("Player 2: Blue Pawns");
    		System.out.println("Player 3: Yellow Pawns");
    		System.out.println("Player 4: Green Pawns");
    		game1 = new Gamefor4();
    	}
	
	
	
    	Deck deck1 = new Deck();
    	deck1.shuffle();
    	
    	while(gameRecord.gameover()!=true)
    	{
    	Card card = null;
    	card = deck1.drawCard();
    	System.out.println("\n"+"Now, Player " + game1.getactiveplayer());
    	
    	try {
    		Thread.sleep(1000);
    	} catch (InterruptedException e) {
    		System.out.println("Interrupted");
    	}
	

    	System.out.println("The card drawn is " + card.getNum());
    	Rules.printinfo(card);
    	
    	
    	game1.move(card.getNum());
    	
    	System.out.println("The new positions are:");
    	record.display();
    	
    	
    	
    	}
    	
    	System.out.println("Player soemone has won the game");
    	System.out.println("Do you want to restart?Y/N");
    	
    	try {
    		Thread.sleep(10000);
    	} catch (InterruptedException e) {
    		System.out.println("Interrupted");
    	}

    	System.out.println("Haha. Just kidding. No Rematches!!!");
    	
	
	

    }
}
