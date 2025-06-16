package com.programDay_26mar;

import java.util.Scanner;

public class Testing {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the food Items:");
		int n = sc.nextInt();

		Food f = null;

		for (int i = 1; i <= n; i++) {

			System.out.print("enter the food type:");
			String name = sc.next();
			System.out.println("enter the protein:");
			double p = sc.nextDouble();
			System.out.println("enter the fats:");
			double fat = sc.nextDouble();
			System.out.println("enter the carbs:");
			double c = sc.nextDouble();

			if (name.equals("Egg")) {
				f = new Egg(p, fat, c);

				Egg e = (Egg) f;
				System.out.println("Egg is " + e.getType());
				e.getMacroNutrients();
				System.out.println("Tasty score is : " + e.getTaste());
			} else {
				f = new Bread(p, fat, c);
				Bread b = (Bread) f;
				System.out.println("Bread is " + b.getType());
				b.getMacroNutrients();
				System.out.println("Tasty score is : " + b.getTaste());
			}
			System.out.println("================================================================================");

		}

	}

}
