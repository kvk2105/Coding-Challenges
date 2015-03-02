package com.kvk.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HalloweenParty {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        List<Long> input=new ArrayList<>();
        //Reading input
        for(int i=0;i<t;i++){
            input.add(s.nextLong());
        }
        int inputSize=input.size();
        long p=0;
        //Processing each test case
        for(int i=0;i<inputSize;i++){
        	p=input.get(i);
        	if(p%2==0)
        		System.out.println((p/2)*(p/2));
        	else
        		System.out.println((p/2)*((p/2)+1));
        }
    }
}