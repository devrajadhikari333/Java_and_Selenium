package student;

import java.util.Scanner;

public class exception {
    public static void main(String[] args) {
        try {
            int age;
            System.out.println("Enter your age: ");
            Scanner scan = new Scanner(System.in);
            age = scan.nextInt();
            System.out.println("User's age is: " +age);
        } catch (Exception e) {
            System.out.println("Something went wrong. User enter wrong input");
        }
    }
}
