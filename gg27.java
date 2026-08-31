import java.util.Scanner;
public class gg27{
  public static void main(String[] args){
  Scanner sc= new Scanner(System.in);
  int n=sc.nextInt();
  showDiamond(n);
  }
  public static void showDots(int a){
    for(int i=1;i<=a;i++){
  System.out.print(".");
    }
  }
  public static void show_palindrome(int b){
    for(int i=1;i<=b;i++){
    System.out.print(i);
    }
    for(int j=b-1;j>=1;j--){
    System.out.print(j);
    }
  }
  public static void showDiamond(int c){
    int x=c-1;
    for(int i=1;i<=c;i++){
      showDots(x);
      show_palindrome(i);
      showDots(x); 
      System.out.println();
      x--;
    }
    x=1;
    for(int j=c-1;j>=1;j--){
      showDots(x);
      show_palindrome(j);
      showDots(x); 
      System.out.println();
      x++;
    }
  }
}