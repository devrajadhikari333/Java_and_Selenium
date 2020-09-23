package type_Cast;

public class objectCast {
    public static void main(String[] args) {
        student s1 = new student(1,"john");
        headTeacher headTeacher=new headTeacher(1,"Devraj");
        teacher t1 = new teacher(1,"john");
        headTeacher headTeacher1 = t1;
        teacher t2 = (teacher) headTeacher1;

        Object obj1=new Object();
        obj1=s1;

        s1= (student) obj1;
        System.out.println(s1.toString());
    }
}
