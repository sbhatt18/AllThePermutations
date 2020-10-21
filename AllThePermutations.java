package cs1;

import java.util.Scanner;

public class AllThePermutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		//Step 1: ask user for string input and store it
		System.out.println("Enter a string: ");
		String letters=input.next();
		
		//Step 3: print permutations to console
		System.out.println("All possible permutations are:");
		printPermutation(letters);//method call to print permutations to console
		
	}
		// Step 2a: create recursive method to invoke printPermutation & to allow arguments to get passed through and into main method when this method is called in main
	public static void printPermutation(String letters) {
		printPermutation("", letters);//prints permutations to screen 
		System.out.println("("+letters.length()*2+ " possible permutations of string size " +letters.length()+")");//printing required information to console

		}
	
		//Step 2b: create helper method to find permutation of a string
		//setting this method to be private because program shouldnt call this helper method from anywhere except when it is called from the recursive method above
	private static void printPermutation(String l1, String l2) {
		//base case to check if length of String l2 equals zero 
		if (l2.length() == 0) {
		//if satisfied print String l1 to console
		System.out.println(l1);

		} else {//if not satisfied do this below

		for (int a = 0; a < l2.length(); a++) {//Using a for loop to transfer letters from String l2 to String l1
			printPermutation(l1 + l2.charAt(a), l2.substring(0, a) + l2.substring(a + 1));// calling recursive method to invoke new String l1 & String l2

		}

	}
		
 }
		
}