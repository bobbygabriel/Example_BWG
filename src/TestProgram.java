/**
 * This program test the Dog Class
 * @author bobby
 *
 */
public class TestProgram {

	public static void main(String[] args) {
		
		/*
		System.out.println("Hello World!");
		int a = 10;
		double g = 36.54;
		String temp = "Interesting factoid";
		
		System.out.printf("This is an integer %d,this is a double %.2f, this is a String %s%n", a, g, temp);
		*/
		
		Dog d = new Dog();
		Dog fido = new Dog("Fido",13);
		
		System.out.println(d.toString());
		
		System.out.println(fido.toString());
		
		
		
	}

}
