import java.util.Scanner;
public class gg25{
  public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter any Shape of your Choice:(circle,sphere,square)   ");
  String s= sc.nextLine();
  System.out.println("Enter the redius or the length of the shape: ");
  int z=sc.nextInt();
  area(z,s);
  }
  public static double circle(int a){
  return Math.PI*a*a;
  }
  public static double sphere(int b){
    return (4.0/3)*Math.PI*b*b*b;
  }
  public static double square(int c){
  return c*c;
  }
  public static void area(int r,String q){
    if(q.equals("circle")){
      System.out.println();
      
    System.out.printf("The area of the circle is %.4f", circle(r));
    }
    else if(q.equals("sphere")){
    System.out.println();
    System.out.printf("The area of the sphere is %.4f",sphere(r));
    }
    else if(q.equals("square")){
    System.out.println();
    System.out.printf("The area of the square is %.4f",square(r));
    }
    else{
    System.out.println();
    System.out.print("WTF did you wrote bro!!!???");
    
    }
  }
}