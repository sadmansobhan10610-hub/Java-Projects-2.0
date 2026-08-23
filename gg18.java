import java.util.Scanner;
public class gg18{
  public static void main(String[] args){
  Scanner sc= new Scanner(System.in);
  System.out.print("Enter the length of the array: ");
  int x=sc.nextInt();
  double[] num=new double[x];
  double max=num[0],min=num[0],tem=0,sum=0,avg=0;
  int maxin=0,minin=0;
  for(int i=0;i<x;i++){
  System.out.print("Enter a number: ");
  num[i]=sc.nextDouble();
  sum+=num[i];
  if(max<num[i]){
  max=num[i];
  maxin=i;
  }
  if(min>num[i]){
  min=num[i];
  minin=0;
  }
  }
  avg=sum/x;
  System.out.printf("Maximum element %.1f found at index %d \n", max,maxin);
  System.out.printf("Minimum element %.1f found at index %d \n",min,minin);
  System.out.printf("Summation: %.1f\n",sum);
  System.out.printf("Avarage: %.2f\n",avg);
  }
}