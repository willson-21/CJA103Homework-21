package hw6;

import java.util.Random;

public class getAuth {
	public static void main(String[] args) {
		getAuth a = new getAuth();
		a.genAuthCode();
		
		
	}
	public  static void genAuthCode() {
		String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		Random random = new Random();
		String result = "";

		for (int i = 0; i < 8; i++) {
		    int index = random.nextInt(chars.length());
		    result += chars.charAt(index); // 取出「字元」加到字串
		}
		System.out.println("隨機亂數產生:"+result);
	}
}
