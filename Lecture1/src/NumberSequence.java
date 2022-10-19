import java.util.*;
public class NumberSequence {

	public static int sum(int[] arr) {
		//Your code goes here
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
           
        int sum = 0;
        while(t-- != 0){
           
            int n = sc.nextInt();
            
            for(int i = 0; i< n; i++){
                arr[i] = sc.nextInt();
            }
            
            for(int i = 0; i< n; i++){
                sum += arr[i];
            }
            return sum;
        }
        return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		
//		int prev = sc.nextInt();
//		boolean isDecreased = true;
//		
//		for(int i = 1; i < n; i++) {
//			int curr = sc.nextInt();
//			
//			if(curr == prev) {
//				System.out.println(false);
//                return;
//			}else if(curr > prev) {
//				if(isDecreased) {
//					isDecreased = false;
//				}
//			}else if(curr < prev) {
//				if(!isDecreased) {
//					System.out.println(false);
//                    return;
//				}
//			}
//			
//			
//			prev = curr;
//		}
//    
//    if(!isDecreased)System.out.println(true);
//	}

	
//		 Scanner sc = new Scanner(System.in);
//	        
//	        int n = sc.nextInt();
//	        
//	        int temp = n;
//	        int i = 0;
//	        
//	        while(temp>0){
//	            temp /= 10;
//	            i++;
//	        }
//	        
//	        System.out.println(i);
//	        
//	        int res = 0;
//	        
//	        while(n > 0){
//	            int num = n%10;
//	            n/=10;
//	            
//	            int product = 1;
//	            for(int j = 1; j <= i; j++){
//					product *= num;
//	            }
//	            res+=product;
//	        }
//	        
//	        System.out.println(res);
//	        if(res == n){
//	            System.out.println(true);
//	        }else{
//	            System.out.println(false);
//	        }
		
		int arr[] = {1,2};
		System.out.println(sum(arr));
		
}
	
}
