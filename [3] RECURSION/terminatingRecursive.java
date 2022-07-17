public class terminatingRecursive {
    static void fun1(int n) {
        if (n == 0) {
            // terminates when input (n) reaches 0
            return; 
        }
        System.out.println("fun1");
        fun1(n - 1);
    }

    public static void main(String[] args) {
        System.out.println("Calling fun1");
        fun1(2);
    }
}
