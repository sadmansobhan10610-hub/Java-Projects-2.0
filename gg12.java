import java.util.Scanner;
public class gg12{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Massage: ");
String s= sc.nextLine();
System.out.print("Key: ");
String r=sc.nextLine();
String n="";
  int x=0;
  boolean y=false,z=false;
  if(r.length()>s.length()){
  y=true;
  x=s.length()-1;
  }
  else if(r.length()==s.length()){
  x=r.length()-1;
  }
  else{
  z=true;
  x=r.length()-1;
  }
  for(int i=0;i<=x;i++){
  n+=s.charAt(i);
  n+=r.charAt(i);
  }
  if(y){
    for(int j=x+1;j<r.length();j++){
    n+=r.charAt(j);
    }
  }
  if(z){
    for(int k=x+1;k<s.length();k++){
     n+=s.charAt(k);
      }
    }
  System.out.print(n);

}
}