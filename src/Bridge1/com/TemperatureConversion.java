package Bridge1.com;
import java.util.Scanner;

class TempConverter{
	public static void temperaturConversion(int x, double y) {
		double temp=0;
		//here converting Fahrenheit to celcius
		if(x==0) {
			temp=((y-32)*5/9);
			System.out.println(y+" Fahrenheit = "+temp+" celcius");
		}
		//here converting celcius to Fahrenheit
		if(x==1) {
			temp=(y*9/5)+32;
			System.out.println(y+" celcius = "+temp+" Fahrenheit");
		}
		
	}
}

public class TemperatureConversion {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//option given to user for celcius and fahrenheit
		System.out.println("If you know celcius enter 1 else 0 for fahrenheit");
		int i=scan.nextInt();
		System.out.println("Enter Known Value");
		double val=scan.nextDouble();
		TempConverter.temperaturConversion(i, val);
	}

}
