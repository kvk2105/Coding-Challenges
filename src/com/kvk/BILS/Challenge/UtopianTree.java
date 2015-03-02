package com.kvk.BILS.Challenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UtopianTree {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int T=s.nextInt(),n_cycles;
		List<Integer> op=new ArrayList<Integer>();
		boolean flag;
		int length;
		
		while(T>0){
			length=1;
			flag=true;
			T--;
			n_cycles=s.nextInt();
			while((n_cycles--)>0){
				if(flag){
					length*=2;
					flag=false;
				}else{
					length+=1;
					flag=true;
				}
			}
			op.add(length);
		}
		for (Integer len: op) {
			System.out.println(len);
		}
	}
}
