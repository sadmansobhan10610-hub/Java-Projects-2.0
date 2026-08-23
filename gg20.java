import java.util.Arrays;
import java.util.Scanner;
public class gg20{
  public static void main(String[] args){
  Scanner sc= new Scanner(System.in);
  int[] marks={85,90,75,44,99};
  String[] names= {"Bob", "Alice", "Max", "Marry", "Rosy"};
  int temp=0;
  String nom="";
  for(int i=0;i<marks.length-1;i++){
    for(int j=0;j<marks.length-i-1;j++){
      if(marks[j]>marks[j+1]){
        temp=marks[j];
        nom=names[j];
        marks[j]=marks[j+1];
        names[j]=names[j+1];
        names[j+1]=nom;
        marks[j+1]=temp;
      }
    }
  }
  System.out.println("Sorted Array");
  for(int a=0;a<marks.length;a++){
  System.out.print(marks[a]+" ");
  }
  System.out.println();
  for(int b=0;b<names.length;b++){
  System.out.print( names[b]+" ");
  }

  }
}