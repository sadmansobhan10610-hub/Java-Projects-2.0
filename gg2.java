import java.util.Scanner;// prints the first common letter of a two strings with only simple shit
public class gg2{
  public static void  main(String[] args){
  Scanner sc = new Scanner(System.in);
  String s=sc.nextLine();
  String r=sc.nextLine();
  String n="";
  int j=0;
  for(int i=0;i<s.length();i++){
    if(s.charAt(0)==r.charAt(0)){
      if((s.charAt(i)== r.charAt(j)) && i==j){
      n+=s.charAt(i);
      
      }
    }
    if(j<r.length()-1){j++;}
    
  }
  if(n.length()>0){
  System.out.print(n);
  }
  else{
   System.out.print("There is no common prefix between the input strings.");
  }
  }
}