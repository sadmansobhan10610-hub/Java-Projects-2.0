import java.util.Scanner;//it can make doubled letters normal and slip a string into part without using split or any arguments
public class gg4{
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  String s =sc.nextLine();
  String r="";
  String n="";
  int count =0;
  char sep=s.charAt(s.length()-1);
  System.out.println("The words are:");
  for(int i=0;i<s.length();i++){
  char c= s.charAt(i);
  if(c==sep){
  System.out.println(n);
  n="";
  r="";
  }
  else{
  r+=c;
  count =0;
  if(n.length()!=0){
  for(int j=r.length()-2;j<r.length();j++){
    if(r.charAt(j)==n.charAt(n.length()-1)){
    count++;
    }
  }
  if(count==1 || count ==0){
  n+=c;
  }
  }
  else{
  n+=s.charAt(i);
  }
  }
  }
  }
}
