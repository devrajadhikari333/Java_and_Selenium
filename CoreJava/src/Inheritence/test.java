package Inheritence;

public class test {
    public static void main(String[] args) {
        //parent information
        System.out.println("Parent Info");
        parent p = new parent();
        System.out.println(p.toString());

        //Child Information
        System.out.println("Child Info");
        child c = new child(10);
        c.setId(2);
        c.setAge(17);
        c.setName("Ramesh");
        c.setAddress("USA");
        System.out.println(c.toString());
        c.childTest();
        c.test();

        //if parent is created from child, only parent method can be access
        parent p1= new child(2);
    }
}
