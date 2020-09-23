public class change_data_type {
    public static void main(String[] args) {
        byte b = 10;
        short s = b;
        System.out.println(s);
        short x = 10;
        byte y = (byte) x;
        System.out.println(y);

        long l = 28000;
        int m = (int) l;
        System.out.println(m);

    }
}
