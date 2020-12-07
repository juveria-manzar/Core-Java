import java.util.*;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Juveria");
        myList.add("Sara");
        myList.add("Fatima");

        Iterator<String> itr=myList.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
