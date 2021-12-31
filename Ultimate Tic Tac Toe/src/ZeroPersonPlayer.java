import java.util.Scanner;

/**
 * Easter Egg for typing "3" (undocumented)
 */
public class ZeroPersonPlayer extends Player{
    public Point getPlayer1Move(Scanner scanner, Board board) {
        return getComputerMove(board);
    }

    public Point getPlayer2Move(Scanner scanner, Board board) {
        return getComputerMove(board);
    }
}
