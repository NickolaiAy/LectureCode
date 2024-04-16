package org.example.Week8_GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CurrencyConverter  extends JFrame{
    private JPanel mainPanel;
    private JTextField dollarsTextField;
    private JButton convertButton;
    private JLabel eurosResultLabel;
    private double dollarsToEurosExchangeRate = 0.84; //intial exchange value
    CurrencyConverter() { // creates the gui that will be launched
        setContentPane(mainPanel);
        pack();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { //after basic data is entered this method will calculate it and produce a result that will be outputted
                String dollarString = dollarsTextField.getText();
                double dollars = Double.parseDouble(dollarString);
                double euros = dollars * dollarsToEurosExchangeRate;
                String resultString = String.format("%.2f dollars is equivalent to %.2f Euros", dollars, euros);
                eurosResultLabel.setText(resultString);
            }
        });
    }

    public static void main(String[] args) {
        CurrencyConverter gui = new CurrencyConverter();
    }
}
