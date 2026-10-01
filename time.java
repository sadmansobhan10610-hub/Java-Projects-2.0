import java.util.Scanner;
public class time{
int hours;
int minutes;

int addminutes(int mi){
  if(minutes+mi>=60){
  hours+=(minutes+mi)/60;
  return minutes=(minutes+mi)%60;
  }
  else{
  return minutes+=mi;
  }
}
void printTime(){
  if(hours/10==0){
  System.out.println(0+""+hours+":"+minutes);
  }
  else{
  System.out.println(hours+":"+minutes);
  }
}
public static void main(String[] a){
Scanner sc=new Scanner(System.in);
time t=new time();
t.hours=sc.nextInt();
t.minutes=sc.nextInt();
System.out.println("Extra time you wanna add??");
int ext=sc.nextInt();
t.addminutes(ext);
t.printTime();
}
}