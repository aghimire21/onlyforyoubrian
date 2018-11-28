

import java.util.Random;

public class Deck{
   // This class possesses all the information and classes responsible for both building 
   // and keeping track of the deck of cards, and is linked to the Card class.

   public Deck()
   {
      // This class is responsible for creating the deck with a specific amount of each type of 
      // card inside of it using a for loop and a nested for loop.
      int index=0;
      for (int i = 1 ; i<=13 ; i++)
      {
         for (int j=1 ;j<=4 ; j++)
         {
           Card card = new Card(i,j);
            deck[index] = card;
            index++;
            
         }
         top =52;
      }
      Card card = new Card(1,1);
      deck[index] = card;
      
   }
   
   
   public void shuffle()
   {
      // This method is responsible for shuffling a newly created deck. This is done by randomly
      // selecting cards from the deck and placing them in a temporary array, the replacing the 
      // original array with the newly created random temp array
      Random r = new Random();
      for(int i = 0 ; i<53; i++)
      {
         int next = r.nextInt(53);
         Card temp1 = null;
         temp1 = deck[i];
         deck[i]= deck[next];
         deck[next]=temp1;
         
      }
            
   }
   
   public Card drawCard()
   {
      // This method method is responsible for drawing the card for a player.
      // The card is drawn from the deck and the card is removed from the deck array, and returns
      // its game based information
      Card draw = deck[top];
      top--;
      return draw;
   }
   
   private Card deck[] = new Card[53];
   private int top;
   
}

