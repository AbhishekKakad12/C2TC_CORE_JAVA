import java.util.Scanner;

public class AddTwoNum {
	public static void main(String[] args) {

		// for n = 5;
//		*
//		*1*
//		*121*
//		*12321*
//		*1234321*
//		*123454321*
//		*1234321*
//		*12321*
//		*121*
//		*1*
//		*
		
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		
//		int i = 1;
//
//		while(i<=n+1) {
//			int j = 1;
//			
//			while(j<=i) {
//			 if(j>1) {
//					System.out.print(j-1);
//					j++;
//					
//				}else {
//					System.out.print("*");
//					j++;
//				}
//				
//			}
//			
//			int l = 1;
//			while(l<j-1) {
//								
//				if(l == i-1) {
//					System.out.print("*");
//					l++;
//				}else {
//					System.out.print(i-l-1);
//					l++;
//				}
//					
//			}
//			
//			System.out.println();
//			i++;
//		}
//		
//		i = 1;
//		int m = n;
//		while(i<=n+1) {
//			int j = 1;
//		
//			if(n == 0)System.out.print("*");
//			while(j<=m) {
//				
//				if(j > 1) {
//					System.out.print(j-1);
//					j++;
//					
//				}else {
//					System.out.print("*");
//					j++;
//				}
//				
//			}
//			
//			int y = 1;
//			int z = n;
//			while(y<=m-1) {
//				
//				if(y==m-1) {
//					System.out.print("*");
//					y++;
//				}else {
//					System.out.print(z-i-y);
//					y++;
//				}
//			}
//			
//			System.out.println();
//			i++;
//			m--;
//		}

	    int x , y = 1;
        x = 10;
        if (x != 10 && x / 0 == 0)
            System.out.println(y);
        else
            System.out.println(++y);
		
	}
}
