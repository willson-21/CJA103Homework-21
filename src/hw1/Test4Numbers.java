package hw1;

public class Test4Numbers {
	public static void main(String[] args) {
		//可輸入0~100裡的4的倍數
//		for(int i=0; i<=100;i++) {
//			
//			if(i%4==0) {
//				System.out.print(i+" ");
//			}	
//			
//		}
		
		//while
//			int i = 0;
//			
//			while(i<=100) {
//				if(i%4==0) {					
//					System.out.print(i+" ");
//					i+=1;
//				}
//				i++;
//			}
		//do...while
//		int i = 0;
//		do {			
//			if(i%4==0) {			
//				System.out.print(i+" ");			
//			}			
//			i+=1;
//			
//		}while(i<=100);
		
//		int sum = 0;
//		int count;
//		for(count=1; count <=10; count=count+1) {
//			sum += count;
//		}
//		System.out.println(count);
//		for(int i =1; i<=5; i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//			}
//			
//			System.out.println();
//			
//		}
//		for(int i=5;i>=1;i--) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		//一:使用for迴圈 + while迴圈 九九乘法表
//		int i, j;
//		for (i = 1; i <= 9; i++) {
//			for (j = 1; j <= 9; j++)
//				System.out.print(i + "*" + j + "=" + i * j + "\t");
//			System.out.println();
//		}
//		int i,j=1;
//		for(i=1; i<=9;i++) {
//			while(j<=9) {
//				System.out.print(i + "*" + j + "=" + i * j + "\t");
//				j++;	
//			}
//			j=1;//初始化j=1迴圈就會到這裡執行
//			System.out.println();
//		}
		//二:使用for迴圈 + do while迴圈
//		int i,j=1;
//		for(i=1; i<=9;i++) {
//			do {
//				System.out.print(i + "*" + j + "=" + i * j + "\t");
//				j++;
//			}while(j<=9);
//			j=1;
//			System.out.println();
//		}
		//三:使用while迴圈 + do while迴圈
//		int i=1,j=1;
//		while(i<=9) {
//			do {
//				j++;
//				System.out.print(i + "*" + j + "=" + i * j + "\t");
//				
//			}while(j<9);
//			i++;
//			System.out.println();
//			j=1;
//		}
	}
	
}
