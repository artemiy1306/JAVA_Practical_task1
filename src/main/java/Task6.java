import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Task6 {
    public static void main(String[] args) {
        MySet<Integer> mySet = new MySet();
        System.out.println(mySet.add(0));
        System.out.println(mySet.add(1));
        System.out.println(mySet.add(2));
        System.out.println(mySet.add(3));
        System.out.println(mySet.add(1));
        mySet.toString();
        System.out.println(mySet.ind(0));

        Iterator<Integer> iter = mySet.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

    }
}
class MySet<T> {
    private HashMap<T, Object> map = new HashMap<>();
    private static final Object mo = new Object();

    public boolean add(T value) {
        return map.put(value, mo) == null;
    }

    public boolean remove(T value) {
        return map.remove(value) == mo;
    }

    public String toString() {
        return map.keySet().toString();
    }

    public Iterator<T> iterator() {
        return map.keySet().iterator();


    }
    public  T ind (int i){
        ArrayList<T> arrayList = new ArrayList<>(map.keySet());
        return arrayList.get(i);

    }
}