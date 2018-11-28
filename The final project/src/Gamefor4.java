

public class Gamefor4 extends Game {
	

	public Gamefor4( )
  {
     player1 = new Player(1, "Red");
     player2 = new Player(2, "Blue");
     player3 = new Player(3, "Yellow");
     player4 = new Player(4, "Green");
     record = new Record(4); 
     record.initiaterecord(player1,player2,player3,player4);
     
  }
	 @Override
	   public void updateaciveplayer() {
			if(activeplayer==4)
			{
				activeplayer=1;
			}
			else
			{
				activeplayer++;
			}
		}
	 private Player player1;
		private Player player2;
		private Player player3;
		private Player player4;
	   
	 // method to change the position of the pawn asked using rules, board and store it in positon record. After this the method should print the new set of positions.
	   
	 
}
