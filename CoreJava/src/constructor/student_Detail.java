package constructor;

public class student_Detail {
    int id;
    String name, address;

    public student_Detail(int id, String name, String address ) {
        this.id = id;
        this.name= name;
        this.address = address;
    }
    public String toString(){
        return "Student(" + "id=" + id + ", name='" + name + '\'' + ", address='" + address + '\''+")";
    }
}
