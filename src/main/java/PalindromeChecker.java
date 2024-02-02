import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class PalindromeChecker {
public void tester()
{
  //String lines[] = loadStrings("palindromes.txt");
  String[] lines = new String[6]; 
    try{
        File myFile = new File("palindromes.txt");
        Scanner myReader = new Scanner(myFile);
        int counter = 0;
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            lines[counter] = data;
            counter++;
        }
        myReader.close();
    }
    catch (FileNotFoundException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
    }
  System.out.println("there are " + lines.length + " lines");
  for (int i=0; i < lines.length; i++) 
  {
    if(palindrome(lines[i])==true)
    {
      System.out.println(lines[i] + " IS a palindrome.");
    }
    else
    {
      System.out.println(lines[i] + " is NOT a palindrome.");
    }
  }
}
public boolean palindrome(String word)
{
  if(onlyLetters(noSpaces(word)).equals(reverse(onlyLetters(noSpaces(word)))))
    return true;
  return false;
}
public String reverse(String str)
{
      if(str.length()==0)
  return "";
  return str.substring(str.length()-1)+reverse(str.substring(0,str.length()-1));
}
  public String onlyLetters(String sString){
  if(sString.length()==0)
    return "";
  if(Character.isLetter(sString.charAt(0))==false)
    return onlyLetters(sString.substring(1));
  return sString.charAt(0)+onlyLetters(sString.substring(1));
  
}
public String noSpaces(String sWord){
  if(sWord.length()==0)
  return "";
  if(sWord.charAt(0)==' ')
  return noSpaces(sWord.substring(1));;
  return sWord.charAt(0)+noSpaces(sWord.substring(1));
}
}
