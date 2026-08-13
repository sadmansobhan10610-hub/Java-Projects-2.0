import java.util.Scanner;//this will take  your exam umber an a string number then transfrom it into a in and give you a grade.
public class gg6{
  public static void  main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter youtnumber: ");
  String a=sc.nextLine();
  
  int c=0;
  int b=0; 
  int x=0;
 
  for(int i=0;i<a.length();i++){
    c=a.charAt(i);
    int d=c-'0';
    b+=d*Math.pow(10,x);
    x++;
  }
  System.out.println(b);
  if(b>=90 && b<=100){
  System.out.print("A");
  }
  else if(b>=80 && b<90){
  System.out.print("A-");
  }
  else if(b>=70 && b<80){
  System.out.print("B");
  }
  else if(b>=60 && b<70){
  System.out.print("C");
  }
  else if(b>=50 && b<60){
  System.out.print("D");
  }
  else if(b<50 && b>0){
  System.out.print("F");
  }
  else{
  System.out.print("Invalid Mark");
  }
  }
}