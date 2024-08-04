//write a program to check that given string is palindrome or not

import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string = ");
        String str = sc.nextLine();
        int n=str.length();
        boolean palindrome = check(str,n);
        if(palindrome==true){ System.out.println("String "+str+" is palindrome"); }
        else{ System.out.println("String "+str+" is not palindrome"); }
    }
    static boolean check(String str,int n){
        for(int i=0;i<=n/2;i++){
            //check for lowercase & uppercase letters also - so directly convert existing string into complete lower/upper
            str=str.toLowerCase();
            if(str.charAt(i)!=str.charAt(n-1-i)){ return false; }
        }
        return true;
    }
}
