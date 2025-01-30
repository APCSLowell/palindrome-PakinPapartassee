public void setup()
{
  String lines[] = loadStrings("palindromes.txt");
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
  String s = onlyLetters(word);
  s = noSpaces(s);
  s = noCapitals(s);
  if (s.equals(reverse(s))){
    return true;
  }
  return false;
}
public String reverse(String str)
{
  String bob = "";
  for (int i =str.length();i>0;i--){
    bob+=str.substring(i-1,i);
  }
  return bob;
}
public String onlyLetters(String sString){
  String s = "";
  for (int i =0;i<sString.length();i++){
    if (Character.isLetter(sString.charAt(i))==true){
      s+=sString.charAt(i);
    }
  }
  return s;
}
public String noCapitals(String sWord){
  return sWord.toLowerCase();
}
public String noSpaces(String sWord){
  String s = "";
  for (int i =0; i<sWord.length();i++){
    if (Character.isLetter(sWord.charAt(i))==true){
      s+=sWord.charAt(i);
    }
  }
  return s;
}

public class Main {
 
	public static void main(final String[] args) {
		PalindromeChecker sim = new PalindromeChecker();
        	sim.tester();
	}
	

}

