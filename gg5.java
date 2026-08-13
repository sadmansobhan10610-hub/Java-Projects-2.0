import java.util.Scanner;//if you input a code with wired summbles like ^,3,@ and _ in it, the program will make it readable. it also increase the letter by 1 and z become a
public class gg5{
  public static void  main(String[] args){
  Scanner sc = new Scanner(System.in);
  String s=sc.nextLine();
  String n="";
  int ascii=0,newascii=0;
  for(int i=0;i<s.length();i++){
  char ch=s.charAt(i);
  ascii=(int)ch;
  if(ch=='^'){
  n+='v';
  }
  else if(ch=='3'){
  n+='e';
  }
  else if(ch=='@'){
  n+='a';
  }
  else if(ch=='_'){
  n+=' ';
  }
  else if(ascii>=97 && ascii<=122){
    if(ascii==122){
    n+='a';
    }
    
    else{
    newascii=ascii+1;
    char b=(char)newascii;
    n+=b;
    }
  }
  }
  System.out.print(n);
  }
}