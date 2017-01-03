import java.util.Scanner;

public class BMICalculator {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		double m, kg, bmi, inch, lbs, feet, inches, inches2, inches3;

		System.out.print( "Your height in inches: ");
		inches = keyboard.nextDouble();
		m = inches/39.37;

		System.out.print( "Your weight in pounds: ");
		lbs = keyboard.nextDouble();
		kg = lbs/2.2;

		bmi = kg / (m*m);

		System.out.println( "Your BMI is " + bmi );

		System.out.print( "Your height (feet only): ");
		feet = keyboard.nextDouble();
		inch = feet*12;

		System.out.print( "Your height (inches): ");
		inches2 = keyboard.nextDouble();
		inches3 = inches2+inch;
		m = inches3/39.39;

		System.out.print( "Your weight in pounds: ");
		lbs = keyboard.nextDouble();
		kg = lbs/2.2;

		bmi = kg / (m*m);

		System.out.println( "Your BMI is " + bmi );

	}
}
