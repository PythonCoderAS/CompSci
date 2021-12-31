package minesweeper;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;

public class MinesweeperWelcome extends JFrame implements MouseListener {
    private JLabel intro = new JLabel("Welcome to Minesweeper!");
    private JLabel inputQuestion1 = new JLabel("Enter the number of rows, as a number from 10 - 30:");
    private JLabel inputQuestion2 = new JLabel("Enter the number of columns, as a number from 10 - 30:");
    private JLabel inputQuestion3 = new JLabel("Enter number of mines, as a number from 10 - 30:");
    private JTextField input1 = new JTextField("10");
    private JTextField input2 = new JTextField("10");
    private JTextField input3 = new JTextField("10");
    private JButton startButton = new JButton("Start");

    public void initGrid(){
        GridBagConstraints introConstraint = new GridBagConstraints();
        introConstraint.gridx = 0;
        introConstraint.gridy = 0;
        introConstraint.gridwidth = 3;
        add(intro, introConstraint);
        GridBagConstraints inputQuestion1Constraint = new GridBagConstraints();
        inputQuestion1Constraint.gridx = 0;
        inputQuestion1Constraint.gridy = 1;
        inputQuestion1Constraint.gridwidth = 2;
        add(inputQuestion1, inputQuestion1Constraint);
        GridBagConstraints input1Constraint = new GridBagConstraints();
        input1Constraint.gridx = 2;
        input1Constraint.gridy = 1;
        add(input1, input1Constraint);
        GridBagConstraints inputQuestion2Constraint = new GridBagConstraints();
        inputQuestion2Constraint.gridx = 0;
        inputQuestion2Constraint.gridy = 2;
        inputQuestion2Constraint.gridwidth = 2;
        add(inputQuestion2, inputQuestion2Constraint);
        GridBagConstraints input2Constraint = new GridBagConstraints();
        input2Constraint.gridx = 2;
        input2Constraint.gridy = 2;
        add(input2, input2Constraint);
        GridBagConstraints inputQuestion3Constraint = new GridBagConstraints();
        inputQuestion3Constraint.gridx = 0;
        inputQuestion3Constraint.gridy = 3;
        inputQuestion3Constraint.gridwidth = 2;
        add(inputQuestion3, inputQuestion3Constraint);
        GridBagConstraints input3Constraint = new GridBagConstraints();
        input3Constraint.gridx = 2;
        input3Constraint.gridy = 3;
        add(input3, input3Constraint);
        GridBagConstraints startButtonConstraint = new GridBagConstraints();
        startButtonConstraint.gridx = 0;
        startButtonConstraint.gridy = 4;
        startButtonConstraint.gridwidth = 3;
        add(startButton, startButtonConstraint);
    }

    public MinesweeperWelcome() {
        super("Minesweeper");
        setLayout(new GridBagLayout());
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        initGrid();
        startButton.addMouseListener(this);
        toFront();
        repaint();
    }

    public static void main(String[] args) {
        new MinesweeperWelcome().setVisible(true);
    }

    public static Integer getNumberOrNull(String strNum) {
        if (strNum == null) {
            return null;
        }
        try {
            return Integer.parseInt(strNum);
        } catch (NumberFormatException nfe) {
            return null;
        }
    }

    public static void makeErrorDialog(String content){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JOptionPane.showMessageDialog(frame, content, "Error", JOptionPane.ERROR_MESSAGE);
    }

    public void mouseClicked(MouseEvent e) {
        String val1 = input1.getText();
        Integer num1 = getNumberOrNull(val1);
        if (num1 == null || num1 < 10 || num1 > 30){
            makeErrorDialog("The number of rows has to be a number between 10 and 30.");
            return;
        }
        String val2 = input2.getText();
        Integer num2 = getNumberOrNull(val2);
        if (num2 == null || num2 < 10 || num2 > 30){
            makeErrorDialog("The number of columns has to be a number between 10 and 30.");
            return;
        }
        String val3 = input3.getText();
        Integer num3 = getNumberOrNull(val3);
        if (num3 == null || num3 < 10 || num3 > 30){
            makeErrorDialog("The number of mines has to be a number between 10 and 30.");
            return;
        }
        new Board(num1, num2, num3).setVisible(true);
        dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
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
