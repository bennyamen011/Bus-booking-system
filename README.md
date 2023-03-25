# Bus-booking-system
Bus booking system using java 
//BUS CLASS
package bookingsystem;

public class bus {
	private int busno;
	private boolean ac;
	private int capacity;
	private String DriveName;
	public String getDriveName() {
		return DriveName;
	}
	public void setDriveName(String drive) {
		DriveName = drive;
	}
	public int getBusno() {
		return busno;
	}
	public void setBusno(int no) {
		this.busno = no;
	}
	public boolean isAc() {
		return ac;
	}
	public void setAc(boolean ac) {
		this.ac = ac;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int cap) {
		this.capacity = cap;
	}
	public bus(int no, boolean ac, int cap,String drive) {
		super();
		this.busno = no;
		this.ac = ac;
		this.capacity = cap ;
		this.DriveName=drive;
	}
	public void displaybusinfo() {
		System.out.println("Bus No:" + busno +  "  A/C:"  + ac + 
				"  Capacity of the bus is:" + capacity+"  "
						+ " Drivername :"+DriveName );
	} }
  //BOOKING CLASS
  package bookingsystem;

import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class booking {
    String passengerName;
    int busno;
    Date date;
    booking(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Name:");
        passengerName=scanner.next();
        System.out.println("Enter the BUS_NO:");
        busno=scanner.nextInt();
        System.out.println("Enter the DATE dd-MM-yyyy:");
        String dateInput=scanner.next();
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
        try {
            date=dateFormat.parse(dateInput);
        } catch (ParseException e) {
            e.printStackTrace();
        } 
    }
    public boolean isAvailable(ArrayList<booking> bookings, ArrayList<bus> buses) {
        int capacity = 0;

        for (bus bus : buses) {
            if (bus.getBusno() == busno) {
                capacity = bus.getCapacity();
            }
        }

        int booked = 0;
        for (booking b : bookings) {
            if (b.busno == busno && b.date.equals(date)) {
                booked++;
            }
        }

        return booked < capacity ? true : false;
    }
}
//main class
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
