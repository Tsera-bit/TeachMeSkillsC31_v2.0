package lessons_15;

import java.util.Arrays;

class MyGeneric<T> {
    ;
    private Object[] myArray;
    private int size;

    MyGeneric() {
        myArray = new Object[10];
        size = 0;
    }

    MyGeneric(int arraySize) {
        myArray = new Object[arraySize];
        size = 0;
    }

    @Override
    public String toString() {
        StringBuilder info = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            info.append(myArray[i].toString());
            if(i < size - 1) {
                info.append(", ");
            }
        }
        info.append("]");
        return info.toString();
    }

    // Метод для добавления элементов, с функцией расширения размера
    void add(T data) {
        if (size == myArray.length) {
            int newSizeArray = myArray.length * 2;
            myArray = Arrays.copyOf(myArray, newSizeArray);
        }
        myArray[size++] = data;
    }
    // Метод для удаления по индексу
    void remove(int index) {
        // Костыль т.к. цикл ниже не может покрыть последнее значение
        if (index == size) {
            myArray[index] = null;
            size--;
        } else {
            for (int i = index + 1; i < size; i++) {
                // перемещаем элементы к началу, в результате чего пустая ячейка окажется в конце
                myArray[i - 1] = myArray[i];
                myArray[i] = null;
                size--;
            }
        }
    }
    // Метод для получения элемента по индексу
    T get(int index) {
        if (index > size) {
            System.out.println("Индекс превышает размер массива");
            return null;
        } else {
            return (T) myArray[index];
        }
    }
    // Метод для проверки наличия элемента в массиве
    boolean contains(T element) {
        for (int counter = 0; counter < size; counter++) {
            if (myArray[counter].equals(element)) {
                return true;
            }
        }
        return false;
    }
    // Метод для очистки массива
    void clear() {
        Arrays.fill(myArray, null);
        size = 0;
    }
    // Метод для получения размера массива
    int sizeArray() {
        return size;
    }
}