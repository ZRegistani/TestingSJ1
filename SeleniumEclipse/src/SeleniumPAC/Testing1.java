package SeleniumPAC;

import java.util.Scanner;

public class Testing1 {

	public static void main(String[] args) {

		int age
		;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter your Age");
		age = scan.nextInt();
		
		if(age>18) {
			System.out.println("Age is greater than 18");
		}else
			System.out.println("Age is less than 18");
		
	}

}
