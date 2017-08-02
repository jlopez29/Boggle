/*

WRITTEN BY: JESSE ALEXANDER LOPEZ
CLASS: COP 3330-C0001 (OBJECT ORIENTED PROGRAMMING IN JAVA)
PROFESSOR: KARIN WHITING
DATE: JUNE 15TH 20215

*/

//PACKAGE DECLARATION
package boggle;

//IMPORT LIBRARIES
import core.Board;
import inputOutput.ReadDataFile;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author JLOPEZ
 */

//DECLARATION OF BOGGLE CLASS
public class Boggle 
{
    //MEMBER VARIABLES OF BOGGLE CLASS
    static ArrayList<String> dice = new ArrayList<>();
    String input;

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    
        // LOCAL VARIABLE
        static String fileName = "boggleData.txt";
        
        //INSTANTIATE READ DATA FILE 
        static ReadDataFile read = new ReadDataFile(fileName);
    
    //MAIN METHOD
    public static void main(String[] args) throws IOException
    {                
        //CALL READ DATA FILE METHOD POPULATE DATA
        read.populateData();
        
        //SET ARRAY LIST OF STRINGS TO ARRAY LIST FROM GET DATA METHOD
        dice = read.getData();
        
        //INSTANTIATES A NEW BOARD
        Board newBoard = new Board(dice);
       
        //SETS CURRENT BOARD MEMBER VARIABLE TO BOARD METHOD SHAKE DICE
        newBoard.shakeDice();
        
        //PUTS BUILD OUTCOME PROMPT AFTER BOGGLE BOARD
        System.out.println("\n");
    }
    
}
