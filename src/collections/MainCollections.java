package collections;

import java.util.*;

public class MainCollections {
    /*  'Iterable
        'Collection
          'List
              ArrayList
              LikedList
              Vector <- Stack
          'Queue
                PriorityQueue
                'Deque <- ArrayDeque
          'Set
                HashSet
                LinkedHashSet
                'SortedSet <- TreeSet
    */
    public void main() {
        lists();
    }

    private void lists(){
        List<Integer> list = new Stack<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        Vector<Integer> vector = new Vector<>();
        Stack<Integer> stack = new Stack<>();

        println(list.size());   println(list.add(1));           list.add(0, 2);
        println(list);          println(list.remove(1));  println(list.remove(2 ));
    }

    private void sets(){

    }

    private void queue(){

    }

    private void print(Object o) {
        System.out.print(o);
    }

    private void println(Object o) {
        System.out.println(o);
    }
}
