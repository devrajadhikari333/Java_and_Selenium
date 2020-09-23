package Inheritence;

public class parent {
    private int id=1;
    private int age=60;
    private String name="Father";
    private String address="Nepal";

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public parent() {
        System.out.println("Parent Constructor");
    }
    public void test() {
        System.out.println("Parent Test");
    }
    public String toString() {
        return"Parent{" + "id="+id+ ", age="+age+", name='"+name+ '\'' + ", address='" + address + + '\'' + '}';
    }
}
