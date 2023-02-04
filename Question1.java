@FunctionalInterface
interface calculator {
	int cube(int num);

	default int square(int a) {
		return a * a;
	}

	default int add(int a, int b) {
		return a + b;
	}

	static int sub(int a, int b) {
		return a - b;
	}

	static int mul(int a, int b) {
		return a * b;
	}

	static int div(int a, int b) {
		return a / b;
	}
}

public class Question1 implements calculator {

	public static void main(String[] args) {
		Question1 obj = new Question1();
		System.out.println("cube of 3 is: " + obj.cube(3));
		System.out.println("sum of 3 and 4 is: " + obj.add(3, 4));
		System.out.println("square of 3 is: " + obj.square(3));
		System.out.println("result of subtraction of 3 from 4 is: " + calculator.sub(4, 3));
		System.out.println("result of division of 8 by 4 is: " + calculator.div(8, 4));
		System.out.println("result of multiplication of 8 with 4 is: " + calculator.mul(8, 4));
	}

	@Override
	public int cube(int num) {
		return num * num * num;
	}

}