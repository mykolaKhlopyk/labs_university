package tasks_02_2022;

import java.util.Scanner;

public class SumOfTwoBinaryNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String binaryAddition_1=scan.next();
		String binaryAddition_2=scan.next();
		System.out.println(Integer.toBinaryString(Integer.parseInt(binaryAddition_1,2)+Integer.parseInt(binaryAddition_2,2)));
		System.out.println(Integer.toBinaryString(Integer.parseInt(binaryAddition_1,2)*Integer.parseInt(binaryAddition_2,2)));
	
	}

}
