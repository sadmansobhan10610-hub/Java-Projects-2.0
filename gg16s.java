import java.util.Scanner;
public class gg16s{
  public static void main(String[] args){
  Scanner sc= new Scanner(System.in);
  System.out.print("N= ");
  int x=sc.nextInt();
  int[] num = new int[x];
  for(int i=0;i<x;i++){
  int n = sc.nextInt();
  num[i]=n;
  }
  System.out.println("Original Array: ");
  for(int a=0;a<x;a++){
  System.out.print(num[a]+" ");
  
  }
 
  for(int j=0;j<x;j++){
    if(num[j]>0){
    num[j]=1;
    }
    else if(num[j]<0){
    num[j]=0;
    }
   
  }
    System.out.println();
  System.out.println("After modifying: ");
   for(int b=0;b<x;b++){
  System.out.print(num[b]+" ");
  
  }
  }
}