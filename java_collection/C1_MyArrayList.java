package java_collection;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class C1_MyArrayList {
    public static void main(String[] args) {

        //List Array
        List<Integer> list = new ArrayList<>();
        //add
        list.add(5);
        list.add(4);
        list.add(14);
        list.add(32);
        System.out.println(list);
        list.add(1, 49);
        System.out.println(list);
        //return true if contains that element
        System.out.println(list.contains(300));
        //returns no of elements in list
        System.out.println(list.size());
        //return value at index
        System.out.println(list.get(3));
        //updates value at index
        list.set(2, 200);
        System.out.println(list);
        //delete
        list.remove(0);
        System.out.println(list);
        list.remove(Integer.valueOf(14));
        System.out.println(list);

        //Iteration
        //for loop
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+"\t");
        } System.out.println();
        //forEach loop
        for(Integer i:list){
            System.out.print(i+"\t");
        } System.out.println();
        //iterator class-to use interator interface import it
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+"\t");
        }

    }
}
