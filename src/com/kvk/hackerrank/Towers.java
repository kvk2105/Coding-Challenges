package com.kvk.hackerrank;

import java.rmi.server.ExportException;
import java.util.Scanner;

public class Towers {
    static long count=0;
    static String temp="";
	public static void generateString(long maxLength, int[] a,String b){
		
		if(maxLength>=b.length()){
			int sum=0;
			for(int n=0;n<b.length();n++){
					sum=sum+Character.getNumericValue(b.charAt(n));
			}
			if(sum==s){
				count++;
			}
			else{
				for(int j=0;j<a.length;j++){
					temp=b;
					b=b+a[j];
					generateString(maxLength, a,b);
					b=temp;
				}	
			}
		}
	}
	static long s=0;
    
    public static void main(String[] args) {
      Scanner scanner=new Scanner(System.in);
		s=scanner.nextLong();
		int ipLength=scanner.nextInt();
		int[] a=new int[ipLength];
		int index=0;
		while(index<ipLength)
			a[index++]=scanner.nextInt();
		
		int min,max;
		min=max=a[0];
		for(int i:a){
			if(i<=min)
				min=i;
			if(i>max)
				max=i;
		}
		long maxlength=(s/min);
		//int[] b = new int[maxlength+1];
		String b="";
		int bIndex=0;
		generateString(maxlength, a, b);
		long result=(2*count)%(long)(Math.pow(10, 9)+7);
		System.out.println(result);
	
    }

}
