package hw6;

public class arrays06 {
	public static void main(String[] args) {
		int[] radm = new int[10]; // 準備存放10個亂數的陣列
        int count = 0;            // 已經放進陣列的數量
        int avg =0;
        int sum =0;

        while (count < radm.length) {
            int rad = (int)(Math.random() * 100) + 1; // 產生1~100的亂數
            boolean duplicate = false; // 檢查是否重複的旗標

            // 檢查是否和之前的亂數重複
            for (int i = 0; i < count; i++) {
                if (radm[i] == rad) {
                    duplicate = true; // 有重複
                    break;            // 不用再比了
                }
            }

            // 如果不重複才放進陣列
            if (!duplicate) {
                radm[count] = rad;
                count++;           
            }
        }
        System.out.print("亂數結果:");
        // 印出結果
        for (int n =0; n<radm.length;n++) {
            System.out.print(radm[n]+" ");
            sum+=radm[n];
        }
        avg=sum/radm.length;
        System.out.println("平均值:"+avg);
	}
}
