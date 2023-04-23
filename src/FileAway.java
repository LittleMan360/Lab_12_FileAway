import java.io.*;
import java.io.File;
import javax.swing.JFileChooser;


class Filechooser
{

    public static void main(String[] args) throws IOException
    {

        JFileChooser chooser = new JFileChooser("f:"); //choosing the file in f: drive

        int returnValue = chooser.showOpenDialog(null); //opening and selecting the text file in f:


        if (returnValue == JFileChooser.APPROVE_OPTION) //after selecting
        {
            File file1 = chooser.getSelectedFile(); //assigning the chosen text document to file1
            FileInputStream fStream = new FileInputStream(file1);
            InputStreamReader in = new InputStreamReader(fStream);
            BufferedReader reader1 = new BufferedReader(in);

            String line;


            int wordCount = 0;
            int lineCount=0;
            int characterCount = 0;



            while((line = reader1.readLine()) != null) //while content in file is not null
            {

                if(!(line.equals(""))) //line by line
                {

                    characterCount = characterCount+line.length(); //calculating the characters


                    String[] wordstring = line.split("\\s+"); //taking all the words into string array line by line

                    wordCount= wordCount+wordstring.length; //counting the words

                    lineCount++;


                }
            }

            System.out.println("Total number of words = " + wordCount);

            System.out.println("Total number of characters = " + characterCount);
            System.out.println("Total number of lines = " + lineCount);

        }
    }

}

