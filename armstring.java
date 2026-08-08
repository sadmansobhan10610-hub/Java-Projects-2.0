import java.util.Scanner;
public class armstring {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int x=n,count=0,y=0,sum=0;
        while(x!=0){
            x/=10;
            count++;
        }
        x=n;
        while(x!=0){
        y=x%10;
        sum+=Math.pow(y,count);
        x/=10;
        }
        if(n==sum){
            System.out.println("This number is an  Armstong Number!");
        }
        else{
            System.out.println("This number is not an  Armstong Number!");
        }


    }
}
