public class Haiku extends Poem{

    public int numLines() {
        return 3;
    }

    public int getSyllables(int k) {
        if (k == 2){
            return 7;
        } else {
            return 5;
        }
    }
}
