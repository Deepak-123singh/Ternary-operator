import java.util.Scanner;
import java.lang.Math;
class Aarmstromenum
{
    public static void main(String[] args)
    {
        Scanner Sc= new Scanner(System.in);
         System.out.println("enter the number");
        int a= Sc.nextInt();
        System.out.println("enter the number of digites in your number");
        int p= Sc.nextInt();
        int sum=0;
       int num=a;
               while(a!=0)
        {
        int digit=a%10;
         sum +=(int) Math.pow(digit, p);
        a /=10;

        }
        System.out.println("number is given below"); 
         System.out.println(sum);  
        if(num==sum)
        {
            System.out.println("number is Aarmstrong = "+num); 
        }
        else 
        {
            System.out.println("number is not Aarmstrong" ); 
        }
        }

}
       
    
