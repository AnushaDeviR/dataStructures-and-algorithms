public class StackOverflowRec {
    static void fun1() {
        System.out.println("fun1");
        fun1();
    }

    public static void main(String[] args) {
        fun1();
    }
}

// returns stackoverflow error since it is a non-terminating recursive function