public class Task2 {
        public static void main(String[] args) {
            // Перебор аргументов командной строки в цикле for
            for (int i = 0; i < args.length; i++) {
                System.out.println("Аргумент " + (i + 1) + ": " + args[i]);
            }
        }
}
