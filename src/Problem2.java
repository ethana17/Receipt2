import java.util.Scanner;
public class Problem2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Player 1, enter your name: ");
        String name1 = scan.nextLine();
        System.out.print("Enter your number: ");
        double num1 = scan.nextDouble();
        scan.nextLine();

        System.out.print("Player 2, enter your name: ");
        String name2 = scan.nextLine();
        System.out.print("Enter your number: ");
        double num2 = scan.nextDouble();
        scan.nextLine();

        if(num1<num2) {
            System.out.print(name2 + "'s number is bigger!");
        } else if (num1>num2) {
            System.out.print(name1 + "'s number is bigger!");
        } else {System.out.print("The numbers are equal!");}
    }
}