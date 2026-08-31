import java.util.Scanner;
public class gg26{
  public static void main(String[] args){
  Scanner sc= new Scanner(System.in);
  int n=sc.nextInt();
  int result = special_sum(n);
  System.out.println(result);
        }
  public static boolean isPrime(int a){
    int count=0;
    for(int i=1;i<=a;i++){
      if(a%i==0){
      count++;
      }
    }
    if(count==2){
    return true;
    }
    else{
    return false;
    }
    
  }
  public static boolean isPerfect(int b){
    int sum=0;
    for(int i=1;i<b;i++){
      if(b%i==0){
      sum+=i;
      }
  }
    if(sum==b){
    return true;
    }
    else{
    return false;
    }
}
  public static int special_sum(int c){
    int sum=0;
    for(int i=0;i<=8;i++){
      if(isPrime(i) || isPerfect(i)){
      sum+=i;
      }
    }
    return sum;
  }
}