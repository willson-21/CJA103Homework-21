package test;

import java.util.Scanner;

public class Array_Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=1;
		int count=0;
		int[][]ar=new int[7][7];
		
		System.out.println("1~9選不喜歡的數字");
		int input = sc.nextInt();
		for(int i=0;i<7;i++) {
			for(int j=0;j<7;j++) {
				while(num<=49&&num/10==input||num%10==input) {
					num++;	
				}
				if(num>49) {
					ar[i][j]=0;
				}else {
					ar[i][j]=num;
					num++;
					count++;
				}
			}
		}
		
		for(int i=0;i<7;i++) {
			for(int j=0;j<7;j++) {
				if(ar[i][j]==0) {
					System.out.print("");
				}else {
					System.out.print(ar[i][j]+"\t");
				}
				
			}
			System.out.println();	
		}
		
		System.out.println("共"+count+"個可選");
	}
	
	
}
