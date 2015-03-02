package com.kvk.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaumAndBday {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int T=s.nextInt();
		long B,W,X,Y,Z,res,convertingUnits=0;
		List<Long> result=new ArrayList<Long>();
		while((T--)>0){
			B=s.nextLong();
			W=s.nextLong();
			X=s.nextLong();
			Y=s.nextLong();
			Z=s.nextLong();
			if(Math.min(X, Y)>Z){
				if(X<Y)
					convertingUnits=W;
				else
					convertingUnits=B;
				res=((B+W)* Math.min(X, Y))+(convertingUnits)*Z;
				result.add(res);
			}else{
				res=(B*X)+(W*Y);
				result.add(res);
			}
		}
		for (Long l : result) {
			System.out.println(l);
		}
	}

}
