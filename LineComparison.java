package lineComparsionPackage;

import java.util.Scanner;

public class LineComparison {
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to line comparison problem\n");
		
		Scanner sc=new Scanner(System.in);
		int x1,y1;
		int x2,y2;
		double Length;
		
		System.out.println("Enter the first coordinate (x1,y1) of line");
		x1=sc.nextInt();
		y1=sc.nextInt();
		
		System.out.println("Enter the first coordinate (x2,y2) of line");
		x2=sc.nextInt();
		y2=sc.nextInt();
		
		Length=Math.sqrt( ((x2-x1)^2) + ((y2-y1)^2) );
		
		System.out.println("Length of light is "+Length);
	}

}
