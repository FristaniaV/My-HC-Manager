package myhcmanager;

import java.util.Scanner;
import java.util.Vector;

public class MyHCManager {

	static Scanner scan = new Scanner(System.in);

	static int menu1 = 0;
	static int menu2 = 0;
	static String pos;
	static String name;
	static int salary;

	static Vector<String> vecpos = new Vector<>();
	static Vector<String> vecname = new Vector<>();
	static Vector<Integer> vecsalary = new Vector<>();

	public static void add() {

		do {
			System.out.print("Input Position ['Manager' | 'Supervisor'] : ");
			pos = scan.nextLine();
		} while (!(pos.equals("Manager") || pos.equals("Supervisor")));

		do {
			System.out.print("Input Employee's Name [3-10 Characters] : ");
			name = scan.nextLine();
		} while (name.length() < 3 || name.length() > 10);

		do {
			System.out.print("Input Salary [$600 - $1500 | Multiple of 50] : ");
			try {
				salary = scan.nextInt();
			} catch (Exception e) {
				salary = -1;
			}
			scan.nextLine();

			if (salary % 50 == 0) {
			} else {
				salary = -1;
			}
		} while (salary < 600 || salary > 1500 && salary % 50 == 0);

		vecpos.add(pos);
		vecname.add(name);
		vecsalary.add(salary);

		System.out.println("Employee Successfully Registered!");
		System.out.println("Press Enter to continue...");
		scan.nextLine();
	}

	public static void view() {

		if (vecpos.size() == 0) {
			System.out.println("No Data!");
		} else {
			do {
				System.out.println("Sort Ascending by:");
				System.out.println("1. Name");
				System.out.println("2. Position");
				System.out.println("3. Age");
				do {
					System.out.print(">> ");
					menu2 = scan.nextInt();
					scan.nextLine();
				} while (menu2 < 1 || menu2 > 3);
				System.out.println("");

				switch (menu2) {
				case 1:
					for (int i = 0; i < vecname.size(); i++) {
						for (int j = 0; j < vecname.size() - 1; j++) {
							if (vecname.get(j).compareTo(vecname.get(j + 1)) > 0) {
								String temp;
								int temporary;

								temp = vecname.get(j);
								vecname.set(j, vecname.get(j + 1));
								vecname.set((j + 1), temp);

								temp = vecpos.get(j);
								vecpos.set(j, vecpos.get(j + 1));
								vecpos.set((j + 1), temp);

								temporary = vecsalary.get(j);
								vecsalary.set(j, vecsalary.get(j + 1));
								vecsalary.set((j + 1), temporary);
							}
						}
					}

					for (int i = 0; i < vecname.size(); i++) {
						System.out.println("No. " + (i + 1));
						System.out.println("Name     : " + vecname.get(i));
						System.out.println("Position : " + vecpos.get(i));
						System.out.println("Salary   : $" + vecsalary.get(i));
						System.out.println("");
					}
					break;
				case 2:
					for (int i = 0; i < vecname.size(); i++) {
						for (int j = 0; j < vecname.size() - 1; j++) {
							if (vecpos.get(j).compareTo(vecpos.get(j + 1)) > 0) {
								String temp;
								int temporary;

								temp = vecname.get(j);
								vecname.set(j, vecname.get(j + 1));
								vecname.set((j + 1), temp);

								temp = vecpos.get(j);
								vecpos.set(j, vecpos.get(j + 1));
								vecpos.set((j + 1), temp);

								temporary = vecsalary.get(j);
								vecsalary.set(j, vecsalary.get(j + 1));
								vecsalary.set((j + 1), temporary);
							}
						}
					}

					for (int i = 0; i < vecname.size(); i++) {
						System.out.println("No. " + (i + 1));
						System.out.println("Name     : " + vecname.get(i));
						System.out.println("Position : " + vecpos.get(i));
						System.out.println("Salary   : $" + vecsalary.get(i));
						System.out.println("");
					}
					break;
				case 3:
					for (int i = 0; i < vecname.size(); i++) {
						for (int j = 0; j < vecname.size() - 1; j++) {
							if (vecsalary.get(j).compareTo(vecsalary.get(j + 1)) > 0) {
								String temp;
								int temporary;

								temp = vecname.get(j);
								vecname.set(j, vecname.get(j + 1));
								vecname.set((j + 1), temp);

								temp = vecpos.get(j);
								vecpos.set(j, vecpos.get(j + 1));
								vecpos.set((j + 1), temp);

								temporary = vecsalary.get(j);
								vecsalary.set(j, vecsalary.get(j + 1));
								vecsalary.set((j + 1), temporary);
							}
						}
					}

					for (int i = 0; i < vecname.size(); i++) {
						System.out.println("No. " + (i + 1));
						System.out.println("Name     : " + vecname.get(i));
						System.out.println("Position : " + vecpos.get(i));
						System.out.println("Salary   : $" + vecsalary.get(i));
						System.out.println("");
					}
					break;
				}
			} while (menu2 != 3);

		}
	}

	public static void main(String[] args) {
		do {
			System.out.println("My HC Manager");
			System.out.println("=============");
			System.out.println("1. Add Employee");
			System.out.println("2. View Employee by Ascending");
			System.out.println("3. Exit");
			do {
				System.out.print(">> ");
				try {
					menu1 = scan.nextInt();
				} catch (Exception e) {
					menu1 = -1;
				}
				scan.nextLine();
			} while (menu1 < 1 || menu1 > 3);
			System.out.println("");

			switch (menu1) {
			case 1:
				add();
				break;
			case 2:
				view();
				break;
			case 3:
				System.out.println("Thank you for using this application!");
				System.exit(0);
				break;
			}
		} while (menu1 != 3);

	}

}
