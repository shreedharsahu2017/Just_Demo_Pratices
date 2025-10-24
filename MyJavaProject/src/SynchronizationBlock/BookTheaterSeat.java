package SynchronizationBlock;

public class BookTheaterSeat {
	     int totalseats=10;
	       void bookseat(int seats) {
	    	System.out.println("Hiii"+Thread.currentThread().getName());
	    	System.out.println("Hiii"+Thread.currentThread().getName());
	    	System.out.println("Hii"+Thread.currentThread().getName());
	    	
	    	synchronized(this) {
	    		if(totalseats>=seats) {
	        		System.out.println(seats+"seats are available");
	        		totalseats=totalseats-seats;
	        		System.out.println("seat left:"+totalseats);
	        	}
	        	else {
	        		System.out.println("sorry cannot booked successfully");
	        		System.out.println("seat left:"+totalseats);
	        	}
	    	}
	   	    System.out.println("Hii"+Thread.currentThread().getName());
	    	System.out.println("Hii"+Thread.currentThread().getName());
	    	System.out.println("Hii"+Thread.currentThread().getName());
	    }
  }
 class MoviebookApp extends Thread{

  	 static BookTheaterSeat b;
  	 
  	 int seats;
  	 public void run() {
  		 
			b.bookseat(seats);
  	 }
  	 public static void main(String[] args) {
  		 
  		  b=new  BookTheaterSeat();
  		 MoviebookApp m=new MoviebookApp();
  		 m.seats=7;
  		 m.start();
  		 MoviebookApp n=new MoviebookApp();
  		 n.seats=6;
  		 n.start();
		
   }
}



