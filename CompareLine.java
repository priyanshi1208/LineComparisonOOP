package com.linecomparison;

public class CompareLine {
	public void compare(Double Length1, Double Length2) {
		int res = Length1.compareTo(Length2);
		if (res > 0) {
			String message = "Length 1 is greater than Length 2";
			System.out.println(message);
		} else if (res < 0) {
			String message = "Length 2 is greate than Length 1";
			System.out.println(message);
		} else {
			String message = "The two lines are equal";
			System.out.println(message);
		}
	}
}
