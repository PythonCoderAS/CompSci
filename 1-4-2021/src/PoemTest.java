public class PoemTest {
    public static void main(String[] args) {
        for (Poem poem: new Poem[]{new Haiku(), new Limerick()}){
            poem.printRhythm();
            System.out.println();
        }
    }
}
