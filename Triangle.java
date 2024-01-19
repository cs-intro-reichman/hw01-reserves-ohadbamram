/*
 * Three sides can form a triangle if the sum of the lengths of any two sides is greater than the length of the remaining side. 
 * This is known as the Triangle Inequality Theorem. 
 * Write a program that tests if three given integers form a triangle.
 */ 
public class Triangle {
	public static void main(String[] args) {
		//aquires 3 ints.
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		//checks wether the sum of any two variables is greater than the third and assigns it to bool isTriangle
		boolean isTriangle = false;
		isTriangle	= ( a + b > c && a + c > b && b + c > a);
		//prints wether it's a triangle or not
		System.out.println(isTriangle);
	}
}
