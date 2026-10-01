import java.util.Scanner;
public class temperature{
double celsius;
double toFahrenheit(){
return 8/5*celsius+32;
}
double toKelvin(){
return celsius+273.15;

}
boolean isFreezing(){
  if(celsius<=0){return true;}
  else{return false;}
}
public static void main(String[] a){
Scanner sc=new Scanner(System.in);
temperature t=new temperature();
t.celsius=sc.nextDouble();
System.out.println(t.toFahrenheit());
System.out.println(t.toKelvin());
System.out.println(t.isFreezing());
}

}