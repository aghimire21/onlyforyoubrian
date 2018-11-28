
public class Record {

	private Player[] record;

	public Record(int numplayers) {
		record = new Player[numplayers];
	     
	         for (int j=0; j<numplayers; j++)
	         {
	                        record[j]=null;
	         }
	      }
	public void initiaterecord(Player player1, Player player2){
		record[0]=player1;
		record[1]=player2;
	}
	public void initiaterecord(Player player1, Player player2, Player player3){
		record[0]=player1;
		record[1]=player2;
		record[2]=player3;
	}
	public void initiaterecord(Player player1, Player player2, Player player3, Player player4){
		record[0]=player1;
		record[1]=player2;
		record[2]=player3;
		record[3]=player4;
	}
	public Player getplayer(int i) {
		return record[i-1];
	}
	
	public void display() {
			System.out.println("Player"+"     " + "Pawn 1" + "Pawn 2");
			for(int i=1; i<numplayers+1; i++)
		   	{
		   		for(int j=0; j<2; i++)
		   		{
		   			System.out.print(getplayer(i).getpawn(j).getPosition());
		   		}
		   	}
		   	}
			private int numplayers;
	}
	
