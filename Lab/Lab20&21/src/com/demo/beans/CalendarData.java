package com.demo.beans;
import java.util.Calendar;

//Main class
public class CalendarData {

 // Main driver method
 public static void main(String args[])
 {
     // Creating a calendar object
     Calendar calndr = Calendar.getInstance();

//current date
     System.out.println("Current Date: "
                        + calndr.getTime());
// this will show the date after 15 days
     calndr.add(Calendar.DATE, 30);


     System.out.println("After 30 days: "
                        + calndr.getTime());

//this will show the 3 months back date 
     calndr.add(Calendar.MONTH, -3);


     System.out.println("3 months ago it was: "
                        + calndr.getTime());

//this will show the 2 years back date
     calndr.add(Calendar.YEAR, -2);

     System.out.println("10 years ago it was: "
                        + calndr.getTime());
 }
}
