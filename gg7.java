import java.util.Scanner;
public class gg7{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Massage: ");
String s= sc.nextLine();
int n=0,h=0,count=0,x=0,y=0;
for(int i=0;i<s.length();i++){
char ch = s.charAt(i);
int b=(int)ch;
int c=b-'0';

if(count==2){
  if(n>h){
  h=n;
  n=0;
  }
  count=0;
}
if(c>=0 && c<=9){
  if(y>0){
  n+=c;
  y=0;
  }
  if(n==0){
  n+=10*c;
  y++;
  }
  count++;
  x++;
}
}
if(x>0){
System.out.print("2-digit PIN: "+h);
}
else{
System.out.print("2-digit PIN: "+0);
}
}
}