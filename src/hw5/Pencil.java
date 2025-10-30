package hw5;

public class Pencil extends Pen {
	private double discount;
	public Pencil() {
		super();
	}
	
	public void write() {
		System.out.println("打折後的價格:"+ discount);
		System.out.println("削鉛筆再寫");
		System.out.println("==================");
	}
	public Pencil(String brand,int price, double discount) {
		super(brand,price);
		this.discount = discount*0.8;
		}
	public double getDiscount() {
		return discount;
	}
	
	
}
