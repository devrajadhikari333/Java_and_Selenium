import java.util.Scanner;
public class findCountry {
    public static void main(String[] args) {
        int i, flag=0;
        String name;
        String[] Country = {"Nepal", "USA", "China", "India", "Germany", "UK", "Portugal", "Spain", "Italy", "Bhutan", "Africa", "chad"};
        System.out.print("Please enter the country name: ");
        Scanner scan = new Scanner(System.in);
        name = scan.nextLine();

        for (i = Country.length - 1; i >= 0 ; i--) {
            if (Country[i].equalsIgnoreCase(name)) {
                System.out.println("the location of the element in array is:" + i);
                //System.out.println(Country[i]);
                flag = 1;
                break;
            }
        }
            if (flag == 0) {
                System.out.println("element is not in the array");
            }

    }
}

