
import java.util.* ;
import java.io.*; 

public class SecondLargestElement {
	public static int findSecondLargest(int n, int[] arr) {
		
		// 2 7 10 14 18
		if(n<2){ return -1; }
		
		Arrays.sort(arr);
		//we now need to check duplicate condition-iterate & compare i,j values
		int i=n-2;
		int j=n-1;	//fix it last value

		//2 duplicate cases - 1]last 2 element same-means 2nd largest is 3rd element from right
		//2]all element same-return -1
		while(i>=0 && j>=0){
			// 2 5 7 9 9 - 2nd largest is 7 & not 9
			if(arr[i]==arr[j]){
				i--;
			}
			else if(arr[i] != arr[j]) {
				return arr[i];
			}	
		}	
		return -1;	
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]={91,52,3,49,35};
        System.out.println("Second Largest Element = "+SecondLargestElement.findSecondLargest(5,arr));   
	}
}
