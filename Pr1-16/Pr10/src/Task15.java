public class Task15 {
        public static void reverseDigits(int n) {
            if (n < 10) {
                System.out.print(n + " ");
            } else {
                System.out.print(n % 10 + " ");
                reverseDigits(n / 10);
            }
        }

        public static void main(String[] args) {
            int N = 12345;
            reverseDigits(N);
        }

}
