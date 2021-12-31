package minesweeper;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class Board extends JFrame {
    private static final String[] continueButtonNames = {"No", "Yes"};
    private final Tile[][] tiles;
    private final int mineCount;
    protected ArrayList<Tile> madeVisible = new ArrayList<>();
    private int flagCount = 0;
    private JLabel label;

    public Board(int rows, int cols, int mines) {
        super("Minesweeper");
        if (rows < 10 || rows > 30) {
            throw new RuntimeException(rows + " is not inside the range of 10 <= rows <= 30.");
        }
        if (cols < 10 || cols > 30) {
            throw new RuntimeException(cols + " is not inside the range of 10 <= cols <= 30.");
        }
        tiles = new Tile[rows][cols];
        mineCount = mines;
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(cols * 30 + 40, rows * 30 + 80);
        setLayout(new GridBagLayout());
        generateLabel();
        generateTiles();
        toFront();
        repaint();
    }

    public static ArrayList<Integer> getUniqueRandomNumber(int num, int stop) {
        return getUniqueRandomNumber(num, 0, stop);
    }

    private static int getRandomNumber(int start, int stop) {
        return (int) (Math.random() * stop) + start;
    }

    public static ArrayList<Integer> getUniqueRandomNumber(int num, int start, int stop) {
        ArrayList<Integer> done = new ArrayList<>(num);
        for (int i = 0; i < num; i++) {
            int number = getRandomNumber(start, stop);
            while (done.contains(number)) {
                number = getRandomNumber(start, stop);
            }
            done.add(number);
        }
        return done;
    }

    public static void makeSuccessDialog(String content) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JOptionPane.showMessageDialog(frame, content, "Success", JOptionPane.INFORMATION_MESSAGE);
    }

    private void generateLabel() {
        GridBagConstraints constraints = new GridBagConstraints();
        label = new JLabel("Flags: " + flagCount + "/" + mineCount);
        constraints.gridy = 0;
        constraints.gridx = 0;
        constraints.gridwidth = tiles.length;
        add(label, constraints);
    }

    private void generateTiles() {
        GridBagConstraints constraints;
        Tile tile;
        ArrayList<Integer> mineTiles = getUniqueRandomNumber(mineCount, tiles.length * tiles[0].length);
        int count = 0;
        for (int i = 0; i < tiles.length; i++) {
            for (int j = 0; j < tiles[i].length; j++) {
                constraints = new GridBagConstraints();
                constraints.gridx = j;
                constraints.gridy = i + 1;
                tile = new Tile(mineTiles.contains(count), this, i, j);
                tiles[i][j] = tile;
                add(tile, constraints);
                count++;
            }
        }
    }

    public Tile getTile(int row, int col) {
        return tiles[row][col];
    }

    private boolean validLocation(int row, int col) {
        return row >= 0 && row < tiles.length && col >= 0 && col < tiles[0].length;
    }

    public Tile[][] nearbyTiles(int row, int col) {
        int currentRowIndex, currentColIndex;
        Tile[][] data = new Tile[3][3];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                // This assumes that our current tile is located at (1, 1) on this 3 * 3 grid. All operations are
                // relative to this value.
                currentRowIndex = row - (1 - i);
                currentColIndex = col - (1 - j);
                if (validLocation(currentRowIndex, currentColIndex)) {
                    data[i][j] = getTile(currentRowIndex, currentColIndex);
                }
            }
        }
        return data;
    }

    public void lose() {
        MinesweeperWelcome.makeErrorDialog("You hit a mine! You lost!");
        onGameEnd();
    }

    private void onGameEnd() {
        for (Tile[] row : tiles) {
            for (Tile tile : row) {
                if (tile.getText() != null && tile.getText().equals("F")) { // Flag
                    if (!tile.isMine()) {
                        tile.setText("X"); // Invalid Flag
                    }
                } else if (tile.isMine()) {
                    tile.setText("B"); // Un-flagged Bomb
                }
            }
        }
        JFrame frame = new JFrame("Continue?");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        int buttonNumber = JOptionPane.showOptionDialog(frame, "Would you like to play again?", "Continue?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, continueButtonNames, continueButtonNames[1]);
        if (buttonNumber == 1) { // Continue
            MinesweeperWelcome.main(null);
        } else {
            for (Frame frame1 : Frame.getFrames()) {
                if (frame1 != this) {
                    frame1.dispose();
                }
            }
            System.exit(0);
        }
        dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));


    }

    public void win() {
        makeSuccessDialog("You won!");
        onGameEnd();
    }

    public boolean canAddFlag() {
        return flagCount < mineCount;
    }

    private void updateFlagText() {
        label.setText("Flags: " + flagCount + "/" + mineCount);
    }

    public void addFlag() {
        flagCount++;
        updateFlagText();
    }

    public void removeFlag() {
        flagCount--;
        updateFlagText();
    }

    public void winCheck() {
        for (Tile[] row : tiles) {
            for (Tile tile : row) {
                if (!tile.isMine() && !tile.isTileRevealed()) {
                    return;
                }
            }
        }
        win();
    }
}