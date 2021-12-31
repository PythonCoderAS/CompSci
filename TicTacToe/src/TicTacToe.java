import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Tic Tac Toe!");
        System.out.print("Would you like to play in Hard mode? Enter `true` for yes, or `false` for no: ");
        boolean hardMode = scanner.nextBoolean();
        Board board = new Board(hardMode);
        int first = (int) ((Math.random() * 2));
        if (first == 1) {
            System.out.println("Computer plays first.");
            board.playComputer();
            board.displayBoard();
        } else {
            System.out.println("Human plays first.");
        }
        boolean won = false;
        while (!won) {
            System.out.print("Enter the x-coordinate where you want to play, from 1 - 3: ");
            int x = scanner.nextInt() - 1;
            System.out.print("Enter the y-coordinate where you want to play, from 1 - 3: ");
            int y = scanner.nextInt() - 1;
            if (board.play(1, y, x)) {
                board.displayBoard();
                won = board.determineWinner();
                if (!won){
                    System.out.println("Computer playing...");
                    board.playComputer();
                    board.displayBoard();
                    won = board.determineWinner();
                }
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }
        System.out.println("Thanks for playing Tic Tac Toe!");
    }
}
