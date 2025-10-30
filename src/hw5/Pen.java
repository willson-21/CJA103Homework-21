package hw5;

public abstract class Pen {
	private String 	brand;
	private double  price;

	public Pen() {
		
	}
	public Pen(String brand, double price) {
		this.brand = brand;
		this.price = price;
	}
	public Pen(String brand) {
		this.brand = brand;
	}
	public Pen(double price) {
		this.price = price;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}
	public void setPrice(double price) {
		if(price>0) {
			this.price = price;
		}
		else {
		System.out.println("不是正確售價");
		}
	}

	public double getPrice() {
		return price;
	}
	public abstract void write();

	public void showInfo() {
		System.out.println("牌子為：" + brand);
		System.out.println("價格為：" + price);
		
	}

}

