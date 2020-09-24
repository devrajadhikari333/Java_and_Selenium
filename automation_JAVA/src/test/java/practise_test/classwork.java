package practise_test;

public class classwork {
        public static void main(String[] args) {
            int result=run( 5);
            System.out.println(result);
        }
        public static int run(int a)
        {
            if (a < 9) {
                return 9;
            }
            if (a < 7) {
                return 7;
            }
            if (a < 4) {
                return 4;
            }
            return 0;
        }
    }
