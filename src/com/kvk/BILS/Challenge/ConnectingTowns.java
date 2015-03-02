package com.kvk.BILS.Challenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConnectingTowns {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int T=s.nextInt();
		int towns=0;
		long result=1;
		List<Long> res=new ArrayList<Long>();
		while((T--)>0){
			towns=s.nextInt();
			while(towns-- > 1)
				result=((result % 1234567) *s.nextInt())%1234567;
			res.add(result);
			result=1;
		}
		for (Long l : res) {
			System.out.println(l%1234567);
		}
	}

}
