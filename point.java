import java.util.Scanner;
public class point{
int x;
int y;
double distanceTo(int x2,int y2){
return Math.sqrt(Math.pow(x-x2,2)+Math.pow(y-y2,2));
}
void midpoint(int x2,int y2){
double a=(x-x2)/(double)2;
double b=(y-y2)/(double)2;
System.out.println(a +" "+b);
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
point p=new point();
p.x=10;
p.y=15;
int r=sc.nextInt();
int s=sc.nextInt();
System.out.println(p.distanceTo(r,s));
p.midpoint(r,s);
}
}