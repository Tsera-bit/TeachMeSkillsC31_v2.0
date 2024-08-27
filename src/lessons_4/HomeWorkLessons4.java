package lessons_4;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWorkLessons4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Введите длину массива >0: ");
        int[] numberArray = new int[input.nextInt()];

        for(int i = 0; i < numberArray.length; i++) {

            numberArray[i] = (int) (Math.random() * 101);
        }

        HomeWorkLessons4.getTask1ArrayOutPut(numberArray);
        HomeWorkLessons4.getTask2MaxMin(numberArray);
        HomeWorkLessons4.getTask3IndexMaxMin(numberArray);
        HomeWorkLessons4.getTask4QuantityZero(numberArray);
        HomeWorkLessons4.getTask5SwapNum(numberArray);
        HomeWorkLessons4.getTask6Check(numberArray);
        HomeWorkLessons4.getTaskStarNumber();

        // Ручной ввод массива
        //for (int i = 0; i < numberArray.length; i++){
        //    numberArray[i] = input.nextInt();
        //}
    }

    static void getTask1ArrayOutPut(int[] myArray) {
        System.out.println("по порядку | в обратном порядке");
        for(int counter = 0; counter < myArray.length; counter++) {
            System.out.println(myArray[counter] + " | " + myArray[myArray.length - 1 - counter]);
        }
        System.out.println("----------------------------------------------------------------------------------");
    }

    static void getTask2MaxMin(int[] myArray) {
        int max = myArray[0], min = myArray[0];
        for(int index = 0; index < myArray.length; index++) {
            if(myArray[index] > max) {
                max = myArray[index];
            } if(myArray[index] < min) {
                min = myArray[index];
            }
        }
        System.out.println("Максимальное значение: " + max + "\n" + "Минимальное значение: " + min);
        System.out.println("----------------------------------------------------------------------------------");
    }

    static void getTask3IndexMaxMin(int[] myArray) {
        int maxIndex = 0, minIndex = 0;
        for(int index = 0; index < myArray.length; index++) {
            if(myArray[index] > myArray[maxIndex]) {
                maxIndex = index;
            } if(myArray[index] < myArray[minIndex]) {
                minIndex = index;
            }
        }
        System.out.println("Индекс максимального значения: " + maxIndex + "\n" +
                "Индекс минимального значения: " + minIndex);
        System.out.println("----------------------------------------------------------------------------------");
    }

    static void getTask4QuantityZero(int[] myArray) {
        int quantityZero = 0;
        for(int indexZero = 0; indexZero < myArray.length; indexZero++) {
            if(myArray[indexZero] == 0) {
                quantityZero++;
            }
        }
        if(quantityZero == 0){
            System.out.println("Нулей нету");
        } else {
            System.out.println("Количество нулей: " + quantityZero);
        }
        System.out.println("----------------------------------------------------------------------------------");
    }

    static void getTask5SwapNum(int[] myArray) {
        System.out.println(Arrays.toString(myArray));
        for (int counter = 0, swap; counter < myArray.length / 2; counter++) {
            swap = myArray[counter];
            myArray[counter] = myArray[myArray.length - 1 - counter];
            myArray[myArray.length - counter - 1] = swap;
        }
        System.out.println(Arrays.toString(myArray));
        System.out.println("----------------------------------------------------------------------------------");
    }

    static void getTask6Check(int[] myArray) {
        int check = 0, min = myArray[0];
        for(int num : myArray) {
            if(num < min) {
                check++;
                break;
            }
            min = num;
        }
        if(check == 0){
            System.out.println("Массив с возрастающей последоватьльностью");
        } else {
            System.out.println("Не является Массивом с возрастающей последовательностью");

        }
        System.out.println("----------------------------------------------------------------------------------");
    }

    static void getTaskStarNumber() {
        System.out.print("Укажите длину массива >0: ");
        int[] numArray = new int[new Scanner(System.in).nextInt()];

        for(int counter = 0; counter < numArray.length; counter++) {
            numArray[counter] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(numArray));
        // проверка первого значения массива при 9 создаётся массив длинее,
        // в противном случае новый массив имеет туже длину;
        int addSize = (numArray[0] == 9) ? 1 : 0;
        int[] newNumArray =  new int[numArray.length + addSize];
        // +1 к числу старшего индекса
        newNumArray[newNumArray.length - 1] += 1;

        for (int counter = newNumArray.length - 1; counter >= 0; counter--) {
            // перенос старого массива
            newNumArray[counter] += numArray[counter - addSize];
            // перенос десятой на следующее значение
            if (newNumArray[counter] == 10) {
                newNumArray[counter - 1]++;
                newNumArray[counter] = 0;
            }
        }
        System.out.println(Arrays.toString(newNumArray));
    }
}
