/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		//gets two numbers from user
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		//generates 3 random numbers in the range of a and b and prints them
		int random1 = (int)(Math.random() * (b - a) + a );
		System.out.println(random1);
		int random2 = (int)(Math.random() * (b - a) + a );
		System.out.println(random2);
		int random3 = (int)(Math.random() * (b - a) + a );
		System.out.println(random3);
		int min1 = Math.min(random1,random2);
		int min2 = Math.min(random1, random3);
		int min3 = Math.min (min1, min2);
		System.out.println("The minimal generated number was "+min3);	
	}
}
