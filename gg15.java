import java.util.Scanner;
public class gg15{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);

int a=100,sum=0;
for(int i=1;i<=5;i++){
String s= sc.nextLine();
sum=0;
for(int j=0;j<s.length();j++){
char ch=s.charAt(j);
sum+=(int)ch;

}
if(sum%2==1){
a-=50;
}
else{a+=25;}
if(s.length()<3){a-=10;}
else if(sum%3==0){a-=10;}
if(a>200){a=200;}

}
if(a<=0){
System.out.print("You Won");
}
else{
System.out.print("You Lost");
}
}
}