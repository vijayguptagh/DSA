// Ques = Take a array of characters input and then print frequency of each character using array.
//Ques Link


import java.util.*;

public class H2_CharacterHashing {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string = ");
        String str = sc.nextLine();

        int[] hash = new int[256];

        for (int i = 0; i < str.length(); i++) {
            hash[str.charAt(i)]++;
        }

        while (true)
            System.out.print("Enter character to find its frequency : ");
            //since next() method takes a word input
            char ele = sc.next().charAt(0);
            System.out.println("Frequency of "+ele+" = "+hash[ele]);
        }

    }
}
