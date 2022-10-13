package hust.soict.ictglobal.aims.Media;

public class MemoryDaemon implements java.lang.Runnable {

	private long memoryUsed ;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Runtime rt = Runtime.getRuntime();
		long used;
		
		while (true) {
			used = rt.totalMemory() - rt.freeMemory();
			if (used != memoryUsed) {
				System.out.println("\tMemory used = "+used);
				memoryUsed = used;
			}
		}
		
	}

}
