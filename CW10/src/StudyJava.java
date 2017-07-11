public class StudyJava extends Thread {

	
	String a;
	int pause;
	public StudyJava(String a, int pause){
		this.a = a;
		this.pause = pause;
		
	}
	@Override
	   public void run() {
	      for (int i = 0; i < 10; i++) {
	         try { sleep(pause); 
	         } catch (InterruptedException e) {}
	         System.out.println("I study Java ");
	      }}
	         
	         public static void main(String[] args) throws Exception {
	             StudyJava s1 = new StudyJava("I study Java", 1000);
	            
	            s1.start();           
	             
	          }
	       

	      
	}  
