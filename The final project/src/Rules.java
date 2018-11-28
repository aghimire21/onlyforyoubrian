import java.util.Scanner;

public class Rules {

	public static void move(int cardnum, int activeplayer, Record record ) {
		System.out.println("Enter the pawn you wish to move.");
		int pawn = validint(1,2);
		
		if (cardnum == 1) {
			System.out.println("Your can choose between these two actions.");
			System.out.println("1. Move a pawn from Start" + "\n" + "2. move a pawn one space forward.");
			int i = validint(1,2);
			if(i ==1)
			{
				startgame(record, activeplayer, i);
			}
			else
			{
				int newposition = Board.nextPosition(cardnum, activeplayer, record , pawn);
				moveifvalid(activeplayer, newposition, record, pawn);
			}
		    //System.out.println("Move a pawn from Start or move a pawn one space forward.");
		} else if (cardnum == 2) {
			System.out.println("Your can choose between these two actions.");
			System.out.println("1. Move a pawn from Start" + "\n" + "2. move a pawn two space forward.");
			int i = validint(1,2);
			if(i==2)
			{
				startgame(record,activeplayer,i);
			}
			else
			{
				int newposition = Board.nextPosition(cardnum, activeplayer, record , pawn);
				moveifvalid(activeplayer, newposition, record, pawn);
			}
		   // System.out.println("Move a pawn from Start or move a pawn two spaces forward.");
		} else if (cardnum == 3) {
			int newposition = Board.nextPosition(cardnum, activeplayer, record , pawn);
			moveifvalid(activeplayer, newposition, record, pawn);
		} else if (cardnum == 4) {
			int newposition = Board.nextPosition(cardnum, activeplayer, record , pawn);
			moveifvalid(activeplayer, newposition, record, pawn);
		} else if (cardnum == 5) {
			int newposition = Board.nextPosition(cardnum, activeplayer, record , pawn);
			moveifvalid(activeplayer, newposition, record, pawn);
		} else if (cardnum == 6) {
			int newposition = Board.nextPosition(cardnum, activeplayer, record , pawn);
			moveifvalid(activeplayer, newposition, record, pawn);
		} else if (cardnum == 7) {
			System.out.println("Your can choose between these two actions.");
			System.out.println("1. Split the seven spaces between two pawns (such as four spaces for one pawn and three for another)" + "\n" + "2. move a pawn seven space forward.");
			int i = validint(1,2);
			if(i==1)
			{
				
				
			}
			else
			{
				int newposition = Board.nextPosition(cardnum, activeplayer, record , pawn);
				moveifvalid(activeplayer, newposition, record, pawn);
	
			}
		  // System.out.println("Move one pawn seven spaces forward, or split the seven spaces between two pawns (such as four spaces for one pawn and three for another).");
		} else if (cardnum == 8) {
			int newposition = Board.nextPosition(cardnum, activeplayer, record , pawn);
			moveifvalid(activeplayer, newposition, record, pawn);
		} else if (cardnum == 9) {
			int newposition = Board.nextPosition(cardnum, activeplayer, record , pawn);
			moveifvalid(activeplayer, newposition, record, pawn);		} else if (cardnum == 10) {
			System.out.println("Your can choose between these two actions.");
			System.out.println("1. Move a pawn ten spaces forward" + "\n" + "2. move a pawn one space forward.");
			int i = validint(1,2);
			if(i==2)
			{
				int newposition = Board.nextPosition(cardnum, activeplayer, record , pawn);
				moveifvalid(activeplayer, newposition, record, pawn);			}
			else
			{
				int newposition = Board.nextPosition(cardnum, activeplayer, record , pawn);
				moveifvalid(activeplayer, newposition, record, pawn);			}
		   // System.out.println("Move a pawn ten spaces forward or one space backward.");
		} else if (cardnum == 11) {
			System.out.println("Your can choose between these two actions.");
			System.out.println("1. Move eleven spaces forward" + "\n" + "2. switch the places of one of the player's own pawns and an opponent's pawn.");
			int i = validint(1,2);
			if(i==2)
			{
				System.out.println("Pick the pawn you wish to use. (1/2)");
				int pawn1 = validint(1,2);
				System.out.println("Pick the player you wish to knock out.");
				int player2 = validint(1,2);
				System.out.println("Pick the enemy pawn you wish to knock out.");
				int pawn2 = validint(1,2);
				
				swap(activeplayer, pawn1, record, player2, pawn2);
				
			}
			else
			{
				int newposition = Board.nextPosition(cardnum, activeplayer, record , pawn);
				moveifvalid(activeplayer, newposition, record, pawn);			}
		   //System.out.println("Move eleven spaces forward, or switch the places of one of the player's own pawns and an opponent's pawn.");
		} else if (cardnum == 12) {
			int newposition = Board.nextPosition(cardnum, activeplayer, record , pawn);
			moveifvalid(activeplayer, newposition, record, pawn);		}  else if (cardnum == 13) {
			
			System.out.println("Pick the pawn you wish to use. (1/2)");
			int pawn1 = validint(1,2);
			System.out.println("Pick the player you wish to knock out.");
			int player2 = validint(1,2);
			System.out.println("Pick the enemy pawn you wish to knock out.");
			int pawn2 = validint(1,2);
			swap(activeplayer, player2, record, pawn1, pawn2);
			
			//System.out.println("Take any one pawn from Start and move it directly to a square occupied by any opponent's pawn, sending that pawn back to its own Start.");
		} else {
		   System.out.println("Invalid card");
		}
		
		
	}
	
