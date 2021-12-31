import java.util.ArrayList;

public class IndexEntry {
    private String word;
    private ArrayList<Integer> numsList;

    public IndexEntry(String w) {
        word = w.toUpperCase();
        numsList = new ArrayList<Integer>();
    }

    public void add(int num) {
        Integer integer = num;
        for (Integer integer1 : numsList) {
            if (integer.equals(integer1)) {
                return;
            }
        }
        numsList.add(integer);
    }

    public String getWord() {
        return word;
    }

    public String toString() {
        String base = word + " ";
        for (int i = 0; i < numsList.size(); i++) {
            base += numsList.get(i);
            if (i != numsList.size() - 1){
                base += ", ";
            }
        }
        return base;
    }
}
