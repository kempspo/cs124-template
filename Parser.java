package template;

public abstract class Parser {
	   protected abstract void Load();
	   protected abstract void Parse();
	   protected abstract void Dump();

	   //template method - defines order of execution
	   //cannot be overridden
	   public final void Process(){

	      Load();
	      Parse();
	      Dump();
	   }
}