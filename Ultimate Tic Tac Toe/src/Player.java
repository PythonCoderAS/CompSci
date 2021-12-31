import java.util.ArrayList;
import java.util.Scanner;

public abstract class Player {
    protected Point getPlayerMove(Scanner scanner, Board board){
        boolean valid = false;
        while (!valid) {
            System.out.println("Choose the row to play (starting from 1): ");
            int row = scanner.nextInt() - 1;
            System.out.println("Choose the column to play (starting from 1): ");
            int col = scanner.nextInt() - 1;
            valid = board.isValidMove(row, col);
            if (valid){
                return  new Point(row, col);
            } else {
                System.out.println("Invalid location! Please choose again.");
            }
        }
        return new Point(-1, -1); // We will never get here.
    }

    protected Point getComputerMove(Board board){
        ArrayList<Point> validPoints = new ArrayList<>();
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                if (board.isValidMove(i, j)){
                    validPoints.add(new Point(i, j));
                }
            }
        }
        return validPoints.get((int) (Math.random() * validPoints.size()));
    }

    public Point getPlayer1Move(Scanner scanner, Board board){
        return getPlayerMove(scanner, board);
    }
    public abstract Point getPlayer2Move(Scanner scanner, Board board);
}
