import java.util.Scanner;
public class gg13{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
String s= sc.nextLine();
String n="";
int a=0;
for(int i=0;i<s.length();i++){
  char ch=s.charAt(i);
  int ascii=(int)ch;
  if(ascii>=48 && ascii<=57){
  a=ascii-'0';
  
  }
  if(ch=='['){
  char bh=s.charAt(i+1);
  for(int j=1;j<=a;j++){
  n+=bh;
  }
  }
  
}
System.out.print(n);

}
}