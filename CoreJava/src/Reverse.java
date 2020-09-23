import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        String name, reverse;
        int i;
        System.out.print("Please enter your name: ");
        Scanner scan = new Scanner(System.in);
        name = scan.nextLine();
        reverse = "";

        for( i = name.length() -1; i >= 0; i--)
        {
            reverse = reverse + name.charAt(i);
        }

        System.out.println("Reversed of your name is:" +reverse);
    }
}
