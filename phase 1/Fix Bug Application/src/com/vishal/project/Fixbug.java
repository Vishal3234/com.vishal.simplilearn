package com.vishal.project;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Fixbug {

	public static void main(String[] args)
	{
		/* System.out.println("Hello World!"); */
		System.out.println("\n-------------------------------------\n");
		System.out.println("\t*****Welcome to Arenaa **** \n");
		System.out.println("\n----------------------------------------\n");
		optionsSelection();

	}

	private static void optionsSelection() 
	{
		String[] arr = { "1. I wish to review my expenditure", "2. I wish to add my expenditure",
				"3. I wish to delete my expenditure", "4. I wish to sort the expenditures",
				"5. I wish to search for a particular expenditure", "6. Close the application" };
		
		int[] arr1 = { 1, 2, 3, 4, 5, 6 };
		int slen = arr1.length;
		for (int i = 0; i < slen; i++)
		{
			System.out.println(arr[i]);
			// display the all the Strings mentioned in the String array
		}
		ArrayList<Integer> arrlist = new ArrayList<Integer>();
		ArrayList<Integer> carexpenses = new ArrayList<Integer>();
		carexpenses.add(1111);
        carexpenses.add(2222);
		carexpenses.add(3333);
		carexpenses.add(4444);
		carexpenses.add(5555);
		carexpenses.addAll(arrlist);
		System.out.println("\nEnter your choice:\t");
		Scanner sc = new Scanner(System.in);
		int options;
		do {
			options = sc.nextInt();
			switch (options) {
			case 1:
				System.out.println("Your saved bikeexpenses are listed below: \n");
				System.out.println(carexpenses + "\n");

				break;
			case 2:
				System.out.println("Enter the value to add your bikeExpense: \n");
				int value = sc.nextInt();
				carexpenses.add(value);
				System.out.println("Your value is updated\n");
		        carexpenses.addAll(arrlist);
				System.out.println(carexpenses + "\n");

				break;
			case 3:
				System.out.println(
						"You are about the delete all your bikeexpenses! \nConfirm again by selecting the same option...\n");
				int con_choice = sc.nextInt();
				if (con_choice == options) {
					carexpenses.clear();
					System.out.println(carexpenses + "\n");
					System.out.println("All your bikeexpenses are erased!\n");
				} else {
					System.out.println("Oops... try again!");
				}

				break;
			case 4:
				sortExpenses(carexpenses);

				break;
			case 5:
				searchExpenses(carexpenses);

				break;
			case 6:
				closeApp();
				break;
			default:
				System.out.println("You have made an invalid choice!");
				break;
			}
		} while (options != 6);
	

	}

	private static void closeApp() {
		System.out.println("Closing your application... \nThank you!");
	}

	private static void searchExpenses(ArrayList<Integer> arrayList) {
//		int leng = arrayList.size();
		Scanner searchScanner = new Scanner(System.in);
		
		System.out.println("Enter the bikeexpense you need to search:\t");
		int searchNum = searchScanner.nextInt();
		System.out.println(arrayList.contains(searchNum) ? "Found your bikeexpense: " + searchNum
				: "Sorry not found that bikeexpense, Please try again.");
		
	}

	private static void sortExpenses(ArrayList<Integer> arrayList) {
//		int arrlength = arrayList.size();
		Collections.sort(arrayList);
		System.out.println(arrayList);
	}
}