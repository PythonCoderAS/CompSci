public class mirrorEndsTest {
    public static void main(String[] args) {
        System.out.println(mirrorEnds("abXYZba"));
    }

    public static String mirrorEnds(String string) {
        String match = "";
        String toMatch;
        String toReverse;
        String reversed = "";
        for (int i=1; i <= string.length(); i++){
            if (i == string.length()){
                toMatch = string;
            } else {
                toMatch = string.substring(0, i);
            }
            toReverse = string.substring(string.length() - toMatch.length());
            for (int j = toReverse.length() - 1; j >= 0; j--) {
                if (j == toReverse.length() - 1) {
                    reversed += toReverse.substring(j);
                } else {
                    reversed += toReverse.substring(j, j + 1);
                }
            }
            if (reversed.equals(toMatch)){
                match=toMatch;
            }
            reversed = "";
        }
        return match;
    }

}
