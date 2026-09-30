import java.util.Scanner;
public class book{
  String title;
  String name;
  int price;
  int pages;
  void printInfo(){
  System.out.println(title+" "+name+" "+price+" "+pages+" ");
  }
  public static void main(String[] args){
  book b1=new book();
  b1.title="Harry Potter";
  b1.name="RDJ";
  b1.price=150;
  b1.pages=254;
  b1.printInfo();
  }
}