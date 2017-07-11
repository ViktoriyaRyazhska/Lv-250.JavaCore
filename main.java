package Plants;

public class main {
	public static void main(String[] args) {
		   try {
		      Plant pl = new Plant("big", "rose", 5);     
		      System.out.println(pl);
		   } catch (ColorException | TypeException e) {
		      System.err.println(e.getMessage() + "\n");
		      //e.printStackTrace();
		   }
		}
}

