package Pr17;

import java.math.BigInteger;
import java.util.Scanner;

public class InnChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Создание объекта Scanner для ввода пользователя
        while(true){
            System.out.println("Введите номер ИНН");
            try{
                BigInteger inn =  new BigInteger(sc.nextLine()); // Чтение введенного значения в виде BigInteger
                checkInn(inn);
                break;
            }catch (InnNotValidException e){
                System.out.println(e.getLocalizedMessage()); // Вывод сообщения об ошибке, если ИНН недействителен
            }
        }
        System.out.println("ИНН действителен!"); // Сообщение о действительном ИНН
    }

    // Метод для проверки валидности ИНН
    public static boolean checkInn(BigInteger inn) throws InnNotValidException{
        int i = 0;
        BigInteger cInn = new BigInteger(inn.toByteArray()); // Создание копии входного ИНН
        while (!cInn.equals(new BigInteger("0"))){
            i++;
            cInn = new BigInteger(cInn.divide(new BigInteger("10")).toByteArray()); // Подсчет количества цифр в ИНН
        }
        // Проверка на допустимость длины ИНН (10 или 12 цифр)
        if(i != 10 && i != 12) throw new InnNotValidException(inn);
        return true; // Возвращение значения true, если ИНН действителен
    }
}

