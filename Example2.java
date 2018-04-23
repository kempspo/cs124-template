package template;

public class Example2 {
	public static void main(String[] args) {
		Student mgt = new MGT();
		mgt.startDay();
		System.out.println("-------------------");
		Student cs = new CS();
		cs.startDay();
		System.out.println("-------------------");
		Student r = new Random();
		r.startDay();
	}
}
