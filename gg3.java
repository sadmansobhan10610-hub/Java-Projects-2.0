import java.util.Scanner;//thiss can print a specific sections of a  strinng with only basic loops
public class gg3{
  public static void  main(String[] args){
  Scanner sc = new Scanner(System.in);
  
  System.out.print("Text: ");
  String s=sc.nextLine();
  System.out.print("StartIndex: ");
  int start = sc.nextInt();
  System.out.print("EndIndex: ");
  int end = sc.nextInt();
  
  String n="";
  for(int i=start;i<=end;i++){
  n+=s.charAt(i);
  }
  System.out.print(n);
  }
}