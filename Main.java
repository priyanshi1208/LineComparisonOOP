package com.linecomparison;

public class Main {
public static void main(String[] args) {
	LengthCalculation length=new LengthCalculation();
	Double l1=length.length(2, 4, 5, 7);
	LengthCalculation length1=new LengthCalculation();
	Double l2=length1.length(3,5,4,7);
	CheckEquality equal=new CheckEquality();
	equal.equal(l1, l2);
	CompareLine compare=new CompareLine();
	compare.compare(l1, l2);
	
}
}
