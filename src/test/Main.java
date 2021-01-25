package File;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        // write your code here
        //input filepath dit gaat op de naam van het bestand dit werkt alleen als alle bestand namen opgeslagen zijn in dezelfde map
        System.out.println("vul de naam van het bestand dat je wil uitlezen in");
        Scanner filename = new Scanner(System.in);
        String userName = filename.nextLine();
        // locatie waar het bestand is opgeslagen dit heb ik als losse variable opgeslagen
        String bestandLocatie = "C:/Users/jarih/Downloads/";

        File f1=new File(bestandLocatie+userName+".txt"); //Creation of File Descriptor for input file
        //input het woord waar op gefilterd
        System.out.println("vul de naam van het bestand dat je wil uitlezen in");
        Scanner wordName = new Scanner(System.in);
        String filterWord = wordName.nextLine();

        String[] words=null;  //Intialize the word Array
        FileReader fr = new FileReader(f1);  //Creation of File Reader object
        BufferedReader br = new BufferedReader(fr); //Creation of BufferedReader object
        String s;
        String input=filterWord;   // Input word to be searched
        int count=0;   //Intialize the word to zero
        while((s=br.readLine())!=null)   //Reading Content from the file
        {
            words=s.split(" ");  //Split the word using space
            for (String word : words)
            {
                if (word.equals(input))   //Search for the given word
                {
                    count++;    //If Present increase the count by one
                }
            }
        }
        if(count!=0)  //Check for count not equal to zero
        {
            System.out.println("de naam van het gegeven woord komt "+count+ " voor in het bestand");
        }
        else
        {
            System.out.println("de naam van het gegeven woord komt niet voor in het bestand");
        }

        fr.close();
    }
}