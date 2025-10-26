package test;

public class Animal {
	private int age;
	private float weight;
	

	public  Animal(int age, float weight) {
		this.age = age;
		this.weight =weight;
		if(age>0)
		this.age=age;
		else {
			System.out.println("歲數不對");
		}
		if(weight>0)
			this.weight=weight;
			else {
				System.out.println("重量不對");
			}
	}
	public void speak() {
		if(age>0 & weight>0) {
			System.out.println(age+"歲");
			System.out.println(weight+"公斤");	
		}			
				
	}
	public int getAge() {
		return age;
	}
	public float getWeight() {
		return weight;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public void setWeight(float weight) {
		this.weight=weight;
	}

}

