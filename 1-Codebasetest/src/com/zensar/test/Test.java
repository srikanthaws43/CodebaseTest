package com.zensar.test;
import java.util.Scanner;
public class Test
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			String str;
			int i,len,counter;
			int Counter[]=new int[256];
			Scanner sc=new Scanner(System.in);
			System.out.print("please enter a string: ");
			 str=sc.nextLine();
			
			len=str.length();
			for(i=0;i<len;i++) {
			    Counter[(int)str.charAt(i)]++;
				
			}
			
			for(i=0;i<256;i++)
			{
				if(Counter[i]!=0)
				{
		System.out.println((char)i +"-->"+ Counter[i]);
		
				}
			}
       }
}
			

