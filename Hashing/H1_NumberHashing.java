// Ques = Take a array of integers input and then print frequency of each character using array.

import java.util.*;

public class H1_NumberHashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();

        System.out.print("Enter Integer Values into array(non integer means stop) = ");
        while (sc.hasNext()) {
            if (sc.hasNextInt()) {
                arr.add(sc.nextInt());
            } else {
                sc.next(); // to clear value from stream else this non int value in stream will be used for next user input - so it will produce error
                break;
            }
        }

        // input range of values for which frequency is calculated
        System.out.print("Enter max value in array = ");

        int q=0;
        if(sc.hasNextInt()){
            q = sc.nextInt();
        }
        else{
            System.out.println("Invalid Input! Please Enter a integer");
        }
        while (sc.hasNext()) {
            if (sc.hasNextInt()) {
                q = sc.nextInt();
                break;
            } else {
                sc.next();  //use to take next input once incorrect nonint value is inputed-if u dont use this it will create infinite loop
                System.out.print("Invalid Input! Please Enter a integer");
            }

        }

        //create hasharray
        int[] hash = new int[q + 1];
        // q+1 bcz hash array index starts from 0 to q ==>q+1 values

        // precompute values of hash array/table
        for (int i = 0; i < arr.size(); i++) {
            // since arr[3]=10 means that hash[10]=1
            hash[arr.get(i)] = hash[arr.get(i)] + 1;
        }

        // now print frequency of each value of array
        System.out.println("Enter element in range 0 to " + q
                + " which frequency needs to be calculated(no not in range means end) : ");
        int freq = 0;
        while (true) {
            freq = sc.nextInt();
            if (freq >= 0 && freq <= q) {
                System.out.println("Frequency of " + freq + " = " + hash[freq]);
            } else {
                System.out.println("Plz enter integer value ");
            }
        }

    }
}
