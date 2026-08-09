import java.util.Scanner;
public class kaprekarNumber{
public  static void main(String[] args){
Scanner sc= new Scanner(System.in);
System.out.print("ENter a number: ");
int n=sc.nextInt();
int m=n*n,x=m,d=0,b=0,y=0,sum=0,a=0;
while(x!=0){
    x/=10;
    d++;
}
x=m;
if(d%2==1){
System.out.println("It can't be a Kaprekar number");

}

else{
    while(x!=0){
     a=d/2;
    b=(int)Math.pow(10,a);
   sum+=x%b;
   x/=b;
    }
}
if(n==sum){
    System.out.print("This is a Kaprekar number");
}
else{
    System.out.print("This is a not Kaprekar number");
}

}

}