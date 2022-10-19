import java.util.*;
public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 2; i<=n; i++) {
			boolean divided = false;
			for(int j = 2; j<=i; j++) {
				if(i == j) {
					continue;
				}

				if(i%j == 0) {
					divided = true;
				}
			}

			if(!divided) {
				System.out.println(i);
			}
		}

	}

}
