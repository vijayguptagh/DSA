//find frequency of each value in a integer array using hashmap.

import java.util.*;

public class H3_HashMap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.print("Enter integer array values = ");
        while (sc.hasNext()) {
            if (sc.hasNextInt()) {
                arr.add(sc.nextInt());
            } else {
                sc.next();
                break;
            }
        }

        HashMap<Integer, Integer> hmap = new HashMap<>();
        for (int i = 0; i < arr.size(); i++) {
            //case when hashmap key doesnt contains that value- need to handle seperately
            if (!hmap.containsKey(arr.get(i))) {
                hmap.put(arr.get(i), 1);
            } else {
                int count = hmap.get(arr.get(i));
                hmap.put(arr.get(i), ++count);
            }
        }

        while (true) {
            System.out.print("Enter element to find its frequency : ");
            int ele = sc.nextInt();
            // since hmap contains null values convert it into 0
            if (hmap.get(ele) == null) {
                hmap.put(ele, 0);
            }
            System.out.println("Frequency of " + ele + " = " + hmap.get(ele));
        }
    }
}