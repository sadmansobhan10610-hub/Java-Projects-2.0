import java.util.Scanner;
public class gg14{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
String s= sc.nextLine();
int a=0,b=0,c=0,d=0,e=0,ascii=0;
for(int i=0;i<s.length();i++){
char ch=s.charAt(i);
ascii=(int)ch;
if(s.length()>=8){
a++;
}
if(ascii>=65 && ascii<=90){ b++;}
if(ascii>=97 && ascii<=122){c++;}
if(ascii>=48 && ascii<57){ d++;}
if(ch=='!'||ch=='@'||ch=='#'||ch=='$'){e++;}
}
if(a>0&&b>0&&c>0&&d>0&&e>0){
System.out.print("True");
}
else{
System.out.print("False");
}
}
}