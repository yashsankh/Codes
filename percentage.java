import java.util.Scanner;

class percentage
{
    public static void main(String[] args)
    {   
        int a=0,total=0;
        System.out.println("Enter the marks obtained in 5 subject : ");
        for(int b=1 ; b<=5; b++){

            
            Scanner sc = new Scanner(System.in);
            a=sc.nextInt();
            total=a+total;

        }
        float p=((total/5));//precedence and associativity concepts are used to evaluate maths expression
        
        System.out.println("Percentage obtained = " + p);
        
    }
}