	private static void moveifvalid(int activeplayer, int newposition, Record record, int pawn1) {
		
		int counter = 0;
		int knocked = 0;
		int pawn2=0;
		for(int c1 = 0; c1<1; c1++)
		{
			for(int c2 = 0; c2<1; c2++)
			{
				if ( newposition == record.getplayer(c1).getpawn(c2).getPosition())
				{
					counter++;
					knocked = record.getplayer(c1).getplayernumber();
					for(int a= 0; a<2; a++)
					{
						if( newposition == record.getplayer(knocked).getpawn(a).getPosition())
						{
							pawn2 = record.getplayer(knocked).getpawn(a).getPawnNumber();
						}
					}
				}
			}
		}
		
		if(counter>1)
		{
			overthrow(knocked, record, pawn2);
		}
			march(activeplayer, record, pawn1, newposition);
		
	}
    
    private static void march(int activeplayer, Record record, int pawn1, int newposition) {
    	record.getplayer(activeplayer).getpawn(pawn1).setPosition(newposition);
		
	}

	
    
    private static void overthrow(int knocked, Record record, int pawn2) {
    	    	
    	record.getplayer(knocked).getpawn(pawn2).setPosition(-50);
		
	}
    private static void swap(int activeplayer, int player2, Record record, int pawn1, int pawn2) {
		
    	int i = record.getplayer(player2).getpawn(pawn2).getPosition();
    	record.getplayer(player2).getpawn(pawn2).setPosition(pawn1);
    	record.getplayer(activeplayer).getpawn(pawn1).setPosition(i);
    	
		
	}
	private static void startgame(Record record, int activeplayer, int pawn1) {
		
		record.getplayer(activeplayer).getpawn(pawn1).setPosition(0);
	}

