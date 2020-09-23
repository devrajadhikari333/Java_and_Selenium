package Polymorphism;

public class student {
    int id;
    String name;
    public student(int id) { this.id = id; }
    public student(String name) { this.name = name;}
    public student (int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("Constructor Student 2");
    }
    public student() {
        System.out.println("Constructor Student 1");
    }
    public void display(circle c) { c.display(); }
    public void display(rectangle r) { r.display(); }
    public void display(int id) {
        System.out.println(id);
    }
    public void display(int id, String name, String address) {
        System.out.println(id +" " +name+" "+ address);
    }
}
