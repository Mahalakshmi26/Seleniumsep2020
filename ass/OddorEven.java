package week1.ass;

import java.util.Scanner;

public class OddorEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ODD OR EVEN");
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		System.out.println("odd numbers");
		for(int i=0;i<=n;i++)
		 {
			if(i%2==1) 
				
			{
				
				System.out.println(i);
			}
			
		}
		 System.out.println("even numb");
			for(int i=0;i<=n;i++){
				if(i%2==0) 
					
				{
					
					System.out.println(i);
				}
				
			}
		 
		
	}

}
