import java.util.Scanner;//removes the second input letter from the 1st  input string
public class homew2{
  public static void  main(String[] args){
  Scanner sc = new Scanner(System.in);
  
  String s= sc.nextLine();
  String r=sc.nextLine();
  char c=r.charAt(0);
  String ne="";
  for(int i=0;i<s.length();i++){
    
    if(s.charAt(i)==c){
    continue;
    }
    ne+=s.charAt(i);
  }
  System.out.print(ne);
  }
}