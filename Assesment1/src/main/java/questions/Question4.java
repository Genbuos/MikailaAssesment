package questions;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        System.out.println("What is your lucky numeber?");
        Scanner scanner = new Scanner(System.in);
        int luckyNum = scanner.nextInt();

        System.out.println("What is your name?");
        String name = scanner.next();
        scanner.close();

        System.out.println("Your name is " + name + ". And your lucky number is " + luckyNum);







    }
}
