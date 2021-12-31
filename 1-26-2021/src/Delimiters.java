import java.util.ArrayList;

public class Delimiters {
    private String openDel;
    private String closeDel;

    public Delimiters(String open, String close) {
        openDel = open;
        closeDel = close;
    }

    public ArrayList<String> getDelimitersList(String[] tokens) {
        ArrayList<String> delimiters = new ArrayList<String>();
        for (String token : tokens) {
            if (token.equals(openDel) || token.equals(closeDel)) {
                delimiters.add(token);
            }
        }
        return delimiters;
    }

    public boolean isBalanced(ArrayList<String> delimiters) {
        int open = 0, close = 0;
        for (String delimiter : delimiters) {
            if (delimiter.equals(openDel)) {
                open++;
            } else if (delimiter.equals(closeDel)) {
                if (close > open) {
                    return false;
                } else {
                    close++;
                }
            }
        }
        return open == close;
    }
}
