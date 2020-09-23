package LOOP;

import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        int i, j, num;
        String a= "*";
        System.out.println("Enter the number: ");
        Scanner scan= new Scanner(System.in);
        num = scan.nextInt();
        for (i = 1; i <= num; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(a);
            }
            System.out.println(" ");
        }
    }
}
