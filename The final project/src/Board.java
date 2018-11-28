

public class Board {
  
   public static int nextPosition(int cardnum, int activeplayer, Record record, int pawn)
   {
	   int c = cardnum;
	   int p = activeplayer;
	   //initialposition
	   int i = record.getplayer(activeplayer).getpawn(pawn).getPosition();
	   int count = record.getplayer(activeplayer).getpawn(pawn).getCount();
	 
	   if (p == 1)
	      {
		    if(newposition(i, c)<=63)
		    {
	        	return newposition(i, c);
		    }
		    else
		    {
		    	return (1000+c-63+i);
		    }
	      } 
	   else if (p == 2)
	         
	      {
				if(count==1)
				{
		   
		   			   if(newposition(i, c)>63)
					    {
				        	i = c-63+i;
				        	return i;
					    }
					   else 
					   {
						   return newposition(i,c);
					   }
				}
				else
				{
						if(newposition(i, c)<=16)
					    {
				        	return newposition(i, c);
					    }
					    else
					    {
					    	return (2000+c-16+i);
					    }
							
				}
		   
		   
	      }
	   else if (p==3)
	      {
		   if(count==1)
			{
	   
	   			   if(newposition(i, c)>63)
				    {
			        	i = c-60+i;
			        	return i;
				    }
				   else 
				   {
					   return newposition(i,c);
				   }
			}
			else
			{
					if(newposition(i, c)<=31)
				    {
			        	return newposition(i, c);
				    }
				    else
				    {
				    	return (3000+c-16+i);
				    }
	      }
	      }
	   else
	      {
		   if(count==1)
			{
	   
	   			   if(newposition(i, c)>63)
				    {
			        	i = c-60+i;
			        	return i;
				    }
				   else 
				   {
					   return newposition(i,c);
				   }
			}
			else
			{
					if(newposition(i, c)<=56)
				    {
			        	return newposition(i, c);
				    }
				    else
				    {
				    	return (4000+c-16+i);
				    }
	     }
	      }
		   
		   
		   
		   
   }  
	   
	     
	   
  
   public static int newposition(int i, int c) {
	return i+c;
}

   

}
