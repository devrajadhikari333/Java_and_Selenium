package student;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int total_mark_obtained;
        float percentage;
        int total_mark = 500;
        System.out.println("Please enter your mark for Math: ");
        Scanner scan=new Scanner(System.in);
        int math = scan.nextInt();
        System.out.println("Please enter your mark for Science: ");
        Scanner a=new Scanner(System.in);
        int science = a.nextInt();
        System.out.println("Please enter your mark for Social: ");
        Scanner b=new Scanner(System.in);
        int social = b.nextInt();
        System.out.println("Please enter your mark for Nepali: ");
        Scanner c=new Scanner(System.in);
        int nepali = c.nextInt();
        System.out.println("Please enter your mark for English: ");
        Scanner d=new Scanner(System.in);
        int english = d.nextInt();
        total_mark_obtained = math + science + social + nepali + english ;
        percentage = total_mark_obtained * 100 / total_mark;
        if(percentage >= 60) {
            System.out.println("you have obtained "+percentage+"% and passed with first division");
        }
        else if(percentage >= 45 && percentage < 60) {
            System.out.println("you have obtained "+percentage+"% and passed with Second division");
        }
        else {
            System.out.println("you have obtained "+percentage+"% which is below the average");
        }
     }
}
