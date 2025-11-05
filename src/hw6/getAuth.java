package hw6;

import java.util.Random;

public class getAuth {
	public static void main(String[] args) {
		getAuth a = new getAuth();
		a.genAuthCode();
		
		
	}
	public  static void genAuthCode() {
		String chs ="ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890#@!%";
		Random rad = new Random();
		String result ="";
		for(int i=0;i<8;i++) {
			int dex = rad.nextInt(chs.length());
			result+=chs.charAt(dex);
		}
		System.out.println("隨機碼產生:"+result);
	}
}
