 package bookingsystem;

import java.util.ArrayList;
import java.util.Scanner;
public class bookdemo {

	public static void main(String[] args) {
		ArrayList<bus> buses=new ArrayList<bus>();
		ArrayList<booking> bookings=new ArrayList<booking>();
	buses.add(new bus(101,true,3,"ram"));
	buses.add(new bus(102,true,30,"san"));
	buses.add(new bus(103,true,35,"ben"));
	buses.add(new bus(104,false,30,"hri"));
	buses.add(new bus(105,false,25,"gow"));
	buses.add(new bus(106,false,40,"nav"));
	
	
		int userops=1;
		Scanner scanner=new Scanner(System.in);
		for(bus b:buses) {
			b.displaybusinfo();
		}    	 
		while(userops==1) {
		System.out.println("Enter 1 to Booking or  2 to exit ");
		userops=scanner.nextInt(); 
		if (userops==1) {
		booking	Booking=new booking();
		if(Booking.isAvailable(bookings,buses)) {
			bookings.add(Booking);
			System.out.println("Your booking successfully confirmed");
		}
		else {
			System.out.println("Sorry...Your booking is fail.please try Another Bus or Date ");
		}
				
			
			
		}
		
		
		
		}
	}

}
