
public class Score {
   
   private int[][] score;
  
   public Score(int numPlayers)
   {
      score = new int[2][numPlayers+1];
      for(int i=0; i<2; i++)
      {
         for (int j=0; j<numPlayers+1; j++)
         {
                        score[i][j]=1;
         }
      }
      if(numPlayers==2)
      {
    	  score[1][2]=2;
      }
      if(numPlayers==3)
      {
    	  score[1][3]=3;
      }
      if(numPlayers==4)
      {
    	  score[1][4]=4;
      }
    
   }
   
   
   public void update(Record record){
	   	for(int i=1; i<numPlayers+1; i++)
	   	{
	   		for(int j=0; j<2; i++)
	   		{
	   			score[i][j]= record.getplayer(i).getpawn(j).getPosition();
	   		}
	   	}
   }
   


   	public void display(Record record) {
   			System.out.println("Player"+"     " + "Pawn 1" + "Pawn 2");
   			for(int i=1; i<numPlayers+1; i++)
   		   	{
   		   		for(int j=0; j<2; i++)
   		   		{
   		   			System.out.print(record.getplayer(i).getpawn(j).getPosition());
   		   		}
   		   	}
	
	
}
  
   	private int numPlayers;
   	
  
  
}

