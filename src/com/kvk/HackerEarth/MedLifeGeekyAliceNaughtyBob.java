package com.kvk.HackerEarth;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MedLifeGeekyAliceNaughtyBob {
	private static BigInteger sum=BigInteger.ZERO;
	private static int Finalsum=0;
	private static Map<Long, BigInteger> cache=new HashMap<Long,BigInteger>();
	
	public static int getSumOfDigits(BigInteger n){
		if(n.compareTo(BigInteger.valueOf(9))<=0)
			return n.intValue();
		else{
			BigInteger temp=BigInteger.ZERO,sum=BigInteger.ZERO;
			while(n!=BigInteger.valueOf(0)){
				temp=n.divideAndRemainder(BigInteger.valueOf(10))[1];
				sum=sum.add(temp);
				n=n.divide(BigInteger.valueOf(10));
			}
			if(sum.compareTo(BigInteger.valueOf(9))<=0)
				return sum.intValue();
			else
				return getSumOfDigits(sum);
		}
	}
	
	public static BigInteger factorial(long b){
		BigInteger temp;
		if(b==0)
			return BigInteger.ONE;
		else{
			if((temp=cache.get(b))!=null)
				return temp;
			temp=BigInteger.valueOf(b).multiply(factorial(b-1));
			cache.put(b, temp);
			return temp;
		}
	}
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			long A,B,T;
			List<Integer> resultList=new ArrayList<Integer>();
			T=sc.nextLong();
			while((T--)>0){
			    A=sc.nextLong();
			    B=sc.nextLong();
			    BigInteger t;
			    int p;
			    for(long i=A;i<=B;i++){
			    	t=factorial(i);
			    	p=getSumOfDigits(t);
			    	Finalsum=getSumOfDigits(BigInteger.valueOf(Finalsum))+p;
			    }
			    resultList.add(Finalsum);
			}
			for (Integer item : resultList) {
				System.out.println(item);
			}
		    sc.close();
	}
}
