package hw3;

import java.util.Scanner;

public class H3 {
	public static void main(String[] args) {
//		• 請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰
//		三角形、其它三角形或不是三角形,如圖示結果:
//		System.out.println("請輸入三個整數；");
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		if(num<=0||num1<=0||num2<=0){
//			System.out.println("不是三角形");
//		}
//		else if(num+num1<num2||num1+num2<num||num+num2<num1) {
//			System.out.println("不是三角形");
//		}
//		else {
//		     if(num==num1&&num1==num2) {
//				System.out.println("正三角形");
//			}
//			
//		else if(num==num1||num1==num2||num==num2) {
//				 
//					 System.out.println("等腰三角形");
//				 }
//				
//		else if(isNumeTright(num,num1,num2)) 
//		{
//				System.out.println("直角三角形");
//			}
//		else  {
//				System.out.println("其他三角形");
//		}
//	 } 
//
//		
//	}
//	public static boolean isNumeTright(int num,int num1,int num2) {
//		int[]side = {num,num1,num2};
//		Arrays.sort(side);
//		return side[0]*side[0]+side[1]*side[1] == side[2]*side[2];
		
//		請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜
//		對則顯示正確訊息,如圖示結果:
		
//		System.out.println(a);
//		int a = (int)(Math.random()*9);
//		System.out.println("猜0~9");
//		Scanner s = new Scanner(System.in);
//		
//		while(true) {
//			int num = s.nextInt();
//			
//			if(num!=a) {
//			   System.out.println("再猜");
//			}
//			
//			if(num==a) {
//				System.out.println("恭喜猜中是數字"+a);
//				break;
//			}
//		}
//		(進階功能:產生0~100亂數,每次猜就會提示你是大於還是小於正確答案)
//		int randnum = (int)(Math.random()*100);
//		System.out.println("猜0~100");
//		Scanner sc = new Scanner(System.in);
//		
//		while(true) {
//			int guess = sc.nextInt();
//			
//			if(guess == randnum) {
//				System.out.println("恭喜猜中是"+randnum);
//				break;
//			}
//			else if(guess > randnum) {
//				System.out.println("猜小一點");
//			}
//			else if(guess < randnum) {
//				System.out.println("猜大一點");
//			}
//		}
//		阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討
//		厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇
//		的號碼與總數
//		Scanner sc = new Scanner(System.in);
//		System.out.println("輸入不喜歡的數字1~9:");
//		int put = sc.nextInt();
//		int sum = 0;
//		int [][]arrays = new int[6][6]; 
//		for(int i =1; i<=49; i++) {
//			int num = i;
//			boolean ts = false;
//			while(num>0) {
//				int dg = num%10;
//				if(dg==put) {
//					ts = true;
//					break;
//				}
//				num/=10;
//			}
//			if(ts) {
//				continue;
//			}
//			System.out.print(i+" ");
//			sum++;
//		}
//			System.out.println("共"+sum+"個可選");

//		Scanner sc = new Scanner(System.in);
//		System.out.println("輸入不喜歡的數字1~9:");
//		int put = sc.nextInt();
//		
//		int[][]arr = new int[7][7];
//		int num =1;
//		int count =0;
//		for(int i=0; i< 7;i++) {
//			for(int j =0; j < 7; j++) {
//				while(num<=49 && num% 10 == put || num /10 ==put) {
//					num++;
//				}
//				if(num>49) {
//					arr[i][j] = 0;
//				}else {
//					arr[i][j] = num;
//					num++;
//					count++;
//				}
//			}
//		}
//		
//		for(int i =0;i<7;i++) {
//			for(int j=0;j<7;j++) {
//				if(arr[i][j]==0) {
//					System.out.print("");
//				}else {
//					System.out.print(arr[i][j]+"\t");
//			}
//		}
//			System.out.println();
//	}
//		System.out.println("共有:"+count+"個可選");
//		sc.close();
		
		
//		 Scanner sc = new Scanner(System.in);
//	        System.out.print("請輸入要排除的數字(1~9): ");
//	        int put = sc.nextInt();

//	        int rand = (int) (Math.random()*49)+1;
//	        int[] lotto = new int[6]; // 用來儲存6個亂數
//	        int count = 0;
//
//	        while (count < 6) {
//	            int num =(int) (Math.random()*49)+1; // 產生1~49的亂數
//
//	            // 用數學方式判斷是否含有排除數字
//	            if (num % 10 == exclude || num / 10 == exclude) {
//	                continue; // 含有排除數字 → 跳過
//	            }
//
//	            // 檢查是否重複
//	            boolean duplicate = false;
//	            for (int i = 0; i < count; i++) {
//	                if (lotto[i] == num) {
//	                    duplicate = true;
//	                    break;
//	                }
//	            }
//
//	            if (!duplicate) {
//	                lotto[count] = num;
//	                count++;
//	            }
//	        }
//
//	        // 排序讓結果美觀
//	        Arrays.sort(lotto);
//
//	        // 顯示結果
//	        System.out.println("排除含 " + exclude + " 的數字後，抽出的6個號碼：");
//	        for (int n : lotto) {
//	            System.out.print(n + " ");
//	        }
//
//	        sc.close();
		
		    Scanner sc = new Scanner(System.in);
	        System.out.print("請輸入要排除的數字(1~9): ");
	        int put = sc.nextInt();
	        
//	        int radnum =(int)(Math.random()*49)+1;//亂數
	        int[]arr = new int[6];//放入亂數的陣列
	        int count = 0;
	        while(count<6) { //如果count小於6
	        	int num = (int)(Math.random()*49)+1;
	        	
	        	if(num%10==put||num/10==put) { //比對num和使用者輸入的數字
	        		continue; //如果一樣就跳過
	        	}
	        	boolean b = false;//判斷是否重複所以使用布林
	        	for(int i=0; i<count; i++) {
	        		if(arr[i]==num) { //如果使用者裡面的數字是亂數一樣的話
	        			b = true; //就改變布林條件
	        			break; //重複的數字就跳出
	        		}
	        	}
	        	if(!b) { //不是重複的數字
	        		arr[count]= num; //那就把num的值裝入arr陣列裡面的count索引標籤內
	        		count++; //每次執行到就加一次
	        	}
	        	
	        }
	        java.util.Arrays.sort(arr); //排序arr陣列	       
	        for(int i =0; i<arr.length;i++) {
	        	int a = arr[i];
	        	System.out.print(a+"\t");
	        }
	        sc.close();
	}
}
