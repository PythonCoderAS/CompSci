// This is the Fortune Teller applet

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//import java.applet.AudioClip;

public class FortuneTeller extends JApplet
        implements ActionListener
{
    // Declare an array of "fortunes" (strings):
    String[] fortunes = {"You will get a good score on your next test", "You will meet someone who will become special to you",
    "You will find a few dollars in an unexpected place", "You will procastinate and get a bad score on your next test",
    "You will have a fight with someone close to you", "You will have bad luck, and you should avoid the lottery for a while",
    "You will get an unexpected illness.", "You will face great prospects at work", "You will succeed in a romance.",
    "You will reunite with a person you used to be close with."};

    private JTextField display;
    // private AudioClip ding;

    public void init()
    {
        //ding = getAudioClip(getDocumentBase(), "ding.wav");

        display = new JTextField("  Press \"Next\" to see your fortune...", 30);
        display.setBackground(Color.WHITE);
        display.setEditable(false);

        JButton go = new JButton("Next");
        go.addActionListener(this);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(display);
        c.add(go);
    }

    public void actionPerformed(ActionEvent e)
    {
        //ding.play();

        // Pick a random fortune:
        int randomNumber = (int) (Math.random() * fortunes.length);
        display.setText("Fortune: " + fortunes[randomNumber]);
    }
}
