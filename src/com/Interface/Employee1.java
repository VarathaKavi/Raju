package com.Interface;

public class Employee1 {
	public static void main(String[] args) {
		// its on three dimensional array
		int [] [] []a1=new int [4][2][2];
		
		a1[0][0][0]=21;
		a1[0][1][0]=22;
		a1[0][0][1]=23;
		a1[0][1][1]=24;
		
		a1[1][0][0]=10;
		a1[1][1][0]=20;
		a1[1][0][1]=30;
		a1[1][1][1]=40;
		
		a1[2][0][0]=11;
		a1[2][1][0]=12;
		a1[2][0][1]=13;
		a1[2][1][1]=14;
		
		a1[3][0][0]=1;
		a1[3][1][0]=2;
		a1[3][0][1]=3;
		a1[3][1][1]=4;
		
		
		for (int [][] b1 : a1) {
			for(int[] c1:b1) {
				for(int d1:c1) {
					System.out.println(d1+"\t");
					System.out.println();
				}
			}
			
		}
		
		
		
		
		
		
		
		
		
		
	}

}
