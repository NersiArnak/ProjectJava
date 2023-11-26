package Pr18;
import java.io.Serializable;

// Обобщенный класс MyGenericClass с тремя параметрами типа
public class MyGenericClass<T extends Comparable<T>, V extends Serializable & Animal, K> {
    // Поля класса
    private T variableT;
    private V variableV;
    private K variableK;

    // Конструктор класса, принимающий три параметра разных типов
    public MyGenericClass(T variableT, V variableV, K variableK) {
        this.variableT = variableT;
        this.variableV = variableV;
        this.variableK = variableK;
    }

    // получения значений переменных
    public T getVariableT() {
        return variableT;
    }

    public V getVariableV() {
        return variableV;
    }

    public K getVariableK() {
        return variableK;
    }

    // Метод для вывода имен классов объектов в переменных
    public void printClassNames() {
        System.out.println("Type of T: " + variableT.getClass().getName());
        System.out.println("Type of V: " + variableV.getClass().getName());
        System.out.println("Type of K: " + variableK.getClass().getName());
    }
}


