import java.util.Scanner;//find a charecter in a string without  array
public class homew1{
  public static void  main(String[] args){
  Scanner sc = new Scanner(System.in);
  
  String s= sc.nextLine();
  String r=sc.nextLine();
  char c = r.charAt(0);
  boolean x=false;
  for(int i=0;i<s.length();i++){
 
  if(s.charAt(i)==c){
  System.out.println("Char was found at "+ (i+1));
  x=true;
  }
  }
  if(!x){
  System.out.print("Theres no same numbers");
  }
  }
}