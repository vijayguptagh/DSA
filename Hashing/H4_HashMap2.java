//find frequecy of each character in string using hashMaps.
import java.util.*;

public class H4_HashMap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String = ");
        String str = sc.nextLine();

        HashMap<Character,Integer> hmap = new HashMap<>();
        for(int i=0;i<str.length();i++){
            if(!hmap.containsKey(str.charAt(i))){
                hmap.put(str.charAt(i),1);
            }
            else{
                int count = hmap.get(str.charAt(i));
                hmap.put(str.charAt(i),++count);
            }
        }
        while (true) {
            System.out.print("Enter element to find its frequency : ");
            char ele = sc.next().charAt(0);
            // since hmap contains null values convert it into 0
            if (hmap.get(ele) == null) {
                hmap.put(ele, 0);
            }
            System.out.println("Frequency of " + ele + " = " + hmap.get(ele));
        }
    }
}