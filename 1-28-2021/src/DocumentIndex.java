import java.util.ArrayList;

public class DocumentIndex extends ArrayList<IndexEntry> {
    public DocumentIndex() {
        super();
    }

    public DocumentIndex(int capacity) {
        super(capacity);
    }

    public void addWord(String word, int num) {
        for (IndexEntry entry : this) {
            if (entry.getWord().equals(word.toUpperCase())) {
                entry.add(num);
                return;
            }
        }
        IndexEntry indexEntry = new IndexEntry(word);
        indexEntry.add(num);
        insertInABCOrder(indexEntry);
    }

    public void addAllWords(String str, int num) {
        for (String word : str.split("\\W+")) {
            if (word.length() > 0) {
                addWord(word, num);
            }
        }
    }

    private void insertInABCOrder(IndexEntry entry){
        int negative = -1;
        for (IndexEntry indexEntry: this){
            if (indexEntry.getWord().compareToIgnoreCase(entry.getWord()) <= 0){
                negative++;
            } else {
                break;
            }
        }
        this.add(negative+1, entry);
    }
}
