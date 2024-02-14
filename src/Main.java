import java.util.Scanner;

public class Main {
    public static void main(String[] args)

    {

        int birthMonth = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter birth month (integers 1-12): ");
        birthMonth = in.nextInt();

        // Fail 1
        if (1 > birthMonth) {
            System.out.println("You entered an incorrect month value: " + birthMonth);
        }

        // Fail 2
        else if (12 < birthMonth) {
            System.out.println("You entered an incorrect month value: " + birthMonth);
        }

        // Success
        else {
            System.out.println("Your birth month is " + birthMonth);
        }

    }
}