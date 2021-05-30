package com.onebill.corejava.basics.Assignment27;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException; // Import the IOException class to handle errors
import java.util.Scanner;

public class Files {
	public static void main(String[] args) {
		int inp;
		String str;
		String str1;
		Scanner sc = new Scanner(System.in);
		do {
			
			System.out.println("1. Create\n2. Write\n3. Read\n4. Delete\n5. Exit");
			inp = sc.nextInt();
			try {

				if (inp == 1) {
					System.out.println("Enter FileName: ");
					str = sc.next();
					File myObj = new File(str);
					if (myObj.createNewFile()) {
						System.out.println("File created: " + myObj.getName());
					} else {
						System.out.println("File already exists.");
					}
				}

				else if (inp == 2) {
					System.out.println("Enter FileName: ");
					str = sc.next();
					System.out.println("Enter the content to be inserted");
					str1 = sc.next();
					BufferedWriter myObj = new BufferedWriter(new FileWriter(str, true));
					myObj.write(str1);
					myObj.close();
					System.out.println("Successfully wrote to the file.");
				}

				else if (inp == 3) {
					System.out.println("Enter FileName: ");
					str = sc.next();
					File myObj = new File(str);
					Scanner myReader = new Scanner(myObj);
					while (myReader.hasNextLine()) {
						String data = myReader.nextLine();
						System.out.println(data);
					}
					myReader.close();
				}

				else if (inp == 4) {
					System.out.println("Enter FileName: ");
					str = sc.next();
					File myObj = new File(str);
					if (myObj.delete()) {
						System.out.println("Deleted the file: " + myObj.getName());
					} else {
						System.out.println("Failed to delete the file.");
					}
				}

				else if (inp == 5) {

				}

				else {
					System.out.println("Enter valid input..");
				}

			} catch (IOException e) {
				System.out.println("An error occurred.");
				e.printStackTrace();
			}
		} while (inp != 5);
		sc.close();

	}
}