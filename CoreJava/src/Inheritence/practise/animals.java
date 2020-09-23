package Inheritence.practise;

import java.util.Scanner;

public class animals {
        private String name="Murphy";
        private int age= 10;
        /*System.out.print("What is you dog name?");
        Scanner scan = new Scanner(System.in);
        name = scan.nextLine();
        System.out.print("What is you dog age?");
        Scanner a = new Scanner(System.in);
        age = a.nextInt();*/

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public animals() {
        System.out.println("Animal Constructor");
    }

    public String toString() {
        return "Dog{" + "name="+name+ ", age="+age+ "}";
    }
}
