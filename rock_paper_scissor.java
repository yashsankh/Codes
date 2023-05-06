import java.util.Random;
import java.util.Scanner;

class rock_paper_scissor {

    public static void main(String[] args) {

        int player = 0, computer = 0;
        Random r = new Random();
        int x = r.nextInt(3);


        System.out.printf("\n*************  Welcome to stone paper scissior game  *************\n\n");

        System.out.print("Enter the name \n");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.printf("\nHii.. %s,\nI am computer . \nLets start the game i am ready !!\n\n", name);

        System.out.printf("Enter the no of points limit to win the game \n");
        Scanner point = new Scanner(System.in);
        int points = point.nextInt();
        int c = points;

        System.out.printf("\nInstuction :\n 1.) Enter 0 for paper \n 2.) Enter 1 for scissor \n 3.) Enter 2 for stone\n");
        System.out.printf("\nLet's begin the game !!\n");


        while (c >= 0) {

            System.out.printf("\n*******************************************************\n");
            System.out.print("\nEnter the choice\n\n");
            Scanner z = new Scanner(System.in);
            int y = z.nextInt();
            --c;
            if (y == 0 && x == 2 && y < 3) {

                System.out.printf("Computer choosed %d & %s choosed %d\n", x, name, y);
                System.out.printf("%s wins !!\n", name);
                player++;
                continue;
            } else if (y > x && y < 3) {

                System.out.printf("Computer choosed %d & %s choosed %d\n", x, name, y);
                System.out.printf("%s wins !!\n", name);
                player++;
                continue;
            } else if (y == x && y < 3) {

                System.out.printf("Computer choosed %d & %s choosed %d\n", x, name, y);
                System.out.printf("No points both choose same choice !!\n");
                continue;
            } else if (y > 3) {
                System.out.printf("Please enter valid choice %s\n", name);
                continue;

            } else {
                System.out.printf("Computer choosed %d \n %s choosed %d\n", x, name, y);
                System.out.printf("Computer wins !!\n");
                computer++;
                continue;
            }
        }
        if (player < computer) {
            System.out.printf("\nHard luck next time %s", name);

        } else if (player == computer) {
            System.out.printf("\nOooh my! It's draw %s\n", name);

        } else {
            System.out.printf("\n\nHurray! You have made it %s\n", name);
            System.out.printf("Congralutions !! %s\n", name);
        }
    }
}