package template;

public abstract class Student {
	protected void goToSchool() {
		System.out.println("Student went to school");
	}
	protected abstract void goToClassA();
	protected abstract void goToClassB();
	protected abstract void eatLunch();
	protected abstract void goToClassC();
	protected void goHome() {
		System.out.println("Student went home");
	}
	
	public final void startDay() {
		goToSchool();
		goToClassA();
		goToClassB();
		eatLunch();
		goToClassC();
		goHome();
	}
}
