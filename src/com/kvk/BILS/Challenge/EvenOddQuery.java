package com.kvk.BILS.Challenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class EvenOddQuery {

	static long ans=0;
	static List<Integer> A=new ArrayList<Integer>();
	
	public static long find(int x,int y)
	{
	    if(x>y) return 1;
	    ans =(long) Math.pow(A.get(x-1),find(x+1,y));
	    return ans;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		long N=s.nextLong(),i=0;
		while(i++<N)
			A.add(s.nextInt());
		long Q=s.nextLong(),res=0;
		List<String> result=new ArrayList<String>();
		while((Q--)>0){
			res=find(s.nextInt(),s.nextInt());
			if(res%2==0)
				result.add("Even");
			else
				result.add("Odd");
		}
		for (String r : result) {
			System.out.println(r);
		}
	}
}
