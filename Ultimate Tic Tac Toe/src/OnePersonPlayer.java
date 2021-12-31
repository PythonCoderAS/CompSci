import java.util.ArrayList;
import java.util.Scanner;

public class OnePersonPlayer extends Player{

    public Point getPlayer2Move(Scanner scanner, Board board) {
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
}
