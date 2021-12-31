import java.util.Arrays;

public class Board {
    private final String[][] board = new String[3][3];
    private String winner = null;

    public boolean isValidMove(int r, int c){
        return winner == null && r < board.length && c < board[r].length && board[r][c] == null;
    }

    public void play(String player, int r, int c){
        board[r][c] = player;
    }

    public int nullCount(){
        int count = 0;
        for (String[] row: board){
            for (String item: row){
                if (item == null){
                    count++;
                }
            }
        }
        return count;
    }

    private String[] allInCol(int col){
        String[] arr = new String[board.length];
        for (int i=0; i< board.length; i++){
            arr[i] = board[i][col];
        }
        return arr;
    }

    private String wonRow(String[] row){
        String first = row[0];
        for (String item: row){
            if (item == null || !item.equals(first)){
                return null;
            }
        }
        return first;
    }

    /**
     * Determines who won.
     * @return Whether or not the game is won. The winner can be gotten using getWinner().
     */
    public boolean whoWon(){
        if (winner != null){
            return true;
        }
        String[] diagonal1 = new String[board.length];
        String[] diagonal2 = new String[board.length];
        for (int i=0; i<board.length; i++){
            String rowWinner = wonRow(board[i]);
            if (rowWinner != null){
                winner = rowWinner;
                return true;
            }
            String colWinner = wonRow(allInCol(i));
            if (colWinner != null){
                winner = colWinner;
                return true;
            }
            diagonal1[i] = board[i][i];
            diagonal2[i] = board[i][board.length-1-i];
        }
        String diagonal1Winner = wonRow(diagonal1);
        if (diagonal1Winner != null){
            winner = diagonal1Winner;
            return true;
        }
        String diagonal2Winner = wonRow(diagonal2);
        if (diagonal2Winner != null){
            winner = diagonal2Winner;
            return true;
        }
        if (nullCount() == 0){
            winner = "";
            return true;
        }
        return false;
    }

    public String getWinner() {
        return winner;
    }

    public String toString(){
        String result = "";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == null){
                    result += " ";
                } else {
                    result += board[i][j];
                }
                if (j == 2){
                    result += "\n";
                } else {
                    result += " | ";
                }
            }
            if (i != 2){
                for (int j = 0; j < 9; j++) {
                    result += "-";
                }
                result += "\n";
            }
        }
        return result;
    }
}
