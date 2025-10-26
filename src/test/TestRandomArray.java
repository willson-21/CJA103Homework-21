package test;

public class TestRandomArray {
	public static void main(String[] args) {
		TestRandomArray a1 = new TestRandomArray();//建立a1的新物件
		int[][]x = a1.romArray(); //宣告x為a1物件的變數的方法
		int[][]y = a1.romArray();
		int[][]z = new int[3][3];
		
		
		
		for(int i=0;i<z.length;i++) {
			for(int j=0;j<z.length;j++) {
				z[i][j] = x[i][j]+y[i][j];
			}
		}
		
		a1.printArray(x); //呼叫a1以x變數的方法呈現
		a1.printArray(y);
		a1.printArray(z);//呼叫a1以y變數的方法呈現
		
	}
	public int[][] romArray(){//只能宣告在main方法以外
		int[][] data = new int[3][3]; //創建data的3X3的陣列物件
		for(int i=0; i<data.length;i++) {
			for(int j=0; j<data[i].length;j++) {
				data[i][j]=(int)(Math.random()*31);
			}
		}
		return data;
	}
	public void printArray(int[][]data) {//打裡面亂數的印索引值
		for(int i=0;i<data.length;i++) {
			for(int j=0; j<data[i].length;j++) {
				System.out.print(data[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("===================");
	}
	
}

