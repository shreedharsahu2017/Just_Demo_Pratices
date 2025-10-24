package com.jsp.Synchronization;

 class BookTheaterSeat {
    int totalseats=10;
    synchronized  void bookseat(int seats) {
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
   }