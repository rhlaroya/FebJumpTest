
public class Fizzbuzz {
	public static void main (String[]args) {
		int n = 1000;
		for (int i = 0; i < 1000; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.println("Fizzbuzz");
			}
			else if(i % 5 == 0) {
				System.out.println("Buzz");
			}
			else if(i % 3 == 0) {
				System.out.println("Fizz");
			}
			else {
				System.out.println(i);
			}
		}
	}
	
	public static boolean isPrime(int n) {
		
		return true; 
	}
	
}
