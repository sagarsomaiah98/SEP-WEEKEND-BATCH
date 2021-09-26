package com.janbask.breakcontinueKeyword;

public class Continue_Keyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int b= 50;
		
		
		for( int i=0;i< 20;i++) {
			
			System.out.println(" i values --  "+i );
			
			if( b==i) 
			{
			System.out.println(" search value found == "+i);
			continue;
			}
			
		}

	}

}
