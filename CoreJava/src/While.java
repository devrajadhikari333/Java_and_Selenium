import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        double a;
        boolean b = true;
        while(b){
            System.out.println("Please enter the number between 10 and 50: ");
            Scanner scan = new Scanner(System.in);
            a = scan.nextDouble();
            if (a>=10 & a<=50) {
                System.out.println("Thank you");
                break;
            }
            else if (a<10) {
                System.out.println("Number is less than 10");
                continue;
            }
            else {
                System.out.println("Number is greater than 50");
                continue;
            }
        }
    }
}
