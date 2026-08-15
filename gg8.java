import java.util.Scanner;
public class gg8{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
String s= sc.nextLine();
String n="";
int x=s.length()-1;
for(int i=0;i<s.length();i++){
char ch =  s.charAt(i);
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
  for(int j=x;j>=0;j--){
  char bh= s.charAt(j);
  if(bh=='a'||bh=='e'||bh=='i'||bh=='o'||bh=='u'||bh=='A'||bh=='E'||bh=='I'||bh=='O'||bh=='U'){
  n+=bh;
  j--;
  x=j;
  break;
  }
  }
}
else{
n+=ch;
}
}
System.out.print(n);
}
}
