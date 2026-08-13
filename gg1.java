import java.util.Scanner;//change the type of vowel in a string
public class gg1{
  public static void  main(String[] args){
  Scanner sc = new Scanner(System.in);
  String s=sc.nextLine();
  String n="";
  int ascii=0,newascii=0;
  for(int i=0;i<s.length();i++){
  char ch= s.charAt(i);
  if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
  ascii = (int)ch;
  newascii=ascii-32;
  char b=(char)newascii;
  n+=b;
  }
  else if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
  ascii = (int)ch;
  newascii=ascii+32;
  char b=(char)newascii;
  n+=b;
  }
  else{
  n+=ch;
  }
  }
  System.out.print(n);
  }
}
  