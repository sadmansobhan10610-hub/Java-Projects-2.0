import java.util.Scanner;
public class gg28{
  public static void main(String[] args){
  Scanner sc= new Scanner(System.in);
  calcYearlyTax();

  }
  public static double calcTax(int age,int income){
    double tax=0.0;
    
    if( age>18 && income > 10000 && income <20000){
    tax=income*0.07;
    return tax;
    }
    else if(age>18 && income >20000){
    tax=income*0.14;
    return tax;
    }
    else{
    return 0.0;
    }
    
  }
  public static void calcYearlyTax(){
    double sum=0;
    Scanner sc=new Scanner(System.in);
    int ag=sc.nextInt();
    for(int i=1;i<=12;i++){
    int in=sc.nextInt();
    double t= calcTax(ag,in);
    System.out.printf("Month %d tax: %.1f\n", i,t);
    sum+=t;
    }
    System.out.printf("Total Yearly Tax: %.1f ", sum);
  }
}