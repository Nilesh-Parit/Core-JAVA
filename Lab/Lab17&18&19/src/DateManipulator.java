


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class DateManipulator {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter date in the formate of dd/MM/yyyy");
		String str=sc.next();
		LocalDate ds=LocalDate.parse(str,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println("From string to date");
		System.out.println(ds);
		
		
		System.out.println("From date to string ");
		String newStr=ds.toString();
		System.out.println(newStr);
	}

}

