import java.util.Scanner;
public class gg31{
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in); 
  System.out.print("N: ");
  int n=sc.nextInt();
  int x = sumDigits(n);
  System.out.println(x);

  }
  public static int sumDigits(int d){
    if(d==0){
    return 0;
    }
    else{
    int temp= sumDigits(d/10);
    int sum= temp+d%10;
    return sum;
    }
  }
}