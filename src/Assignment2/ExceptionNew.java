package Assignment2;

import java.util.Scanner;

public class ExceptionNew {
	
	public static void main(String[] args) {
		
		System.out.println("Please enter 5 string values in the string array.");
		//  Initializing the string array of size 5
		String[] arr = new String[5];
		// using Scanner to take the input from the user
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) { // Getting input from the user
		// Assuming only one word will
		// be entered
		System.out.print("String #" + (i + 1) + ": ");
		arr[i] = sc.next();
		}
		// taking the string str
		String str;
		System.out.print("\nEnter the string to search: ");
		str = sc.next();
		// calling the method to search string in array
		String str1 = searchString(arr, str);
		// here If the method returned null, it means string not found
		if (str1 == null) {
		System.out.println("String not found.");
		// else string will be founded and result will print
		} else {
		System.out.println("String found.");
		}
		}

		// here we take the method to search the string
		private static String searchString(String[] arr, String str) {
		try {
		int i;
		// taking for loop to search the string in array
		for (i = 0; i < arr.length; i++) {
		// If string found stop the loop
		if (arr[i].equals(str)) {
		break;
		}
		}
		// Here If the value of i is equal to array length
		// then whole array traversed but
		// string will not found
		if (i == arr.length) {
		// So exception is thrown
		throw new ValueNotFoundException();
		} else {
		// if i is less than array length, it means the value
		// will found so string will return
		return str;
		}
		} catch (ValueNotFoundException e) {
		// If the exception caught then null is returned
		return null;
		}
		}
	

}
