public abstract class Poem {
    public abstract int numLines();
    public abstract int getSyllables (int k);
    public void printRhythm(){
        int lines = numLines();
        for (int i=1; i<=lines; i++){
            int syllables = getSyllables(i);
            for (int k=0; k<syllables - 1; k++){
                System.out.print("ta");
                System.out.print("-");
            }
            System.out.println("ta");
        }
    }
}
