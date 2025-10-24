package com.jsp.Synchronization;

public class MoviebookApp extends Thread{

    
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

