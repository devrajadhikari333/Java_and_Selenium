import java.util.Arrays;
public class assignmentArrays {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 50, 40, 70, 5, 25};
        int sum1 = 0;
        int x,y;
        double add, z;
        add = sum(numbers,sum1); //calling addition method (function)
        System.out.println("The sum is = " + add);
        x = max(numbers); //calling maximum method (function)
        System.out.println("Largest number in given array is " +x);
        y= min(numbers); //calling minimum method (function)
        System.out.println("Smallest number in given array is " +y);
        z = avg(numbers,add);
        System.out.println("The average of the given array is: "+z);
        //avg(numbers,add);
    }

    public static int sum(int num[], int a) {
        for (int add : num) {
            a = a + add;
        }
            return a;
    }
    public static int max(int num[]){
        int max = Arrays.stream(num).max().getAsInt();
        return max;
    }
    public static int min(int num[]){
        int mini = Arrays.stream(num).min().getAsInt();
        return mini;
    }
    public static double avg(int num[], double b){
        double average = b / num.length;
        return average;
    }
}
