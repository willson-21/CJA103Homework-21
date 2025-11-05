package hw7;

public class Calculator {
	private int x;
	private int y;
	
	public Calculator() {
		
	}
	
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) throws CalException{
		if (x > 0)
			this.x = x;
		else
			throw new CalException("正立方體邊長不得為0或是負數");
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) throws CalException{
		if (y > 0)
			this.y = y;
		else
			throw new CalException("正立方體邊長不得為0或是負數");
	}
	
	
	public int power(int x, int y) throws CalException {
	    if (x == 0 || y == 0)
	        throw new CalException("0 的次方沒有定義！");
	    System.out.print(x+"的"+y+"次方等於:");
	    return (int) Math.pow(x, y);
	}
	
}
