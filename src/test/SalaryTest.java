package test;

public class SalaryTest {
	public static void main(String[] args) {
		FullTimeEmployee s = new FullTimeEmployee(1001,"Som",50000);
		Manager w = new Manager(101,"wa",60000,5000);
		
		System.out.println(s. getFullTimeEmployee());
		System.out.println(w.getManagerSalary());
	}
}
