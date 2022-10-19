import java.util.Arrays;

public class UniqueNumberFromArray {
	
	public static void printArray(int [] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void findUnique() {
//		int unique = 0;
//        
//        if(arr.length == 1){
//            unique = arr[0];
//            return unique;
//        }
//        
//        for(int i = 0; i < arr.length; i++){
//            
//            boolean found = false;
//            
//            for(int j = 0; j < arr.length; j++){
//				if(arr[i] == arr[j] && i != j){
//                    found = true;
//                }
//            }
//            
//            if(!found){
//            	unique = arr[i];
//  				break;
//            }
//        }
//        
//        return unique;
		
//		int[] sortedArr = new int[arr.length];
		
		int[] ab = { 5, -2, 23, 7, 87, -42, 509 };
		Arrays.sort(ab);
		printArray(ab);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		findUnique();
	}

}
