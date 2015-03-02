package com.kvk.hackerrank;

import java.io.ObjectOutputStream.PutField;
import java.util.Scanner;

public class Cipher {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=0,k=0;
		char[] s;
		n=scanner.nextInt();
		k=scanner.nextInt();
		s=scanner.next().toCharArray();
		int a=0;
		int[] input=new int[s.length];
		for(char c:s)
			input[a++]=Character.getNumericValue(c);
		int[] output=new int[s.length-k+1];
		int j=0,p,XOR;
		
		for(int i=input.length-1;i>(k-1);i--){
			
			if(j==0){
				output[j++]=input[i];
				XOR=Character.getNumericValue(s[s.length-1]);
			}
			else{
				p=0;
				XOR=Character.getNumericValue(s[i]);
				for(int m=j-1;(m>=0 && p<k);m--){
					p++;
					XOR=XOR^output[m];
				}
				output[j++]=XOR;
			}
		}
		int temp=0;
		int opLen=output.length;
		for(int b=0;b<opLen/2;b++){
			temp=output[b];
			output[b]=output[opLen-1-b];
			output[opLen-1-b]=temp;
		}
		for(int i:output)
			System.out.print(output[i]);
	}

}
