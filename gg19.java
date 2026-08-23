import java.util.Scanner;
public class gg19{
  public static void main(String[] args){
  Scanner sc= new Scanner(System.in);
  System.out.print("Please enter the length of Array 1: ");
  int x=sc.nextInt();
  int count=0;
  int[]  num1= new int[x];
  System.out.print("Please enter the elements of the arr1: \n");
  for(int i=0;i<x;i++){
  num1[i]=sc.nextInt();
  }
  System.out.print("Please enter the length of Array 2: ");
  int y=sc.nextInt();
  int[]  num2= new int[y];
  System.out.print("Please enter the elements of the arr2: \n");
  for(int j=0;j<y;j++){
  num2[j]=sc.nextInt();
  for(int k=0;k<x;k++){
    if(num2[j]==num1[k]){
    count++;
    }
  }
  }
  if(count==y){
  System.out.println("Array 2 is a subset of Array 1");
  }
  else{
  System.out.println("Array 2 is not a subset of Array 1");
  }
  

  }
}