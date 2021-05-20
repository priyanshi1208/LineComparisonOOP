package com.linecomparison;

public class CheckEquality{
	
	public void equal(Double Length1,Double Length2) {
		// Length1=super.length(x1,y1,x2,y2);
		if (Length1.equals(Length2)) {
			String message = "The two lines are equal";
			System.out.println(message);
		} else {
			String message = "The two lines are not equal";
			System.out.println(message);
		}
	}
}
