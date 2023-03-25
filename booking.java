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
