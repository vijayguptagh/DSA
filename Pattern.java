// package pattern_print;

//online compilesr - doesn't runs ur code once instead it runs ur code, for a no of test cases and if it produces correct output at each test case then ur solution is correct.

import java.util.Scanner;

public class Pattern{

    //if u make function as static here then u can directly call this function using class.fucntion and u dont need to create object.
    public static void pattern1(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
    public static void pattern7(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<(2*n-1);j++){
                for(int k=0;k<n-i-1;k++){
                    System.out.print("  "); //need to print 2 empty spaces, 1 for empty space and another for seperation b/w values
                }
                for(int k=n-i;k<(n+i-1);k++){
                    System.out.print("* "); 
                }
                for(int k=n+i;k<(2*n-1);k++){
                    System.out.print("  "); 
                }
                System.out.print("  "); 
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value = ");
        int n = sc.nextInt();

        //static method directly called
        Pattern.pattern1(n);
        
    }
}