import java.util.Scanner;
public class gg30{
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in); 
  System.out.print("N: ");
  int n=sc.nextInt();
  reverseDigits(n);
  }
  public static void reverseDigits(int d){
    if(d==0){
    System.out.println();
    }
    else{
    System.out.println(d%10);
    reverseDigits(d/10);
    }
    
  }
}