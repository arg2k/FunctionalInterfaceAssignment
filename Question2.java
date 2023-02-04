@FunctionalInterface
interface MyInterface {
	Person getPerson(String string, Integer i);
}

public class Question2 {

	public static void main(String[] args) {

		MyInterface obj2 = Person::new;

		System.out.println(
				obj2.getPerson("argha", 22).getName() + " is " + obj2.getPerson("argha", 22).getAge() + " years old");

	}

}