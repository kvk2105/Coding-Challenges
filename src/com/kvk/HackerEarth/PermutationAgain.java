package com.kvk.HackerEarth;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PermutationAgain {
	static long res=0;
	private static void permutation(String prefix, String str){
        if (str.length() == 0) {
        	int sum=0;
            String[] temp=prefix.split(",");
	            if(temp.length>2){
	            	for(int i=1;i<temp.length-1;i++){
		            	sum=sum+(Math.abs(Integer.parseInt(temp[i])-Integer.parseInt(temp[i+1])));
		            }
	            }
	            else
	            	sum=Integer.parseInt(temp[1]);
	           if(res<=sum)
	        	   res=sum;
            }
        else {
            for (int i = 0; i < str.length(); i++)
                permutation(prefix +","+ str.charAt(i), 
            str.substring(0, i) + str.substring(i+1));
        }
    }
	
	public static void main(String[] args) {
    	
		Scanner sc=new Scanner(System.in);
		long T=sc.nextLong();
		List<Long> ip=new ArrayList<Long>();
		while((T--)>0){
		ip.add(sc.nextLong());
		}
		StringBuffer s=new StringBuffer();
		for (Long n : ip) {
			for(long i=0;i<n;i++){
				s=s.append(i+1);
			}
			permutation("", s.toString());
			System.out.println(res);
			res=0;
		}
	
    }
}
