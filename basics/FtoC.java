package basics;

import java.util.Scanner;

public class FtoC {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter temperature in Fahrenheit : ");
	int f =sc.nextInt();
	double c =(f-30)*(5.0/9.0);
	
	System.out.println("temprature in Celsius : "+ c);
	sc.close();
}
}
