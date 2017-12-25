package com.test.test;

public class ForLoop {

	public static void main(String[] args) {
		
		//int i = 11;
		/*while(i != 10) {
			System.out.println(i);
			i++;
		}*/
		
		/*do {
			System.out.println(i);
			i++;
		}
		while(i<10);*/
		
		for(int i=1; i<10; i++) {
			
			if(i==5) {
				//System.out.println("I value reached to 5. I am continue");
				//break;
				continue;
			}
			System.out.println(i);
		}
		//System.out.println("Outside loop");
	}
}
