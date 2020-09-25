package lineComparsionPackage;

import java.util.Scanner;

public class LineComparison {
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to line comparison problem\n");
		
		Scanner sc=new Scanner(System.in);
		int x11,y11;
		int x12,y12;
		
		int x21,y21;
		int x22,y22;
		Double Length1,Length2;
		
		System.out.println("Enter the first coordinate (x11,y11) of line1");
		x11=sc.nextInt();
		y11=sc.nextInt();
		
		System.out.println("Enter the second coordinate (x12,y12) of line1");
		x12=sc.nextInt();
		y12=sc.nextInt();
		
		
		System.out.println("Enter the first coordinate (x21,y21) of line2");
		x21=sc.nextInt();
		y21=sc.nextInt();
		
		System.out.println("Enter the second coordinate (x22,y22) of line2");
		x22=sc.nextInt();
		y22=sc.nextInt();
		
		Length1=Math.sqrt( ((x12-x11)*(x12-x11)) + ((y12-y11)*(y12-y11)) );
		Length2=Math.sqrt( ((x22-x21)*(x22-x21)) + ((y22-y21)*(y22-y21)) );
		
		if(Length1.equals(Length2))
		
		System.out.println("Lines are equal");
		
		else System.out.println("lines are not equal");
	}

}
