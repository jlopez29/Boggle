//PACKAGE DECLARATION
package core;

//IMPORT LIBRARIES
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author JLOPEZ
 */

//DIE CLASS DECLARATION
public class Die 
{
    //MEMBER VARIABLES
    final int NUMBER_OF_SIDES = 6;
    ArrayList<String> diceData = new ArrayList<>();
    String currLetter;
    
    //ADD LETTER METHOD
    public void addLetter(String temp)
    {
        //ADD STRING PARAMETER TO DICE DATA OBJECT WITH ARRAY LIST ADD METHOD
        diceData.add(temp);
    }
    
    //GET LETTER METHOD
    public String getLetter()
    {
        //CALL DIE METHOD RANDOM LETTER TO ASSIGN CURRENT LETTER
        this.randomLetter();
        
        //RETURN CURRENT LETTER
        return currLetter;
    }
    
    //RANDOM LETTER METHOD
    public void randomLetter()
    {
        //CREATE RANDOM VARIABLE 
        Random randLetter = new Random();
        
        //SET INTEGER X TO RANDOM NUMBER BETWEEN 0-5
        int x = randLetter.nextInt(6);
        
        //SET MEMBER VARIABLE TO RANDOM ELEMENT OF DICE DATA OBJECT
        currLetter = this.diceData.get(x);
    }
    
    //DISPLAY ALL LETTERS METHOD
    public void displayAllLetters()
    {
        //LOCAL COUNTER
        int counter = 0;
        
        //LOOP UNTIL NUMBER OF SIDES MET
        while(counter < NUMBER_OF_SIDES)
        {
            //PRINT OUT CURRENT SIDE BASED ON COUNTER
            System.out.print(this.diceData.get(counter) + " ");
                        
            //INCREMENT COUNTER
            counter++;
        }
        
    }
    
    
    
    
    
    
    
    
}
