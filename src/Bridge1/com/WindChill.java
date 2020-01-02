package Bridge1.com;

public class WindChill {

	public static void main(String[] args) {
		//take input from command line
		double temp=Integer.parseInt(args[0]);
		double vel=Integer.parseInt(args[1]);
		double wind=0;
		//it gives the output if the data ranges are satisfied
		if(!(temp>50 || vel>120 || vel<3)) {
			
			wind=(35.74+0.6215*temp+(0.4275*temp - 35.75)*Math.pow(vel, 0.16));
			System.out.println("Given temperature is "+temp+" Fahrenheit and Velocity is "+vel+" miles/hour wind chill is "+wind );
		}
		//or it says invalid range
		else
			System.out.println("Temperature or Velocity is not in range");

	}

}
