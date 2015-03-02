package com.kvk.hackerrank;

import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

// The part of the program involving reading from STDIN and writing to STDOUT has been provided by us.

public class AngryChildren{
   static BufferedReader in = new BufferedReader(new InputStreamReader(
         System.in));
   static StringBuilder out = new StringBuilder();
   static int unfairness = Integer.MAX_VALUE;
   public static void getMinimumUnfairness(int numOfChildren, int[] packets,List<Integer> selectedPackets){
		
	   if(numOfChildren==selectedPackets.size()){
		  int min,max;
		  min=max=selectedPackets.get(0);
		   for(int i : selectedPackets){
			  if(min>i)
				  min=i;
			  if(max<i)
				  max=i;
		  }
		   if(unfairness<(max-min))
			   unfairness=(max-min);
	   }
	   else{
		for(int j=0;j<packets.length;j++){
			List<Integer>temp=selectedPackets;
			//selectedPackets=new int[selectedPackets.length+1];
			selectedPackets.add(packets[j]);
			getMinimumUnfairness(numOfChildren, packets, selectedPackets);
			selectedPackets=temp;
		}	
	   }
	}
   
   public static void main(String[] args) throws NumberFormatException, IOException {
      int numPackets = Integer.parseInt(in.readLine());
      int numKids = Integer.parseInt(in.readLine());
      int[] packets = new int[numPackets];
      
      for(int i = 0; i < numPackets; i ++)
      {
         packets[i] = Integer.parseInt(in.readLine());
      }
      List<Integer> selectedPackets = new ArrayList<Integer>();
      // Write your code here, to process numPackets N, numKids K, and the packets of candies
      // Compute the ideal value for unfairness over here
      getMinimumUnfairness(numKids, packets, selectedPackets);
      System.out.println(unfairness);
   }
}
