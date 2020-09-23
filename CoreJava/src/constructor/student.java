package constructor;

public class student {
    public static void main(String[] args) {
        student_Detail s1 = new student_Detail(1, "Devraj", "Irving");
        student_Detail s2 = new student_Detail(2, "Ramesh", "Dallas");
        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}

