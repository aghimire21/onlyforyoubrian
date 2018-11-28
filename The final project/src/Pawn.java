

public class Pawn {
   
   public Pawn(int pawnNumber) {
      this.pawnNumber = pawnNumber;
      position=-50;
      count = 1;
      
   }

   public int getPawnNumber() {
      return pawnNumber;
   }

   public int getPosition() {
      return position;
   }

   public void setPosition(int position) {
      this.position = position;
   }
   
   
   public int getCount() {
	return count;
}

public void updateCount(int count) {
	count++;
}


public boolean isHome() {
	return home;
}

public void movable(boolean home) {
	this.home = home;
}


private int pawnNumber;
   private int position;
   private int count;
   private boolean home;
   

}
