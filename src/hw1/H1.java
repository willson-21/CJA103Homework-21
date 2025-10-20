package hw1;

public class H1 {
	public static void main(String[] args) {
		//1.請設計一隻Java程式,計算12,6這兩個數值的和與積
//		int num = 12, num1 = 6;
//		System.out.println("12+6="+(num+num1)+"\t"+"12X6="+(num*num1));
		//2.請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
//		int egg=200,dozen=12;
//		System.out.println("200顆蛋共"+(egg/dozen)+"打"+(egg%dozen)+"顆");
		//3.請由程式算出256559秒為多少天、多少小時、多少分與多少秒
//		int tasec =256559;//總秒數
//		int day =tasec/86400; //以天計算是24X60X60=86400秒
//		int daysec =tasec%(24*3600);//以天的來換算剩餘的秒數
//		int hour=daysec/(60*60);//換算成小時
//		int hoursec =daysec%3600;//以小時來換算剩餘的秒數
//		int min =hoursec/60;//以小時的餘數除60秒
//		int sec =hoursec%60;//以小時剩餘換算成秒的餘數
//		System.out.println("256559秒為"+(day)+"天"+(hour)+"時"+(min)+"分"+(sec)+"秒");
//	    //4.請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
////		double pi =Math.PI;
//		final double pi = 3.1415;//宣告pi常數為3.1415
//		double rd =5;//宣告半徑為5
//		double a = pi*rd*rd);//圓面積
//		double b = rd*pi;//圓周長
//		System.out.println("5的圓面積為"+a+"圓周長為"+b);
		
		
		  // 定義圓周率常數
//        final double PI = 3.1415;
//        // 定義半徑
//        double radius = 5;
//
//        // 計算圓面積
//        double area = PI * radius * radius;
//        // 計算圓周長
//        double circumference = 2 * PI * radius;
//
//        // 輸出結果
//        System.out.println("圓面積: " + area);
//        System.out.println("圓周長: " + circumference);
		
//某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本
//金加利息共有多少錢 (用複利計算,公式請自行google)
		double sal =150_000_0;
		float apr = 0.02f;
		double sal_apr = sal*apr;
		double money=sal+sal_apr;
		System.out.println(Math.round(sal_apr*10+sal));
		for(int i=1;i<10; i++) {
			
			money+=sal_apr;
		}
		System.out.println(Math.round(sal_apr*10+sal));
	}
}