	public static void printinfo(Card card) {
	if (card.getNum() == 1) {
	    System.out.println("Move a pawn from Start or move a pawn one space forward.");
	} else if (card.getNum() == 2) {
	    System.out.println("Move a pawn from Start or move a pawn two spaces forward.");
	} else if (card.getNum() == 3) {
	    System.out.println("Move a pawn three spaces forward.");
	} else if (card.getNum() == 4) {
	    System.out.println("Move a pawn four spaces backward.");
	} else if (card.getNum() == 5) {
	    System.out.println("Move a pawn five spaces forward.");
	} else if (card.getNum() == 6) {
	    System.out.println("Move a pawn six spaces forward.");
	} else if (card.getNum() == 7) {
	    System.out.println("Move one pawn seven spaces forward, or split the seven spaces between two pawns (such as four spaces for one pawn and three for another).");
	} else if (card.getNum() == 8) {
	    System.out.println("Move a pawn eight spaces forward.");
	} else if (card.getNum() == 9) {
	    System.out.println("This moves your card by 9 position.");
	} else if (card.getNum() == 10) {
	    System.out.println("Move a pawn ten spaces forward or one space backward.");
	} else if (card.getNum() == 11) {
	    System.out.println("Move eleven spaces forward, or switch the places of one of the player's own pawns and an opponent's pawn.");
	} else if (card.getNum() == 12) {
	    System.out.println("Move a pawn twelve spaces forward.");
	}  else if (card.getNum() == 13) {
		System.out.println("Take any one pawn from Start and move it directly to a square occupied by any opponent's pawn, sending that pawn back to its own Start.");
	} else {
	    System.out.println("Invalid card");
	}

    }
    
    public static void printIntro()
    {
    	System.out.println("Welcome to the Sorry game" + "\n" +"Sorry! is a board game that is based on the ancient cross and circle game Pachisi."+ "\n" + "Players try to travel around the board with their pieces (called pawns) faster than any other player. ");
    	try {
    		Thread.sleep(1000);
    	} catch (InterruptedException e) {
    		System.out.println("Interrupted");
    	}
    	
    	
    }
    
    public static void printrules() {
    	System.out.println("Rule 1: Each player chooses four pawns of one colour and places them in his or her Start. One player is selected to play first.\r\n" + 
    			"\r\n" + 
    			"Rule 2: Each player in turn draws one card from the deck and follows its instructions. To begin the game, all of a player's four pawns are restricted to Start; a player can only move them out onto the rest of the board if he or she draws a 1 or 2 card. A 1 or a 2 places a pawn on the space directly outside of start (a 2 does not entitle the pawn to move a second space).\r\n" + 
    			"\r\n" + 
    			"Rule 3: The Relaxation Start: When a young player is playing, especially when learning the game of Sorry!, a relaxation is offered in allowing one of their pawns to begin the game already on the board, on the space directly outside their Start, as the tedium of waiting for a 1 or a 2 can be wearisome even for experienced players.\r\n" + 
    			"\r\n" + 
    			"Rule 4: A pawn can jump over any other pawn during its move. However, two pawns cannot occupy the same square; a pawn that lands on a square occupied by another player's pawn \"bumps\" that pawn back to its own Start. Players can not bump their own pawns back to Start; if the only way to complete a move would result in a player bumping his or her own pawn, the player's pawns remain in place and the player loses his or her turn.\r\n" + 
    			"\r\n" + 
    			"Rule 5: If a pawn lands at the start of a slide (except those of its own colour), either by direct movement or as the result of a switch from an 11 card or a Sorry card, it immediately \"slides\" to the last square of the slide. All pawns on all spaces of the slide (including those belonging to the sliding player) are sent back to their respective Starts.[4]\r\n" + 
    			"\r\n" + 
    			"Rule 6: The last five squares before each player's Home are \"Safety Zones\", and are specially coloured corresponding to the colours of the Homes they lead to. Access is limited to pawns of the same colour. Pawns inside the Safety Zones are immune to being bumped by opponents' pawns or being switched with opponents' pawns via 11 or Sorry! cards. However, if a pawn is forced via a 10 or 4 card to move backwards out of the Safety Zone, it is no longer considered \"safe\" and may be bumped by or switched with opponents' pawns as usual until it re-enters the Safety Zone. ");
    }
    
    public static int validint(int i, int j)
    {
    	Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        while (a > j || a < i) 
    	{
    		System.out.println("There can only be numbers ranging from" +i + "to" +j);
	    	System.out.println("Please play by the rules and not waste my time!!");
		    System.out.println("Please Re-enter. ");
		    a = s.nextInt();
    	}
        return a;
    	 
    }

}
