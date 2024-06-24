/*
NUMELE FISIERULUI SA FIE EXACT NUMELE CLASEI
DOAR CODUL DIN void main VA FI RULAT
*/

/*
TIPURI DE DATE UZUALE

String
int
float / double
char
boolean

PRIMITIVE

byte - 1 byte (-128 -> 127)
short - 2
int - 4
long - 8
float - 4
double - 8
boolean - 1 bit
char - 2


final .... == const ....
*/

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World");
		int myNum = 5;
		float myFloatNum = 5.99f; // trebuie f dupa numar
		char myLetter = 'D';
		boolean myBool = true;
		final String myText = "Hello";

		++myNum;
		myNum++;

		byte num = 100;
		long longnr = 1000000000L;

		System.out.println(num);

		float f1 = 35e3f; // 35 * 10^3
		double d1 = 12E4d;
		System.out.println(f1);
		System.out.println(d1);

		boolean isJavaFun = true;
		boolean isFishTasty = false;
		System.out.println(isJavaFun); // Outputs true
		System.out.println(isFishTasty); // Outputs false

		// Create variables of different data types
		int items = 50;
		float costPerItem = 9.99f;
		float totalCost = items * costPerItem;
		char currency = '$';

		// Print variables
		System.out.println("Number of items: " + items);
		System.out.println("Cost per item: " + costPerItem + currency);
		System.out.println("Total cost = " + totalCost + currency);

		// FOREACH LOOPS
		String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
		for (String i : cars) {
			System.out.println(i);
		}
	}
}
