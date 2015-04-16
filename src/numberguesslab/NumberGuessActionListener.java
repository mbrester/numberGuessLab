/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberguesslab;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author mbrester1
 */
public class NumberGuessActionListener implements ActionListener {

    public MainWindow window;

    public NumberGuessActionListener(MainWindow window) {
        this.window = window;
    }
    /**
     * This will start when the guess button is pressed, and will preform the task
     * of comparing the number with the guess.
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        try{
        window.getNgs().setUserGuess(Integer.valueOf(window.getTxtNumberGuess().getText()));
      int guess = window.getNgs().compareNumbers();
        switch(guess){
        case -1: JOptionPane.showMessageDialog(window.getRootPane(), "Your Guess Was Too Low");
            break;
        case 0:  JOptionPane.showMessageDialog(window.getRootPane(), "Correct");   
            System.exit(1);
            break;
        case 1: JOptionPane.showMessageDialog(window.getRootPane(), "Your Guess Was Too High");
            break;
        }
    }catch(IllegalArgumentException t){
        JOptionPane.showMessageDialog(window.getRootPane(), "Invalid Entry");
     }
    }
    
}
