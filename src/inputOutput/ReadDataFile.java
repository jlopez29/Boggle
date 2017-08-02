//PACKAGE DECLARATION
package inputOutput;

//IMPORT LIBRARIES
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author JLOPEZ
 */

//READ DATA FILE CLASS DECLARATION
public class ReadDataFile 
{
    //MEMBER VARIABLES
    String fileName;
    Scanner readFile;
    ArrayList<String> fileData = new ArrayList<>();
    
    //CONSTRUCTOR WITH A FILE NAME IN PARAMETER
    public ReadDataFile(String tempName)
    {
        //SET MEMBER VARIABLE TO PARAMETER
        fileName = tempName;
    }
    public void populateData()throws IOException
    {
        //TEMPORARY STRING TO READ IN DATA
        String tempRead;
        
        try
        {
            //INSTANTIATE URL OBJECT WITH GIVEN FILE NAME
            URL url  = getClass().getResource(fileName);
            
            //INSTANTIATE FILE OBJECT WITH GIVEN URL PATH
           
            File urlFile = new File(url.toURI());
                            
            //SET MEMBER VAR. READ FILE AS NEW SCANNER OBJECT WITH CREATED URL
            readFile = new Scanner(urlFile);
            
            //LOOP THROUGH FILE UNTIL DOESNT HAVE NEXT
            while(readFile.hasNext())
            {
                //SET TEMP STRING TO NEXT STRING
                tempRead = readFile.next();
                
                //ADD TEMP STRING TO FILE DATA ARRAY LIST OF STRINGS
                fileData.add(tempRead);
            }
        
        }
        //CATCH FILE NOT FOUND EXCEPTION
        catch(Exception e)
        {
            System.out.println(e.toString());
            e.printStackTrace();
        }
        finally
        {
            //CLOSE FILE
            readFile.close();
        }
         
        
    }    
    
    //GET DATA METHOD
    public ArrayList<String> getData()
    {
        //RETURNS ARRAY LIST OF STRINGS WITH LETTERS FROM FILE
        return fileData;
    }
}
