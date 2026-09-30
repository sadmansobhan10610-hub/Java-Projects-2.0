import java.util.Scanner;
public class rectangle{
int height;
int width;
int area(){
return height*width;
}
int perimetre(){
return 2*(height+width);
}
boolean isSquare(){
  if(height==width){return true;}
  else{return false;}
}
public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  for(int i=0;i<5;i++){
  rectangle r=new rectangle();
  r.width=sc.nextInt();
  r.height=sc.nextInt();
  System.out.println(r.area()+" "+r.perimetre()+" "+r.isSquare());
  }
}
}