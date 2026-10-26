public class Shape2D{
  public String name;
  public int side;
  public int high;
  public int redi;
  public double area;
  public  Shape2D(){
  side=5;
  name="Square";
  area=side*side;
  System.out.println("A Square has been created with length: "+side);
  }
  public Shape2D(int side, int high){
  this.side=side;
  this.high=high;
  name="Rectangle";
  area=side*high;
  System.out.println("A Rectangle has been created with length: "+side+" and breath: "+high);
  }
  public  Shape2D(int side, int high, String name){
  this.side=side;
  this.high=high;
  this.name=name;
  area=0.5*side*high;
  System.out.println("A Triangle has been created with height: "+side+" and base: "+high);
  }
  public  Shape2D(int side, int high, int redi){
  this.side=side;
  this.high=high;
  this.redi=redi;
  int total=(side+high+redi)/2;
  int x=(total-side)*(total-high)*(total-redi)*total;
  area=Math.pow(x,0.5);
    System.out.printf("A Triangle has been created with the following sides: %d, %d, %d ",side,high,redi);
  System.out.println();
  }
  public void area(){
  System.out.printf("The area of the Rectangle is: %.02f",area);
   System.out.println();
  }
}