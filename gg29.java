import java.util.Scanner;
public class gg29{
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in); 
  System.out.print("N: ");
  int N=sc.nextInt();
  oneToN(1,N);
  System.out.println();
  nToOne(1,N);
  System.out.println();
  
  System.out.println(recursiveSum(1,N));
  }
  public static void oneToN(int a, int N){
    
    if(N==a){
    System.out.print(N+" ");
    }
    else{
    oneToN(1,N-1);
    System.out.print(N+" ");
    }
  }
  public static void nToOne(int a, int N){
  
    if(N==a){
    System.out.print(N);
    }
    else{
    System.out.print(N+" ");
    nToOne(1,N-1);
    
    }

}
  public static int recursiveSum (int a,int N){
    
    if(N==a){
     return a;
    }
    else{
    int temp= recursiveSum(a,N-1);
    int sum=N+temp;
    return sum;
    }
  }
}