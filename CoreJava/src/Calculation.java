import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {
        double b, x;
        int flag = 0;
        String command, response, add = "sum", minus = "Sub", multiply = "mul", division = "div";
        System.out.println("Please enter the number to calculate?");
        Scanner scan = new Scanner(System.in);
        x = scan.nextDouble();
        System.out.println("What user want to do?(sum, Sub, mul, div)");
        Scanner a = new Scanner(System.in);
        command = a.nextLine();
        if (command.equalsIgnoreCase(add)) {
            b = addition(x);
            System.out.println("the sum of the numbers are: " + b);
        }
        else if (command.equalsIgnoreCase(minus)) {
            b = minus(x);
            System.out.println("the substraction of numbers are: " + b);
        }
        else if (command.equalsIgnoreCase(multiply)) {
            b = mul(x);
            System.out.println("the Multiplication of numbers are: " + b);
        }
        else if (command.equalsIgnoreCase(division)) {
            b = divi(x);
            System.out.println("the division of numbers are: " + b);
        }
        else {
            System.out.println("User input wrong calculation method.");
        }
        /*System.out.println(" Do user have more calculation to do?");
        Scanner e = new Scanner(System.in);
        response = e.nextLine();
        if(response.equalsIgnoreCase("yes")) {

        }*/
    }

    private static double addition(double z) {
        double y, d;
        System.out.println("Please enter the number user want to sum: ");
        Scanner ad = new Scanner(System.in);
        y = ad.nextDouble();
        d = y + z;
        return d;
    }
    private static double minus(double z) {
        double y, d;
        System.out.println("Please enter the number user want to Substract: ");
        Scanner ad = new Scanner(System.in);
        y = ad.nextDouble();
        d = z - y;
        return d;
    }
    private static double mul(double z) {
        double y, d;
        System.out.println("Please enter the number user want to Multiply: ");
        Scanner ad = new Scanner(System.in);
        y = ad.nextDouble();
        d = z * y;
        return d;
    }
    private static double divi(double z) {
        double y, d;
        System.out.println("Please enter the number user want to divide: ");
        Scanner ad = new Scanner(System.in);
        y = ad.nextDouble();
        d = z / y;
        return d;
    }
}

