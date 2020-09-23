package devraj;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Welcome to IT-Sutra");
        System.out.println("Please enter your name");
        Scanner scan=new Scanner(System.in);
        String name=scan.nextLine();
        System.out.println("Please enter the price of your laptop");
        Scanner x=new Scanner(System.in);
        String price=scan.nextLine();
        System.out.println("Please enter the Brand Name");
        Scanner y=new Scanner(System.in);
        String brand_name=scan.nextLine();
        System.out.println(name+" you bought a "+brand_name+" laptop of price "+price);
    }
}
