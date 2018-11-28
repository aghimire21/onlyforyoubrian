

public class Game {
	

	public Game() {
		activeplayer = 1;
	}
	public int getactiveplayer() {
		return activeplayer;
	}
	
	
	public void move(int cardnum) {
		
		Rules.move(cardnum, cardnum, record);
		updateaciveplayer();
		System.out.println("The positions have been updated");
		//Edit this
	}
	
	public void updateaciveplayer() {
		
	}
	

	int activeplayer;
	protected Record record;

	
}
