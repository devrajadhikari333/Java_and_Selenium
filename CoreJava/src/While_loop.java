import java.util.Scanner;

public class While_loop {
    public static void main(String[] args) {
        String name, response;
        boolean a = true;
        while(a) {
            System.out.println("Please enter your name: ");
            Scanner scan = new Scanner(System.in);
            name = scan.nextLine();
            System.out.println("Hello! "+name+" Nice to meet you");
            System.out.println("Any new members in the team? y or n?");
            Scanner request = new Scanner(System.in);
            response = request.nextLine();
            if(response.equals("Y") || response.equals("y")) {
                continue;
            }
            else if (response.equals("N") || response.equals("n")) {
                System.out.println("Thank you for being here....");
                break;
            }
            else {
                System.out.println("your response is incorrect. Thank you for being here....");
                break;
            }

        }
    }
}
