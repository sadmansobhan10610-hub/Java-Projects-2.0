import java.util.Scanner;//this can transform small letter to capital and capital to small
public class homew4{
  public static void  main(String[] args){
  Scanner sc = new Scanner(System.in);
  String s= sc.nextLine();
  String ne="";
  int ascii=0;
  int newascii=0;
  for(int i=0;i<s.length();i++){
    ascii=(int)s.charAt(i);
    if(ascii>=97 && ascii<=122){
    newascii=ascii-32;
    char c=(char)newascii;
    ne+=c;
    }
    else if(ascii>=65 && ascii<=90){
    newascii=ascii+32;
    char c=(char)newascii;
    ne+=c;
    }
    else{
    ne+=s.charAt(i);
    }
  }
  System.out.print(ne);
  
  }
}