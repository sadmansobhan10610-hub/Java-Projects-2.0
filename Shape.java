public class Shape{
public String name;
public double redi;
public double high;
public double area;

public void setParameters(String name, int redi){
this.name=name;
this.redi=redi;
area=Math.PI*redi*redi;

}
public void setParameters(String name, int redi, int high){
this.name=name;
this.redi=redi;
this.high=high;
area=0.5*redi*high;

}
public void setParameters(String name, double redi, double high){
this.name=name;
this.redi=redi;
this.high=high;
area=redi*high;

}
public String details(){
  
  String a="Shape Name: "+name+"\nArea: "+area;
  return a;
}


}