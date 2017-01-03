import java.util.Scanner;

public class RudeQuestions {
	public static void main( String[] args ) {
		String name;
		int age, iq;
		double weight, income;

		Scanner keyboard = new Scanner(System.in);

		System.out.print( "Hello. What is your name?" );
		name = keyboard.next();

		System.out.print( "Hi, " + name + "! How old are you?");
		age = keyboard.nextInt();

		System.out.println( "So you're " + age + ", eh? That's not very old.");
		System.out.print( "How much do you weight, " + name + "?");
		weight = keyboard.nextDouble();

		System.out.println( weight + "! Better keep that quiet!!");
		System.out.print("Finally, what's your income, " + name + "?");
		income = keyboard.nextDouble();

		System.out.print( "Hopefully that is " + income + " per hour");
		System.out.println( " and not per year!");
		System.out.print( "Well, thanks for answering my rude question, ");
		System.out.println( name + ".");

		System.out.print( name + ", so what's your IQ?");
		iq = keyboard.nextInt();
		System.out.println( iq + "? You're not too bright now are you?");
	}
}
// Q1: No, I believe because many integer values can also be doubles.
// Although typing in something like 20,000,000 for your income spits out 2.0E7.
// Q2: No, a string can be just about anything.
// Q3: Every question but the first can be blown up by using a number over
// 2 billion.  The string seems to be able to take whatever I type in.
