import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("this program will add all positive number");
        System.out.println("when you enter a negative number it will stop it");
        System.out.println("please enter a number");
        double total = 0.0;
        double number = keyboard.nextDouble();
        while (number >= 0)
        {
            System.out.println("this number will be added");
            total = total + number;
            System.out.println("enter a positive number for sum");
            System.out.println("enter a negative to stop addition");
            number = keyboard.nextDouble();
        }
        System.out.println("your total sum is: " + total);
    }
}
