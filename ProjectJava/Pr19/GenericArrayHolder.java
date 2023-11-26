package Pr19;

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
