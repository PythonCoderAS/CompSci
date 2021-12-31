public class Board {
    private final String playerOneSymbol = "X";
    private final String playerTwoSymbol = "O";
    private final String noPlayerSymbol = " ";
    private boolean hardMode;
    private int[][] boardArray = new int[3][3];
    private int moves = 0;

    public Board(boolean hard) {
        hardMode = hard;
    }

    public boolean isValidMove(int x, int y) {
        return boardArray[x][y] == 0;
    }

    public String getSymbol(int playerNumber) {
        if (playerNumber == 0) {
            return noPlayerSymbol;
        } else if (playerNumber == 1) {
            return playerOneSymbol;
        } else {
            return playerTwoSymbol;
        }
    }

    public String winnerString(int playerNumber) {
        String symbol;
        if (playerNumber == 1) {
            symbol = playerOneSymbol;
        } else {
            symbol = playerTwoSymbol;
        }
        return "Player " + playerNumber + " (" + symbol + ") wins the match!";
    }

    public boolean isFinished() {
        for (int i = 0; i < boardArray.length; i++) {
            for (int j = 0; j < boardArray[i].length; j++) {
                if (boardArray[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean determineWinner() {
        for (int i = 0; i < boardArray.length; i++) { // checking for row win
            if (boardArray[i][0] != 0 && boardArray[i][0] == boardArray[i][1] && boardArray[i][1] == boardArray[i][2]) {
                System.out.println(winnerString(boardArray[i][0]));
                return true;
            }
        }
        for (int i = 0; i < boardArray.length; i++) { // checking for column win
            if (boardArray[0][i] != 0 && boardArray[0][i] == boardArray[1][i] && boardArray[1][i] == boardArray[2][i]) {
                System.out.println(winnerString(boardArray[0][i]));
                return true;
            }
        }
        if (boardArray[1][1] != 0 && ((boardArray[0][0] == boardArray[1][1] && boardArray[1][1] == boardArray[2][2]) || (boardArray[2][0] == boardArray[1][1] && boardArray[1][1] == boardArray[0][2]))) { // checking for diagonal win
            System.out.println(winnerString(boardArray[1][1]));
            return true;
        }
        if (isFinished()) {
            System.out.println("The game is a draw!");
            return true;
        } else {
            return false;
        }
    }

    public boolean play(int player, int x, int y) {
        if (isValidMove(x, y)) {
            boardArray[x][y] = player;
            moves++;
            return true;
        } else {
            return false;
        }
    }

    public void displayBoard() {
        for (int i = 0; i < boardArray.length; i++) {
            System.out.println("|---|---|---|");
            System.out.print("|");
            for (int j = 0; j < boardArray[i].length; j++) {
                System.out.print(" " + getSymbol(boardArray[i][j]) + " |");
            }
            System.out.println();
        }
        System.out.println("|---|---|---|");
    }

    public void playComputer(){
        if (hardMode){
            // playComputerHard();
            // TODO: Implement
            playComputerNormal();
        }
        else {
            playComputerNormal();
        }
    }


    private void playComputerNormal(){
        int[][] validMoves = new int[9 - moves][2];
        int count = 0;
        for (int i = 0; i < boardArray.length; i++) {
            for (int j = 0; j < boardArray[i].length; j++) {
                if (boardArray[i][j] == 0) {
                    validMoves[count] = new int[]{i, j};
                    count++;
                }
            }
        }
        int moveNumber = (int) (Math.random() * validMoves.length);
        int x = validMoves[moveNumber][0];
        int y = validMoves[moveNumber][1];
        play(2, x, y);
    }

    public int[][] getBoardArray() {
        return boardArray.clone();
    }

    public int[][] determineScore(int x, int y){
        int[][] scores = {{1, 0}, {2, 0}};
        int[][] board = getBoardArray();
        board[x][y] = 2;
    }
}
