import java.util.Scanner;//removes any dobling number from the String
public class homew5{
  public static void  main(String[] args){
  Scanner sc = new Scanner(System.in);
  String s= sc.nextLine();
  int count=0;
  String r="";
  String n="";
  for(int i=0;i<s.length();i++){
  r+=s.charAt(i);
  count=0;
  for(int j=0;j<r.length();j++){
    if(s.charAt(i)==r.charAt(j)){
    count++;
    }
  }
  if(count==1){
  n+=s.charAt(i);
  }
 
  }
  
  

  System.out.print(n);
  }
}