package Polymorphism;

public class test {
public static void main(String[] args) {
    student s1= new student();
    student shyam = new student(13,"Rajesh");
    s1.display(10);
    s1.display(11,"john","Dallas");
    circle c= new circle();
    s1.display(c);
    s1.display(new rectangle());

    //Constructor overloading...
    student ram = new student(12);
    }
}
