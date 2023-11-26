public class Task1 {

    int[] array = {1,2,3,4,5};
    int sum = 0;
    public void c1(){
        for (int i = 0; i < array.length -1 ; i++) {
            sum = array[i] + array[i + 1];
        }
        System.out.println(sum);

    }

    public void c2() {
        int i = 0;
        int sum = 0;
        while ( i < array.length - 1) {
            sum = array[i] + array[i+1];
            i++;
        }
        System.out.println(sum);
    }


    public void c3() {
        int sum = 0;
        int i = 0;
        do {
            sum = array[i] + array[i+1];
            i++;
        } while (i < array.length -1);
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Task1 task = new Task1();
        System.out.println("Вывод суммы элементов массива с помощью цикла for");
        task.c1();
        System.out.println("Вывод суммы элементов массива с помощью цикла while");
        task.c2();
        System.out.println("Вывод суммы элементов массива с помощью цикла do while");
        task.c3();

    }
}
