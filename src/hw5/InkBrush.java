package hw5;

public class InkBrush extends Pen {
	private double discount;
	public InkBrush() {
		super();
	}
	public InkBrush(String brand,int price, double discount) {
		super(brand,price);
		this.discount = discount*0.9;
		}
		public void write(){
		System.out.println("打折後的價格:"+ discount);
		System.out.println("沾墨水再寫");	
		System.out.println("==================");
		}
	public double getDiscount() {
		return discount;
	}

}
