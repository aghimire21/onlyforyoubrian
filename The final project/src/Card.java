

public class Card{
   public Card(int num, int type)
   {
      this.num=num;
      if(type==1)
      {
         this.type = "heart";
      }
      else if(type==2)
      {
         this.type = "dimonds";
      }
      else if(type==3)
      {
         this.type = "spade";
      }
      else if (type==4)
      {
         this.type = "tree";
      }
   }
   
   private int num;
   private String type;

   public int getNum() {
      return num;
   }

   public String getType() {
      return type;
   }

      
    

  
}
