package hw5x2;



public abstract class Hero {
	// 省略 getter/setter...
	private IAttackBehavior attackBehavior;
	private IDefense defendBehavior;
	private IMove runBehavior;
	
	public void setAttackBehavior(IAttackBehavior attackBehaviorattackBehavior) {
		this.attackBehavior = attackBehavior;
	}
	public void setDefendBehavior(IDefense defendBehavior) {
		this.defendBehavior = defendBehavior;
	}
	public void setRunBehavior(IMove runBehavior) {
		this.runBehavior = runBehavior;
	}
	
	private String name;
	private int level;
	private double exp;
	
	public Hero() {
		this("David", 1, 0);
	}
	
	public Hero(String name, int level, double exp) {
		this.name = name;
		this.level = level;
		this.exp = exp;
	}
	protected void attack() {
		attackBehavior.attack();
	}
	
	protected void defend() {
		defendBehavior.defense();
	}
	
	protected void run() {
		runBehavior.run();
	}
	
//	public abstract void attack();
//	
//	public abstract void move();
//	
//	public abstract void defend();
}
