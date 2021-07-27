package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	static int i;
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String strings[] = {"Hi", "I", "am", "super", "COOl"};
		//2. print the third element in the array
		System.out.println(strings[3]);
		//3. set the third element to a different value
		strings[3] = "SUPPPPER";
		//4. print the third element again
		System.out.println(strings[3]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
		}
		
		//6. make an array of 50 integers
		int intArray[] = new int[50];
		for (i = 0; i < 50; i++) {
			intArray[i] = i;
			//System.out.println(intArray[i]);
		}
		//7. use a for loop to make every value of the integer array a random number
		for (i = 0; i < 50; i++) {
			Random ran = new Random();
			int ranNum = ran.nextInt();
			intArray[i] = ranNum;
			//System.out.println(intArray[i]);
		}
		//8. without printing the entire array, print only the smallest number in the array
		System.out.println(intArray[0]);
		//9 print the entire array to see if step 8 was correct
		for (int i = 0; i < 50; i++) {
			System.out.println(intArray[i]);
		}
		//10. print the largest number in the array.
		System.out.println(intArray[49]);
	}
}
