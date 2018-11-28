

// This method implements and keeps track of all the actions that a player could make, as well
// as some characteristics that are specific to the player, such as their color.
public class Player {
   public Player(int number, String color)
   {
      this.number = number;
      this.color = color;
      pawn1 = new Pawn(1);
      pawn2 = new Pawn(2);
   }
 
     
   public String getColor() {
      // Returns the color of the players pieces 
      return color;
   }

     
   public int getplayernumber()
   {
      return number;
   }
   
   public Pawn getpawn(int i) {
	   if(i==1) {
		   return pawn1;
	   }
	   else {
		   return pawn2;
	   }
	   
	   
   }
   
   private Pawn pawn1;
   private Pawn pawn2;
        
   private int number;
   private String color;
      
   
}
