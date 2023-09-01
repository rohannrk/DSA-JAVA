//Write a program to input an integer "n"  and print the sum of all its even digits and the sum of all its odd digits separately.
//Digits mean numbers, not places! That is, if the given integer is "132456",  even digits are 2, 4, and 6, and odd digits are 1, 3, and 5.

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int sumeven = 0;
		int sumodd = 0 ;
		while (x!=0)
		{
			int d = x%10;
			if(d%2 == 0)
			sumeven = sumeven + d;
			else
			sumodd = sumodd+d;
			x = x/10;
		}
		System.out.println(sumeven+ " " + sumodd);
	}
}
