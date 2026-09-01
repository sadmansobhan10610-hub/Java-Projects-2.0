import java.util.Scanner;
public class gg32{
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in); 
  System.out.println(reverse_string("Hello", 0));
  }
  public static String reverse_string(String s, int idx){
    if(idx==s.length()-1){
    return ""+s.charAt(s.length()-1);
    }
    else{
    String temp= reverse_string(s,idx+1);
    String n = temp+s.charAt(idx);
    return n;
    }
  }
}