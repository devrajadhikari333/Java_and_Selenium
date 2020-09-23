import java.util.Scanner;

public class loop_for {
    public static void main(String[] args) {
        int num, i, j, count=0;
        System.out.print("Please enter the looping number: ");
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
        for (i = 1; i <= num; i++) {
            count++;
            for (j = 1; j <= i; j++) {
                if (count == 1) {
                    System.out.print("*");
                }
                else if (count == 2) {
                    System.out.print("&");
                }
                else if (count == 3) {
                    System.out.print("%");
                }
                else {
                    count = 1;
                    System.out.print("*");
                }
            }
            System.out.println( );
        }
    }
}
