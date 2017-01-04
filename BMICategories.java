import java.util.Scanner;

public class BMICategories {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		double bmi, m, kg, lbs, inches;

		System.out.print( "Your height in inches: " );
		inches = keyboard.nextDouble();
		m = inches/39.37;

		System.out.print( "Your weight in pounds: " );
		lbs = keyboard.nextDouble();
		kg = lbs/2.2;

		bmi = kg / (m*m);

		System.out.println( "Your BMI is: " + bmi );

		System.out.print( "Your BMI category is: " );
		if ( bmi < 15.0 ) {
			System.out.println( "very severely underweight" );
		}
		else if ( bmi <= 16.0 ) {
			System.out.println( "severeley underweight" );
		}
		else if ( bmi < 18.5 ) {
			System.out.println( "underweight" );
		}
		else if ( bmi < 25.0 ) {
			System.out.println( "normal weight" );
		}
		else if ( bmi < 30.0 ) {
			System.out.println( "overweight" );
		}
		else if ( bmi < 35.0 ) {
			System.out.println( "moderately obese" );
		}
		else if ( bmi < 40.0 ) {
			System.out.println( "severely obese" );
		}
		else {
			System.out.println( "very severely/\"morbidly\" obese" );
		}
	}
}
