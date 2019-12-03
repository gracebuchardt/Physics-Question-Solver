import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String questiontype = "empty";

		double mass;

		double force;

		double time;

		double work;

		double gravity = 9.8;

		double height;

		double velocity;

		double Ek;

		double power;

		double distance;

		Scanner in=new Scanner(System.in);
		System.out.println("Question Type?");

		questiontype=in.nextLine();

		

		//WORK IS FORCE TIMES DISTANCE.
		if (questiontype.equalsIgnoreCase("Find work")) {
			System.out.println("Total force (in N)?");

			force=in.nextDouble();

			System.out.println("Total distance (in m?)?");

			distance=in.nextDouble();
			in.nextLine();

			System.out.println(force*distance);
			System.out.println("J");
		}
		
		//Eg = MGH

		if (questiontype.equalsIgnoreCase("Find gravitational potential energy")) {
			System.out.println("Total mass (in kg)?");

			mass=in.nextDouble();

			System.out.println("Total height (in m)?");
			height=in.nextDouble();
			
			System.out.println(mass*gravity*height);
			System.out.println("J");

		}
		
		//KINETIC ENERGY
		if (questiontype.equalsIgnoreCase("Find kinetic energy")) {
			System.out.println("Total mass (in kg)?");
			
			mass=in.nextDouble();
			
			System.out.println("Total velocity (in m/s)?");
			
			velocity=in.nextDouble();
			
			System.out.println((0.50*mass*(velocity*velocity)));
			System.out.println("J");
			
		}
	}


}
