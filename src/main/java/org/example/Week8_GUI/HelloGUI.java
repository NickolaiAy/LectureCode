package org.example.Week8_GUI;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloGUI extends JFrame {
    private JButton clickMeButton;
    private JPanel mainPanel;
    private JLabel myFirstLabel;
    protected HelloGUI () { // creates the gui that will be launched
        setContentPane(mainPanel);
        pack();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        clickMeButton.addActionListener(new ActionListener() { //creates a listener that will output a certain result after the button is clicked
            @Override
            public void actionPerformed(ActionEvent e) {
                myFirstLabel.setText("Hello, GUI!");
            }
        });
    }

    public static void main(String[] args) {
        HelloGUI gui = new HelloGUI();
    }
}
