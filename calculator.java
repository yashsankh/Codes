import java.util.Scanner;

class calculator {
    public static void main(String[] args) {
        System.out.println("Enter numbers you are going to input. ");
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        
        String s;
        System.out.printf("Enter the operation which you want starting with capital letter\n");
        Scanner b = new Scanner(System.in);
        s = b.nextLine();
        int total = 0;
        

        switch (s) {

            case "Addition":

                for (int c = 1; c <= d; c++) {

                    System.out.println("Enter " + c + " number ");
                    Scanner ad = new Scanner(System.in);
                    int a = ad.nextInt();
                    total = total + a;
                }
            break;
            case "Division":
                total=1;
                for (int c = 1; c <= d; c++) {
                    
                    System.out.println("Enter " + c + " number ");
                    Scanner ad = new Scanner(System.in);
                    int a = ad.nextInt();
                    total = a / total;
                }
            break;
            case "Multiplication":
                total=1;
                for (int c = 1; c <= d; c++) {
                    
                    System.out.println("Enter " + c + " number ");
                    Scanner ad = new Scanner(System.in);
                    int a = ad.nextInt();
                    total = a * total;
                }
            break;
            case "Subtraction":

                for (int c = 1; c <= d; c++) {
                    
                    System.out.println("Enter " + c + " number ");
                    Scanner ad = new Scanner(System.in);
                    int a = ad.nextInt();
                    total =  total-a;
                }
            break;
            case "Factorial":
                total=1;
                for (int c = d; c >= 1; c--) {
                    
                    total=c*total;
                    
                }
            break;
            default:
                System.out.format("Enter valid operation !");
        }

        System.out.println("Total = " + total);
        
    }
}