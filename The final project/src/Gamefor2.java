


public class Gamefor2 extends Game

{
    
   public Gamefor2(  )
   {
      player1 = new Player(1, "Red");
      player2 = new Player(2, "Blue");
      record = new Record(2); 
      record.initiaterecord(player1,player2);
   }
   
   @Override
   public void updateaciveplayer() {
		if(activeplayer==2)
		{
			activeplayer=1;
		}
		else
		{
			activeplayer++;
		}
	}
   
 // method to change the position of the pawn asked using rules, board and store it in positon record. After this the method should print the new set of positions.
   
  
   private Player player1;
   private Player player2;
   
   

   
   
     
   }
