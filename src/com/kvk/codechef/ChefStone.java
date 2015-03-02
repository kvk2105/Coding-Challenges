package com.kvk.codechef;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ChefStone {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		long T=s.nextLong();
		long N=s.nextLong(),n=0,maxProfit=Long.MIN_VALUE;
		 
		long K=s.nextLong();
		List<Long> time=new ArrayList<Long>();
		Iterator<Long> timeIter;
		
		while(T>0){
			T--;
			n=N;
			while((n--)>0)
				//time.add(K/s.nextLong());
				time.add(s.nextLong());
			n=N;
			timeIter=time.iterator();
			long temp=0;
			while((n--)>0){
				//temp=s.nextLong()*timeIter.next();
				temp=(s.nextLong()/timeIter.next())*K;
				maxProfit=(temp>maxProfit)?temp:maxProfit;
			}
			time.clear();
			System.out.println(maxProfit);
			s.close();
		}
	}

}
