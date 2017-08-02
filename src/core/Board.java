//PACKAGE DECLARATION
package core;

//IMPORT LIBRARY
import java.util.ArrayList;

/**
 *
 * @author JLOPEZ
 */

//BOARD CLASS DECLARATION
public final class Board 
{
    //MEMBER VARIABLES FOR CLASS BOARD
    final int NUMBER_OF_DICE = 16;
    final int NUMBER_OF_SIDES = 6;
    final int GRID = 4;
    
    ArrayList<Die> allDice = new ArrayList<>();
    ArrayList<String> stringDie;
    
    
    //BOARD CLASS CONSTRUCTOR WITH ARRAY LIST STRING PARAMETER
    public Board(ArrayList<String> boggleData)
    {
        //SET MEMBER VARIABLE TO GIVEN PARAMETER
        stringDie = boggleData;
    }
    
    //BOARD CLASS METHOD: POPULATE DICE
    public void populateDice()
    {
        //LOCAL VARIABLES
        int countDice = 0;
        int countSides = 0;
        
        //LOOP UNTIL NUMBER OF DICE MET
        while (countDice < NUMBER_OF_DICE)
        {
            //ENCAPSULATED COUNTER
            int modCount = 0;
            
            //TEMPORARY DIE OBJECT INSTANTIATION
            Die temp = new Die();
            
            //LOOP UNTIL NUMBER OF SIDES MET
            while(modCount < NUMBER_OF_SIDES)
            {
                //ADD LETTER TO SIDE WITH DIE CLASS METHOD ADD LETTER
                temp.addLetter(stringDie.get(countSides));
                
                //INCREMENT COUNTERS
                countSides++;
                modCount++;
            }
            
            //PRINT OUT CURRENT DIE LETTERS
            System.out.print("Die " + (countDice+1) + ": ");
            temp.displayAllLetters();
            System.out.println();
            
            //ADD TEMPORARY DICE OBJECT TO ALL DICE ARRAY LIST
            allDice.add(temp);
           
            //INCREMENT COUNTER
            countDice++;    
        }               
    }

    //BOARD CLASS METHOD: SHAKE DICE
    public ArrayList shakeDice()
    {        
        //CALL BOARD CLASS METHOD POPULATE DICE
        populateDice();
        
        //LOCAL COUNTER           
        int counter = 0;
        
        //PRINT BOGGLE BOARD
        System.out.println("\n\nBoggle Board");
        
        //LOOP UNTIL NUMBER OF DICE MET
        while(counter < NUMBER_OF_DICE)
        {
            //IF COUNTER MOD 4 IS ZERO PRINT NEW LINE
            if(counter % 4 == 0)
                System.out.println();
            
            //PRINT DICE LETTER WITH DIE CLASS METHOD GET LETTER
            System.out.print(allDice.get(counter).getLetter() + " ");
            
            //INCREMENT COUNTER
            counter++;
        }
        
        //RETURN ALLDICE ARRAY LIST OF DICE
        return allDice;
    }
    
}
