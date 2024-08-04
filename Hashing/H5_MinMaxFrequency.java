//find element with max and min frequecny in a integer array

import java.util.*;

public class H5_MinMaxFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.print("Enter Integer Values into array(non integer means stop) = ");
        while (sc.hasNext()) {
            if (sc.hasNextInt()) {
                arr.add(sc.nextInt());
            } else {
                sc.next();
                break;
            }
        }

        HashMap<Integer, Integer> hmap = new HashMap<>();
        // prestoring
        for (int i = 0; i < arr.size(); i++) {
            if (!hmap.containsKey(arr.get(i))) {
                hmap.put(arr.get(i), 1);
            } else {
                // int count = hmap.get(arr.get(i));
                hmap.put(arr.get(i), hmap.get(arr.get(i))+1);
            }
        }

        //take maxfreq is minimum int value so that evry value must be larger than it
        int maxFreq = Integer.MIN_VALUE;
        int minFreq = Integer.MAX_VALUE;

        // here we cant iterate using forloop bcz keys of hashmap r actaully values of arraylist-which r not ordered & 1 to numbers - so iterate using foreach loop
        // for (int i = 1; i < hmap.size(); i++) {

        //to handle multiple min and max values create arraylist for both
        ArrayList<Integer> maxArray = new ArrayList<>();
        ArrayList<Integer> minArray = new ArrayList<>();

        //key means value in array(original array)
        for (Integer item : hmap.keySet()) {
            int freq = hmap.get(item);
            if ( freq < minFreq) {
                minFreq = freq;
                minArray.clear();   //to clear(not min now) older values
                minArray.add(item);
            } //if upcoming item hv same frequency then directly add it without clearing 
            else if(freq == minFreq){
                minArray.add(item);
            }

            if ( freq > maxFreq) {
                maxFreq = freq;
                maxArray.clear();   
                maxArray.add(item);
            } else if(freq == maxFreq){
                maxArray.add(item);
            }
        }
        System.out.println("Element with max frequency = " + maxArray + " --> count = " + maxFreq);
        System.out.println("Element with min frequency = " + minArray + " --> count = " + minFreq);
    }
}
