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
// public boolean palindrome(String word)
// {
//   if(onlyLetters(noSpaces(word)).equals(reverse(onlyLetters(noSpaces(word)))))
//     return true;
//   return false;
// }
// public String reverse(String str)
// {
//       if(str.length()==0)
//   return "";
//   return str.substring(str.length()-1)+reverse(str.substring(0,str.length()-1));
// }
//   public String onlyLetters(String sString){
//   if(sString.length()==0)
//     return "";
//   if(Character.isLetter(sString.charAt(0))==false)
//     return onlyLetters(sString.substring(1));
//   return sString.charAt(0)+onlyLetters(sString.substring(1));
  
// }
// public String noSpaces(String sWord){
//   if(sWord.length()==0)
//   return "";
//   if(sWord.charAt(0)==' ')
//   return noSpaces(sWord.substring(1));;
//   return sWord.charAt(0)+noSpaces(sWord.substring(1));
// }
   public boolean palindrome(String word) 
  { if(onlyLetters(noSpaces(word)).equals(onlyLetters(reverse(noSpaces(word))))) 
    return true; else return false; 
  } 
  
  public String reverse(String str) 
  { String sNew = new String(); 
   for(int i = str.length()-1; i >= 0; i--) 
   { sNew = sNew + str.charAt(i); } 
   return sNew; } 
  
  public String noSpaces(String sWord){
    String answer = ""; 
    for(int i = 0; i < sWord.length(); i++)
      if(sWord.substring(i,i+1).equals(" ") == false)
        answer = answer + sWord.charAt(i); 
    return answer.toLowerCase(); 
  }
  
  public String onlyLetters(String sString)
  { 
    String answer = "";
    for(int i = 0; i < sString.length(); i++) 
      if(Character.isLetter(sString.charAt(i)))
      { answer += sString.substring(i,i+1); 
      } return answer; 
  } }

