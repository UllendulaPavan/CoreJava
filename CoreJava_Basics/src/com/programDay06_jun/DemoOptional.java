package com.programDay06_jun;

import java.util.Optional;

public class DemoOptional {
	public static Optional<Double> findAvg(double... marks) {
		if (marks.length == 0) {
			return Optional.empty();
		} else {
			double sum = 0;
			for (double mark : marks) {
				sum += mark;
			}
			return Optional.of(sum / marks.length);
		}
	}

	public static void main(String[] args) {
		Optional<Double> avg = findAvg();
		System.out.println("Avg is : "+avg );
	}
}
