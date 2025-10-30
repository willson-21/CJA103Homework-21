package test;

public class TestWeight {
	public static void main(String[] args) {
		Weightable[] a = new Weightable[3];
		a[0] =new Dog();
		a[1] =new Plane();
		a[2] =new Powder();
		for (int i = 0; i < a.length; i++)
			a[i].printWeightTool();
		
		
	}
}
