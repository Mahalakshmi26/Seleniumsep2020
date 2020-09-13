package week1.ass;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int a=0,b=1,c = 0;
		System.out.println(a);
		System.out.println(b);
		for(int i=0;i<=n;i++) {
			c=a+b;
			a=b;
			b=c;
			
			System.out.println(c);
			
		}
	}

}
