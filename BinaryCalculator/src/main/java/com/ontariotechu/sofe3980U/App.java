package com.ontariotechu.sofe3980U;

import org.joda.time.LocalTime;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
	/**
	* Main program:  The entry point of the program. The local time will be printed first,
	*      Then it will create two binary variables, add them and print the result.
	*
	* @param args: not used
	*/
    public static void main( String[] args )
    {
		//replaced with my code
		Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter your First binary number: ");
		Binary binary1 = new Binary(scanner.nextLine());

		System.out.print("Please enter your Second binary number: ");
		Binary binary2 = new Binary(scanner.nextLine());

		System.out.println("First binary number: " + binary1.getValue());
		System.out.println("Second binary number: " + binary2.getValue());

		Binary sum = Binary.add(binary1, binary2);
		System.out.println("Sum: " + sum.getValue());

		Binary orResult = Binary.or(binary1, binary2);
		System.out.println("OR: " + orResult.getValue());

		Binary andResult = Binary.and(binary1, binary2);
		System.out.println("AND: " + andResult.getValue());

		Binary multiplyResult = Binary.multiply(binary1, binary2);
		System.out.println("Multiplication: " + multiplyResult.getValue());

		scanner.close();
    }
}
