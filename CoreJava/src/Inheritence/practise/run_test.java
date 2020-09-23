package Inheritence.practise;

public class run_test {
    public static void main(String[] args) {
        //Animal information
        System.out.println("Animal Info");
        animals a = new animals();
        System.out.println(a.toString());

        //Dog Information
        System.out.println("Dog Info");
        dog d = new dog(10);
        d.setName("rambo");
        d.setAge(5);
        System.out.println(d.toString());
    }
}
