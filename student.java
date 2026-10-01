import java.util.Scanner;
public class student{
double marks1;
double marks2;
double marks3;
double total(){
return marks1+marks2+marks3;
}
double average(){
return total()/3;
}
String grade(){
  if(average()>=80){return "A";}
  else if(average()>=70 && average()<80){return "B";}
  else{return "F";}
}
public static void main(String[] a){
Scanner sc= new Scanner(System.in);
student s=new student();
  s.marks1=sc.nextDouble();
  s.marks2=sc.nextDouble();
  s.marks3=sc.nextDouble();
  System.out.println(s.average());
  System.out.println(s.total());
  System.out.println(s.grade());
}
}