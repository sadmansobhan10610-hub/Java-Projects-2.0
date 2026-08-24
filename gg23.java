import java.util.Scanner;//turns the first letter of a word into capital
public class gg23{
  public static void main(String[] args){
  Scanner sc= new Scanner(System.in);
  String s=sc.nextLine();
  String n ="";
  int ascii=0,newascii=0,x=0,sp=0;
  for(int i=0;i<s.length();i++){
  char ch=s.charAt(i);
  ascii=(int)ch;
  if(ch==' ' || i==s.length()-1){
    
    if(i==s.length()-1){
      n+=s.charAt(s.length()-1);
    System.out.print(n);
    }
    else{
    System.out.print(n);
    }
    sp++;
  n="";
  x=0;
  }
  if((ascii>=97 && ascii<=122 && x==1) || i==0){
  newascii =ascii-32;
  char bh=(char)newascii;
  n+=bh;
  
  }
  else{
  n+=ch;
  
  }
  if(sp!=0){
  x++;
  }
  }
  
  }
}