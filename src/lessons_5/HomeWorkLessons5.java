package lessons_5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWorkLessons5 {
    public static void main(String[] args) {
        task1BuildArray();
        task2CreateChessboard();
        taskStarSnakeArray(getConsoleNum(), getConsoleNum());
    }
    // создания рандомного числа.
    static int getRandomNum (int minNum, int maxNum) {
        return new Random().nextInt(minNum, maxNum);
    }

    // ввод числа в консоль
    static int getConsoleNum() {
        System.out.print("Please enter a number: ");
        return new Scanner(System.in).nextInt();
    }

    // вывод двумерного массива, overloading
    static void outConsole (int[][] myArray) {
        for (int[] line : myArray) {
            System.out.println(Arrays.toString(line));
        }
    }
    static void outConsole (char[][] myArray) {
        for (int row = 0; row < myArray.length; row++) {
            for (int column = 0; column < myArray[row].length; column++) {
                System.out.print(myArray[row][column] + " ");
            }
            System.out.println();
        }
    }

    // производсвто массива согласно заданию 1.
    static void task1BuildArray() {
        int SumNumArray = getSumNumArray(getArrayAddNumber(getCreateArray(), getConsoleNum()));
    }

    // overloading, подражание ключевому слову this в кострукторе класса
    // создание масива и заполнение рандомными числами тремя способами.
    static int[][] getCreateArray() {
        return getCreateArray(3);
    }
    static int[][] getCreateArray(int lineColumn) {
        return getCreateArray(lineColumn, lineColumn);
    }
    static int[][] getCreateArray(int line, int column) {
        int[][] myArray = new int[line][column];

        for (int counterLine = 0; counterLine < myArray.length; counterLine++) {
            for (int counterColumn = 0; counterColumn < myArray[counterLine].length; counterColumn++) {
                myArray[counterLine][counterColumn] = getRandomNum(0, 101);
            }
        }
        System.out.println("\nCозданный массив: ");
        outConsole(myArray);
        return myArray;
    }

    // добавление числа из консоли к массиву, на входе массив и число.
    static int[][] getArrayAddNumber(int[][] myArray, int addNum) {
        for (int counterLine = 0; counterLine < myArray.length; counterLine++) {
            for (int counterColum = 0; counterColum < myArray[counterLine].length; counterColum++) {
                myArray[counterLine][counterColum] += addNum;
            }
        }
        System.out.println("Adding " + addNum + " to an array value");
        outConsole(myArray);
        return myArray;
    }

    // cумма всех значений массива на входе
    static int getSumNumArray(int[][] myArray) {
        int sumNum = 0;
        for (int counterLine = 0; counterLine < myArray.length; counterLine++) {
            for (int counterColum = 0; counterColum < myArray[counterLine].length; counterColum++) {
                sumNum += myArray[counterLine][counterColum];
            }
        }
        System.out.println("Sum of all array values: " + sumNum);
        return sumNum;
    }

    // создание доски, заполнение "W" на основе четности суммы номера строки и коллонки
    static void task2CreateChessboard() {
        char[][] chessboard = new char[8][8];

        for (int counterLine = 0; counterLine < chessboard.length; counterLine++) {
            for (int counterColum = 0; counterColum < chessboard[counterLine].length; counterColum++) {
                if((counterLine + counterColum) % 2 == 0) {
                    chessboard[counterLine][counterColum] = 'W';
                } else {
                    chessboard[counterLine][counterColum] = 'B';
                }
            }
        }
        System.out.println("------------------chessboard---------------------");
        outConsole(chessboard);
        System.out.println("-------------------------------------------------");
    }

    // создание массива, с заполнением змейкой
    static void taskStarSnakeArray(int rows, int columns) {
        int[][] myArray = new int[rows][columns];
        int snake = 0;
        for (int y = 0; y < myArray.length; y++) {
            // определяем направление чётное = влево
            if(y % 2 == 0){
                for (int x = 0; x < myArray[y].length; x++) {
                    myArray[y][x] = snake++;
                }
            } else {
                for (int x = myArray[y].length - 1; x >= 0 ; x--) {
                    myArray[y][x] = snake++;
                }
            }
        }
        outConsole(myArray);
    }
}
