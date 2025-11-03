package hw6;

public class MyRectangle {
	private double width;
	private double depth;
	
	public MyRectangle() {
		
	}
	public MyRectangle(double width,double depth) {
		this.width = width;
		this.depth = depth;
	}
	
	public void setWidth(double width) {
		if(width>0) {
			this.width =width;
		}
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setDepth(double depth) {
		if(depth>0) {
			this.depth =depth;
		}
	}
	public double getDepth() {
		return depth;
	}
	
	public double getArea() {
		return width*depth;
		
	}
}
