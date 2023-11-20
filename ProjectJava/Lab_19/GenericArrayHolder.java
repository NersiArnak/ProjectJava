package Lab_19;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Класс, который хранит в себе массив любых типов данных
class GenericArrayHolder<T> {
    private T[] array;

    GenericArrayHolder(T[] array) {
        this.array = array;
    }

    // Метод для получения элемента массива по индексу
    public T getElementAtIndex(int index) {
        if (index >= 0 && index < array.length) {
            return array[index];
        } else {
            return null;
        }
    }
}
