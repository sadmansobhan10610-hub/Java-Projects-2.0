public class Library{
 public int count;
public int boco;
public int cap;
public String[] book;
public Library(int cap){
this.cap=cap;
System.out.println("A library has been created with capacity "+cap);
book = new String[cap];
}
public void addBook(String name){
  if(cap>count){
book[count++]=name;
System.out.println("Book "+name+" added to the library ");
  }
  else{
  System.out.println("Exceeds maximum capacity. You can't add more than "+cap+" books ");
  }
}
public void printDetail(){
System.out.println("Maximum Capacity:"+cap);
System.out.println("Total Books:"+count);
System.out.println("Book list: ");
for(int i=0;i<count;i++){
System.out.println(book[i]);
}

}
}