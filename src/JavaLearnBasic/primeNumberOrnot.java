package JavaLearnBasic;

public class primeNumberOrnot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 23;
		boolean isPrime = true;

		for(int i = 2; i <= num/2; i++) {
		    if(num % i == 0) {
		        isPrime = false;
		        break;
		    }
		}

		System.out.println(isPrime ? "Prime" : "Not Prime");

		
		
	}

}
