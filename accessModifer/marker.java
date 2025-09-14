package accessModifer;

public class marker {

	String colour;
	int price;
	
	public marker(String colour, int price) {
		super();
		this.colour = colour;
		this.price = price;
	}

   @Override
   public String toString()
   {
	   return(colour + " " + price);
   }
	public static void main(String[] args) {
	marker m1 = new marker ("red" ,100);
     System.out.println(m1);
     
     marker m2 = new marker ("blue" ,200);
     System.out.println(m2);

	}

}
