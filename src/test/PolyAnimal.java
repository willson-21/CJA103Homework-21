package test;

public class PolyAnimal {
	public  static void main(String[] args) {
		Animal[]a = new Animal[2];
		a[0] =new Animal(3,8.0f);
		a[1] = new Elephant(8,2000.0f,"超級大象");
		
		for (int i = 0; i < a.length; i++)
			a[i].speak();
		
		System.out.println("============");
		}

	}
