package hw4;

import java.util.Scanner;

public class H4 {
	public static void main(String[] args) {
//		有個一維陣列如下:
//		{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//		請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
//		int[]ar = {29,100,39,41,50,8,66,77,95,15};
//		int sum = 0;
//		int avg = 0;
//		for(int i =0;i<ar.length;i++) {
//			sum+=ar[i];					
//		}
//		sum/=ar.length;
//		System.out.println("平均值是:"+sum);
//		System.out.println("================");
//		System.out.println("大於平均值的數字有:");
//		 Arrays.sort(ar);
//		
//		for(int i=0;i<ar.length;i++) {
//			if(sum<ar[i]) {
//				
//				System.out.print(ar[i]+" ");
//				
//			}
//			
//		}	
		
//		請建立一個字串,經過程式執行後,輸入結果是反過來的
//		例如String s = “Hello World”,執行結果即為dlroW olleH
		
//		String originalString = "Hello World";
//		StringBuilder sb = new StringBuilder(originalString);
//		String reversedString = sb.reverse().toString();
//		System.out.println(reversedString);
		
//		• 有個字串陣列如下 (八大行星):
//		{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//		請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
//		String []star = {"mercury","venus","earth","mars","jupiter","saturn","uranus","neptune"};
//		int index =0;
//		int sum=0;
//		for(int i=0;i<star.length;i++) {
//			if(star[i].matches(".*[aeiou].*")) {
//				sum++;
//			}
//			
//		}
//		System.out.println("母音有:"+sum+"個");
		
//		String[] star = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
//        char[] letter = {'a', 'e', 'i', 'o', 'u'};
//        int sum = 0;
//        boolean hasVowel = false;
//        for (int i = 0; i < star.length; i++) {
//            // 記錄這個字串是否有母音
//    
//
//            for (int j = 0; j < letter.length; j++) {
//                if (star[i].indexOf(letter[j]) != -1) { // 找得到該母音
//                    hasVowel = true;
//                    break; // 找到一個就不用再找
//                }
//            }
//
//            if (hasVowel) {
//                sum++;
//            }
//        }
//
//        System.out.println("含母音的字串共有: " + sum + " 個");
		
//		請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
//		有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的
//		員工編號: 25 19 27 共 3 人!」
//		Scanner sc = new Scanner(System.in);
//		System.out.println("輸入你要借的金額:");
//		int input = sc.nextInt();
//		int[][]arr = {{25,32,8,19,27},
//					   {2500,800,500,1000,1200}};
//		int sum= 0;
//		int num =0;
//		String s ="";
//		for(int i=0;i<arr[0].length;i++) {
//			
//				if(arr[1][i]>=input) {
//					s+=arr[0][i]+" ";
//					
//					sum++;
//				
//			}
//			
//			
//		}
//		System.out.println("員工編號:"+s+"共:"+sum+"人");
//		sc.close();
//		• 請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天
//		例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」
//		Scanner sc = new Scanner(System.in);
//		System.out.println("輸入西元:");
//		int year = sc.nextInt();
//		System.out.println("輸入月份:");
//		int month = sc.nextInt();
//		System.out.println("輸入日期:");
//		int day = sc.nextInt();
//		int[]monthdate= {31,28,31,30,31,30,31,31,30,31,30,31} ;
//		
//			if(year%4==0&&year%100!=0||year%400==0) {
//				monthdate[1]=29;
//			}
//			int dayaddmonth = 0;
//			for(int i=0; i<month-1;i++) {
//				dayaddmonth+=monthdate[i];
//			}
//			dayaddmonth+=day;
//			System.out.println("西元:"+year+"年"+month+"月"+day+"日，是該年的:"+dayaddmonth+"天");
		
//		班上有8位同學,他們進行了6次考試結果如下:請算出每位同學考最高分的次數
		
		int [][] scores = {{10,37,100,77,98,90},
						   {35,75,70,95,70,80},
						   {40,77,79,70,89,100},
						   {100,89,90,89,90,75},
						   {90,64,75,60,75,50},
						   {85,75,70,75,90,20},
						   {75,70,79,85,89,99},
						   {70,95,90,89,90,75},};
		for(int i=0;i<scores.length;i++) {
			int max = scores[i][0];
			for(int j=0;j<scores[i].length;j++) {
				if(scores[i][j]>max) {
					max=scores[i][j];
				}
			}
			int count=0;
			for(int j=0;j<scores[i].length;j++) {
				if(scores[i][j]==max) {
				count++;
			}
		}
			System.out.println((i+1)+"號同學的最高成績是:"+max+"分，總共:"+count+"次");
	}
		
	}
}
