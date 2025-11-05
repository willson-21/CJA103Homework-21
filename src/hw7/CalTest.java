package hw7;

import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) throws CalException {
		Scanner sc = new Scanner(System.in);
        Calculator c = new Calculator();
    
        while(true) {
        	try {
        	System.out.println("請輸入數字:");
        	String inputX = sc.nextLine();
        	System.out.println("請輸入次方:");
            String inputY = sc.nextLine();
            
            //檢查只能讓數字通過
            if(!inputX.matches("\\d+")||!inputY.matches("\\d+")) {
            	throw new CalException("輸入錯誤，只能輸入正整數");
            }
            //將字串轉成整數
            int x = Integer.parseInt(inputX);
            int y = Integer.parseInt(inputY);
            
            //判斷數字不能是0
            if(x <0 || y<0) {
            	throw new CalException("數字不能是0，需大於0");
            }    
            //輸入的值是正確的就跳出迴圈
            System.out.println(c.power(x, y));
            break;
            
        } catch(CalException e) {
        	System.out.println(e.getMessage());
        	System.out.println("請重新輸入");
        	
        }catch(Exception e) {
        	System.out.println("發生未知錯誤:"+e.getMessage());
        	
         }
       }
	}
}
