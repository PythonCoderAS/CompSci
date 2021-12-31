import java.util.Scanner;

public class Client {

    Scanner scanner = new Scanner(System.in);

    public void realMain(){
        Player player;
        Board board = new Board();
        Point playerMove;
        System.out.println("Welcome to Tic Tac Toe!");
        System.out.println("How will you be playing?");
        System.out.println("Choose 1 to play against another player, or choose 2 to play against the computer.");
        System.out.print("Response: ");
        int val = scanner.nextInt();
        switch (val){
            case 1:
                player = new TwoPersonPlayer();
                break;
            case 2:
                player = new OnePersonPlayer();
                break;
            case 3:
                player = new ZeroPersonPlayer();
                break;
            default:
                System.out.println("Tic Tac Toe cannot be played with " + val + " players.");
                return;
        }
        System.out.println("Here is the board: ");
        System.out.print(board);
        while (!board.whoWon()){
            System.out.println("It is now player 1's turn!");
            playerMove = player.getPlayer1Move(scanner, board);
            board.play("X", playerMove.getX(), playerMove.getY());
            System.out.println("Here is the board after the move: ");
            System.out.print(board);
            if (board.whoWon()){
                break;
            }
            System.out.println("It is now player 2's turn!");
            playerMove = player.getPlayer2Move(scanner, board);
            board.play("O", playerMove.getX(), playerMove.getY());
            System.out.println("Here is the board after the move: ");
            System.out.print(board);
        }
        String winner = board.getWinner();
        if (winner.length() == 0){
            System.out.println("There was a draw! Good luck next time!");
        } else if (winner.equals("X")){
            System.out.println("Player 1 wins! Congratulations!");
        } else if (winner.equals("O")){
            System.out.println("Player 2 wins! Congratulations!");
        }
    }

    public static void main(String[] args) {
        new Client().realMain();
    }
}
