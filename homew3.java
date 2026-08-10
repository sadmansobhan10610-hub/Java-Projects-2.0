import java.util.Scanner;// replaces the 2nd input letter of the 1st input string with the 3rd input letter
public class homew3{
  public static void  main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the  sentennce: ");
  String s= sc.nextLine();
  System.out.println("Enter the letter you wanna replace: ");
  String r=sc.nextLine();
  System.out.println("Enter the letter you wanna replace with: ");
  String z=sc.nextLine();
  char a=r.charAt(0);
  char b=z.charAt(0);
  String ne = "";
  for(int i=0;i<s.length();i++){
    if(s.charAt(i)==a){
    ne+=b;
    }
    else{
    ne+=s.charAt(i);
    }
  }
  System.out.print(ne);
  }
}