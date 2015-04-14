/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberguesslab;

import java.util.Random;

/**
 *
 * @author mbrester1
 */
public class NumberGuessService {
    private int highNumber;
    private int lowNumber;
    private int userGuess;
    private int randomNumber;
    Random random = new Random();

    public NumberGuessService() {
        random = new Random();
    }

    public int getHighNumber() {
        return highNumber;
    }

    public void setHighNumber(int highNumber) throws IllegalArgumentException{
        if(highNumber < lowNumber || highNumber == 0){
            throw new IllegalArgumentException("High Number Must be greater than low number");
        }
        this.highNumber = highNumber;
    }

    public int getLowNumber() {
        return lowNumber;
    }

    public void setLowNumber(int lowNumber) throws IllegalArgumentException {
        if(lowNumber < 0){
           throw new IllegalArgumentException("Low Number Must be at least 0");  
        }
        this.lowNumber = lowNumber;
    }

    public int getUserGuess() {
        return userGuess;
    }

    public void setUserGuess(int userGuess) throws IllegalArgumentException{
        if(userGuess > highNumber || userGuess < lowNumber){
             throw new IllegalArgumentException("Your Guess Must Be with-in the range");
        }
        this.userGuess = userGuess;
    }

    public int getRandomNumber() {
        return randomNumber;
    }

    public void setRandomNumber() {
        randomNumber = random.nextInt(highNumber)+lowNumber;
    }
   
    
    public int compareNumbers(){
        int lowHighEqual = -2;
       if(userGuess < randomNumber){
           lowHighEqual = -1;
       }
       else if(userGuess > randomNumber){
           lowHighEqual = 1;
       }
      else if(userGuess == randomNumber){
           lowHighEqual = 0;
       }
      return lowHighEqual;
    }
    
    
    
    
    
}
