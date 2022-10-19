import java.util.*;
public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	
//		if(n == 0) {
//			System.out.println(0);
//		}else {
//			int x = n/2;
//			
//			while(x >0) {
//				if(x*x<=n) {
//					System.out.println(x);
//					break;
//				}
//				x--;
//			}
//		}
		
		if(n == 0) {
			System.out.println(0);
		}else {
			int x =n/2;
			for(int i = 1; i <= x; i++) {
				if(i*i > n) {
					System.out.println(i-1);
					break;
				}else if(i*i == n) {
					System.out.println(i);
					break;
				}
			}
		
		}
		
		
		
	}

}
