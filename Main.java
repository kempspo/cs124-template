package template;

public class Main {
	public static void main(String[] args) {
		Parser csv = new CSVLoader();
		csv.Process();
		System.out.println("-------------------");
		Parser sql = new SQLLoader();
		sql.Process();
	}
}
