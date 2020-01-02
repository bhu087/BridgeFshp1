package Bridge1.com;
import java.util.Scanner;

class WatchControl{
	long startTime=0;
	long stopTime=0;
	long total=0;
	//At the start it gives system current time
	public void start() {
		startTime=System.currentTimeMillis();
	}
	//At the end again it gives system current time
	public void stop() {
		stopTime=System.currentTimeMillis();
	}
	//difference between start and stop time is our total time
	public long totalTime() {
		return stopTime-startTime;
	}
}


public class StopWatch {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		WatchControl wc=new WatchControl();
		//to confirming the start
		System.out.println("Press 1 to Start timer");
		int i=scan.nextInt();
		//if you press 1 then starts the timer
		if(i==1) {
			wc.start();
		}
		//give input 0 for stop the timer
		System.out.println("Press 0 for Stop timer");
		i=scan.nextInt();
		if(i==0) {
			wc.stop();
		}
		long elapsed = wc.totalTime();
		//Output is given in milli seconds
			System.out.println("Total time at end of Stop watch is "+elapsed+" mili seconds");
			//Bellow time is given in seconds
			//if milliseconds less then 500 show as it is
		if(elapsed%1000<500) {
			System.out.println("Time taken in seconds is "+elapsed/1000+" sec" );
		}
			//if greater then 500 display next value by adding 1
		else
			System.out.println("Time taken in seconds is "+(elapsed/1000+1)+" sec" );
	}

}
