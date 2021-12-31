public class Limerick extends Poem{
    public int numLines() {
        return 5;
    }

    public int getSyllables(int k) {
        if (k==3 || k == 4){
            return 6;
        } else {
            return 9;
        }
    }
}
