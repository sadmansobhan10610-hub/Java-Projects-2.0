import java.util.Scanner;
public class counter{
int count;
int increment(){
return count++;

}
int decrement(){
return count--;
}
void reset(){
count=0;
}
void getCount(){
System.out.println(count);
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
counter c1=new counter();
c1.count=sc.nextInt();
counter c2=new counter();
c2.count=sc.nextInt();
c1.getCount();
c2.getCount();
c1.increment();
c2.decrement();
c1.getCount();
c2.getCount();
c1.reset();
c1.getCount();
c2.getCount();
}
}