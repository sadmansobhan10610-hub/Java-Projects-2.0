import java.util.Scanner;
public class bankAccount{
int accNo;
double balance;
double deposit(double dep){
return balance-dep;

}
boolean withdraw(double dep){
  if(balance<dep){return false;}
  else{return true;}
}
public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
bankAccount b1=new bankAccount();
b1.accNo=sc.nextInt();
b1.balance=sc.nextDouble();
double d=sc.nextDouble();
b1.deposit(d);
System.out.println(b1.withdraw(d));
}
}