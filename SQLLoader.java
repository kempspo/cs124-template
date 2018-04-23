package template;

public class SQLLoader extends Parser {
	protected void Load() {
		System.out.println("Connect to SQL server");
	}
	
	protected void Parse() {
		System.out.println("Loop through data set");
	}
	
	protected void Dump() {
		System.out.println("Dump data");
	}
}
