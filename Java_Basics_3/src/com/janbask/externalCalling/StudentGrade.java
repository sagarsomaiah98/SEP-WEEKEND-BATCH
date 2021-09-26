package com.janbask.externalCalling;

public class StudentGrade {
	
	
public void studentRank(int mark) {
	
	if(mark>90)
		System.out.println("A GRADE");
	else if(mark>80)
		System.out.println("B GRADE");
	else if (mark>70)
        System.out.println("C GRADE");
	else if(mark>60)
		System.out.println("D GRADE");
	else
		System.out.println("FAILED");
		
		
	}

}
