import java.util.Scanner;
public class gg17{
  public static void main(String[] args){
  Scanner sc= new Scanner(System.in);
  System.out.print("N= ");
  int x=sc.nextInt();
  int count=0;
  int[] num = new int[x];
  for(int i=0;i<x;i++){
  System.out.print("Enter a number: ");
  int n = sc.nextInt();
  num[i]=n;
  }
  int se=sc.nextInt();
  for(int j=0;j<x;j++){
    if(num[j]==se && count==0){
      System.out.printf("%d is at index %d", se, j);
      count++;
    }
  }
  if(count==0){
  System.out.println("Element not found");
  }
  }
}