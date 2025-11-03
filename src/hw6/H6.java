package hw6;

import java.util.Scanner;

public class H6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("輸入寬:");
		int width = sc.nextInt();
		System.out.println("輸入高:");
		int height = sc.nextInt();
		starSquare(width,height);
		sc.close();
	
		
	}
	
	public static void starSquare(int width, int height) {
		if(width<0||height<0) {
			System.out.println("寬和高不能輸入小於0的數字");
			return;
		}
		
		for(int i=0;i<height;i++) {
		for(int j=0;j<width;j++) {
			System.out.print("*");
			}
		System.out.println();
		}
		
	}
	
}
