package com.kvk.BILS.Challenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JimBeam {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int T=s.nextInt();
		long x1,x2,y1,y2,xm,ym,b1=-1,c2=0;
		double x,y,a1,c1,a2,b2,determinant;
		List<String> result=new ArrayList<String>();
		while((T--)>0){
			x1=s.nextLong();
			y1=s.nextLong();
			x2=s.nextLong();
			y2=s.nextLong();
			xm=s.nextLong();
			ym=s.nextLong();
			
			a1=(y2-y1)/(x2-x1);
			c1=(a1*x1)-y1;
			a2=ym;
			b2=-xm;
			determinant=((a1*b2) - (a2*b1));
			if(determinant==0){
				if(xm<=Math.min(x1, x2) && ym<=Math.min(y1, y2))
					result.add("YES");
				else
					result.add("NO");
			}
			else{
				x=(((b2*c1)-(b1*c2)))/determinant;
				y=(((a1*c2)-(a2*c1)))/determinant;
	
				if(x>=Math.min(0, xm) && x<=Math.max(0, xm) && y>=Math.min(0, ym) && y<=Math.max(0, ym))
					result.add("NO");
				else
					result.add("YES");
			}
		}
		for (String res : result) {
			System.out.println(res);
		}
	}
}
