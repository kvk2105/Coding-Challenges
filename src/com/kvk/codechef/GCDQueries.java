package com.kvk.codechef;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class GCDQueries {

	public static long getGCD(long first,long second){
		if(second==0)
			return first;
		return getGCD(second,first%second);
	}
	
public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		long T=s.nextLong(),N=0,K=0,n=0,result=0;
		List<Long> ip=new ArrayList<Long>();
		List<Long> op=new ArrayList<Long>();
		Iterator<Long> iter;
		long i=0,j=0,initial=0;
		while((T--)>0){
			N=s.nextLong();
			n=N;
			K=s.nextLong();
			while((n--)>0)
				ip.add(s.nextLong());
			
			while(K>0){
				iter=ip.iterator();
				i=s.nextLong();
				j=s.nextLong();
				n=1;
				
				if(i>1)
					initial=iter.next();
				else{
					while(n++==j)
						iter.next();
					initial=iter.next();
				}
				iter=ip.iterator();
				result=getGCD(initial, 0);
				n=1;
				while(n <= N){
					if(n>=i && n<=j){
						iter.next();
						n++;
						continue;
					}
					else{
						result=getGCD(result, iter.next());
						n++;
					}
				}
				op.add(result);
				K--;
			}
		}
		for (Long t : op) {
			System.out.println(t);
		}
	}
}
