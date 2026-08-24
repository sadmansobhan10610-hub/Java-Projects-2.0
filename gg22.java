import java.util.Arrays;//Converts a string to a array with the charecters of the string
import java.util.Scanner;
public class gg22{
  public static void main(String[] args){
  Scanner sc= new Scanner(System.in);
  System.out.print("Enter any String: ");
  String s = sc.nextLine();
  
  char[] st = new char[s.length()];
  for(int i=0;i<s.length();i++){
  char ch= s.charAt(i);
  st[i]=ch;
  }
    System.out.print(Arrays.toString(st));
  }
}