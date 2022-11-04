package com.Himanshu;
import java.util.Scanner;
public class Factorial {
	public static void main(String abc []) {
		
		int i,fact=1;
		
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter the numbber ");
		int num=sc.nextInt();
		
		for(i=1;i<=num;i++)
		{
			fact=fact*i;
				
		}
		System.out.println(fact);
	}

}
