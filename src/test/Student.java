package test;

public class Student {
	int score=90;
	public void play (int hours) {
		score-= hours;
	}
	
	public void study(int hours) {
		score+= hours;
	}
	
	public static void main(String[] args) {
		Student tom = new Student();
		Student joy = new Student();
		System.out.println(tom.score);
		System.out.println(joy.score);
		System.out.println("==============");
		tom.play(5);
		tom.study(1);
		joy.study(5);
		joy.play(2);
		System.out.println(tom.score);
		System.out.println(joy.score);
	}

}
