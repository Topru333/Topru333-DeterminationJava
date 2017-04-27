import org.apache.log4j.Logger;

public class Main {
	final static Logger mainLogger = Logger.getLogger(Main.class);
	final static Logger sortLogger = Logger.getLogger(Sorting.class);
	public static void main(String[] args) {
		Sorting s = new Sorting();
		int[] m = new int[] {1,4,2,3,6,1};
		mainLogger.info("Programm - start");
		s.Sort(m);
		mainLogger.info("Programm - end");

	}

}
