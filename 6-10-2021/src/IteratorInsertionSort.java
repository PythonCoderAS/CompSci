import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class IteratorInsertionSort {
    public static void sort(List<Integer> list) {
        ListIterator<Integer> listIterator = list.listIterator(1);
        while (listIterator.hasNext()) {
            int count = 0;
            Integer value = listIterator.next();
            while (listIterator.hasPrevious()) {
                Integer prevValue = listIterator.previous();
                count++;
                if (value < prevValue) {
                    // I am not sure why I need to repeat the calls to next() and previous().
                    // When I stepped through with a debugger, I saw that the lone next()/previous() call would not
                    // actually go from the current element to the next element, so I had to double up.
                    // I don't know why this works, but it works.
                    listIterator.set(value);
                    listIterator.next();
                    listIterator.next();
                    listIterator.set(prevValue);
                    listIterator.previous();
                    listIterator.previous();
                }
            }
            for (int i = 0; i < count; i++) {
                listIterator.next();
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            list.add((int) (Math.random() * 1000));
        }
        long start = System.currentTimeMillis();
        sort(list);
        long finish = System.currentTimeMillis();
        long difference = finish - start;
        System.out.println("It took " + difference + " milliseconds to process the array.");
    }
}
