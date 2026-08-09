import java.util.Scanner;
public class disariumNumber {
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter the NUmber: ");
    int n=sc.nextInt();
    int x=n,y=1,sum=0,d=0;;
    while(x!=0){
        x/=10;
        d++;

    }

    x=n;
    while(x!=0){
    y=x%10;
    sum+=Math.pow(y,d);
    x/=10;
    d--;
    }
    if(n==sum){
        System.out.print("This is a disarium number!");

    }
    else{
        System.out.print("This is not a disarium number!");
    }
    }
}
