package tasks_02_2022;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str=scan.nextLine();
		StringBuilder strBuiled=new StringBuilder(str);
		System.out.println(strBuiled.reverse());
		
	}

}
