package minesweeper;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Tile extends JButton implements MouseListener {
    private final boolean isMine;
    private final Board board;
    private final int boardRow, boardCol;
    private String textToShow = "Not Generated Yet.";
    private boolean tileRevealed = false, isFlag = false;

    public Tile(boolean mine, Board gameBoard, int row, int col) {
        super("H");
        isMine = mine;
        board = gameBoard;
        boardRow = row;
        boardCol = col;
        setPreferredSize(new Dimension(30, 25));
        setFont(getFont().deriveFont(10F));
        setMargin(new Insets(0, 0, 0, 0));
        addMouseListener(this);
    }

    public boolean isMine() {
        return isMine;
    }

    public String toString() {
        return "Tile(" + boardRow + ", " + boardCol + "){isMine=" + isMine + ", tileRevealed=" + tileRevealed + "}";
    }

    public void mouseClicked(MouseEvent e) {
        if (SwingUtilities.isRightMouseButton(e) || e.isControlDown() || e.getModifiers() == MouseEvent.BUTTON3_MASK) {
            if (!isFlag) {
                flagOn();
            } else {
                flagOff();
            }
        } else if (isMine) {
            board.lose();
        } else if (!tileRevealed) {
            makeVisible();
        }
    }

    private void generateTextToShow() {
        int nearbyMines = getNearbyMines();
        if (nearbyMines != 0) {
            textToShow = Integer.toString(nearbyMines);
        } else {
            textToShow = null;
        }
    }

    private boolean tileIsVisibilityCandidate(Tile tile) {
        if (tile == null) {
            return false;
        }
        if (tile.textToShow != null && tile.textToShow.equals("Not Generated Yet.")) {
            generateTextToShow();
        }
        return tile.tileRevealed && tile.textToShow == null;
    }

    private void makeVisible() {
        if (!tileRevealed) {
            board.madeVisible.add(this);
            generateTextToShow();
            actuallyVisible();
            if (isFlag) {
                isFlag = false;
            }
            makeNearbyTilesVisible();
            board.winCheck();
            repaint();
        }
    }

    private void makeNearbyTilesVisible() {
        for (Tile[] row : board.nearbyTiles(boardRow, boardCol)) {
            for (Tile tile : row) {
                if (tile != null && !tile.isMine() && !board.madeVisible.contains(tile)) {
                    tile.makeVisibleNotClicked();
                }
            }
        }
    }

    private int getNearbyMines() {
        int nearbyMines = 0;
        for (Tile[] row : board.nearbyTiles(boardRow, boardCol)) {
            for (Tile tile : row) {
                if (tile != null) {
                    if (tile.isMine()) {
                        nearbyMines++;
                    }
                }
            }
        }
        return nearbyMines;
    }

    private void actuallyVisible() {
        tileRevealed = true;
        setText(textToShow);
    }

    public void setText(String text) {
        if (text != null && text.equals("H")) {
            setForeground(Color.GRAY);
        } else {
            setForeground(Color.BLACK);
        }
        super.setText(text);
    }

    private void makeVisibleNotClicked() {
        if (!tileRevealed) {
            generateTextToShow();
            Tile[][] arr = board.nearbyTiles(boardRow, boardCol);
            if ((tileIsVisibilityCandidate(arr[0][1]) || tileIsVisibilityCandidate(arr[1][0]) || tileIsVisibilityCandidate(arr[2][1]) || tileIsVisibilityCandidate(arr[1][2]) && !isFlag)) {
                board.madeVisible.add(this);
                actuallyVisible();
                makeNearbyTilesVisible();
            }
        }
    }

    public boolean isTileRevealed() {
        return tileRevealed;
    }

    private void flagOn() {
        // setIcon(flagImg);
        if (getText() == null || !getText().equals("H")) {
            MinesweeperWelcome.makeErrorDialog("You can only flag a tile that hasn't been revealed!");
        } else if (board.canAddFlag()) {
            setText("F");
            board.addFlag();
            isFlag = true;
        } else {
            MinesweeperWelcome.makeErrorDialog("You cannot add any more flags! Right click an existing flag to remove it.");
        }
    }

    private void flagOff() {
        // setIcon(null);
        setText("H");
        board.removeFlag();
        isFlag = false;
    }

    public void mousePressed(MouseEvent e) {

    }

    public void mouseReleased(MouseEvent e) {

    }

    public void mouseEntered(MouseEvent e) {

    }

    public void mouseExited(MouseEvent e) {

    }
}
