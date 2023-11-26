public class Exception1 {
    //Итак, этот код демонстрирует, как обработать исключение, которое происходит при попытке деления на ноль.
    public void exceptionDemo() {
        try{
            System.out.println( 2/0 );
        } catch ( ArithmeticException e ) {
            System.out.println("Попытка деления на ноль: ");
        }
    }
}