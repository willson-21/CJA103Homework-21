package test;

public class Elephant extends Animal {
	private String name;

	//此方法沒有改寫成功，但不會有錯誤提示
	//因為被編譯器理解為overload(多載)了
	//一個是父類別繼承到的speak()
	//一個是子類別宣告speak(int data)
	
	//讓編譯器對此方法的檢查是以override規則檢視，讓我們操作在
	@Override
	public void speak() {
		super.speak();
		System.out.println("動物的名子:"+name);
	}
	

	public Elephant(int age, float weight, String name) {
		super(age,weight);
		this.name =name;
		
	}
	
	public String setName() {
		return name;
	}
	public void getName(String name) {
		this.name = name;
	}
	
}
