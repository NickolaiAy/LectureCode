package org.example.Week8_GUI;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MovieGUI extends JFrame {
    private JLabel MovieTitle;
    private JSlider ratingSlider;
    private JLabel Rating;
    private JTextField movieTitleTextField;
    private JCheckBox wouldSeeAgainCheckBox;
    private JLabel movieOpinionLabel;
    private JLabel sliderValueLabel;
    private JTextField movieOpinionTextField;
    private JPanel mainPanel;
    private JButton quitButton;

    MovieGUI() { // creates the gui that will be launched
        setContentPane(mainPanel);
        pack();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        configureEventHandlers();
    }

    private void configureEventHandlers() { //this creates method that allows you to control event handling and create custom responses to user interaction
        ratingSlider.addChangeListener(new ChangeListener() { //makes the stars update their value via user movement
            @Override
            public void stateChanged(ChangeEvent e) {
                String valueLabelText = ratingSlider.getValue() + " stars";
                sliderValueLabel.setText(valueLabelText);
                updateOpinion();
            }
        });
        wouldSeeAgainCheckBox.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                updateOpinion();
            }
        });
        movieTitleTextField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                updateOpinion();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateOpinion();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {

            }
        });
        quitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        quitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (JOptionPane.showConfirmDialog(MovieGUI.this, "Are you sure you want to quit?", "Quit", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
                    dispose();
                }
            }
        });
    }
    private void updateOpinion() { //this creates allows the user to see a realtime update of what they have input via the label
        String title = movieTitleTextField.getText();
        if (title.trim().length() == 0) {
            movieOpinionLabel.setText("Enter a movie title");
        } else {
            int rating = ratingSlider.getValue();
            boolean seeAgain = wouldSeeAgainCheckBox.isSelected();
            String template = "You rated '%s' %d stars. You %s see again.";
            String seeAgainStr = seeAgain ? "would" : "would not";
            String opinion = String.format(template, title, rating, seeAgainStr);
            movieOpinionLabel.setText(opinion);
        }
    }

    public static void main(String[] args) {
        MovieGUI gui = new MovieGUI();
    }
}
