# Bus-booking-system
Bus booking system using java 
The given code is a simple implementation of a bus booking system. It contains three classes: "bus", "booking", and "bookdemo".

The "bus" class has the following instance variables:

busno: an integer representing the bus number
ac: a boolean value indicating whether the bus is air-conditioned or not
capacity: an integer representing the capacity of the bus
DriveName: a string representing the name of the driver of the bus
The class has getter and setter methods for each of these instance variables, and a constructor that initializes the instance variables.

The "booking" class has the following instance variables:

passengerName: a string representing the name of the passenger
busno: an integer representing the bus number
date: a Date object representing the date of the booking
The class has a constructor that prompts the user to enter the passenger name, bus number, and date of the booking. It also has a method called "isAvailable" that takes in two array lists: one containing all the bookings and another containing all the buses. It checks if the given bus is available on the given date by counting the number of bookings already made for the bus on the given date and comparing it to the capacity of the bus. If the number of bookings is less than the capacity, the method returns true, indicating that the bus is available. Otherwise, it returns false.

The "bookdemo" class is the main class that uses the "bus" and "booking" classes to create a simple bus booking system. It creates an ArrayList of buses, displays information about each bus, and prompts the user to enter a choice. If the user chooses to book a bus, it creates a new booking object, checks if the bus is available on the given date, and adds the booking to the ArrayList of bookings if it is available. If the booking is successful, it prints a confirmation message; otherwise, it prints an error message.

Overall, the given code is a simple implementation of a bus booking system that allows users to book a bus based on its availability on a given date.
