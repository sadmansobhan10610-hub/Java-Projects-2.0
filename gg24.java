import java.util.Scanner;
public class gg24{
  public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter a number");
  int n=sc.nextInt();
  System.out.println("Your sequence in underneth:  ");
  sequence(n);
  
  }
  public static void evenChecker(int a){
    if(a%2==0){System.out.println(" Your number Even!!");}
    else{System.out.println("Your number Odd!!");}
  }
  public static boolean isEven(int b){
    if(b%2==0){return true;}
    else{return false;}
  }
  public static boolean isPos(int c){
    if(c>=0){return true;}
    else{return false;}
  }
  public static void sequence(int d){
    if(isPos(d)){
      for(int i=0;i<=d;i++){
        if(isEven(i)){System.out.print(i+" ");}
      }
    }
    else{
      for(int j=d;j<=-1;j++){
        if(!isEven(j)){System.out.print(j+" ");}
      }
    }
  }
  
}