interface Arithmetic {
	int operation(int a, int b);
}
public class Lambda
{
	public static void main(String[] args)
	{
		Arithmetic addition = (int a, int b) -> (a + b);
		System.out.println("Addition = " + addition.operation(3, 4));
		Arithmetic subtraction = (int a, int b) -> (a - b);
		System.out.println("Subtraction = " + subtraction.operation(8, 4));
		Arithmetic multiplication = (int a, int b) -> (a * b);
		System.out.println("Multiplication = " + multiplication.operation(6, 2));
		Arithmetic division = (int a, int b) -> (a / b);
		System.out.println("Division = " + division.operation(10, 2));
	}
}
