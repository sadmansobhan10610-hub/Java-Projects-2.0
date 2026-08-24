import java.util.Scanner;//This can print the name of yours from array too string
public class gg21{
  public static void main(String[] args){
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter the length of your name: ");
  int n=sc.nextInt();
  char[] st=new char[n];
  System.out.print("Enter the charecters of your name to string:");
  for(int i=0;i<n;i++){
    String d=sc.next();
    char ch = d.charAt(0);
    st[i]=ch;
  }
  String s="";
  for(int i=0;i<st.length;i++){
  s+=st[i];
  }
  System.out.print(s);
  
  }
}