package lessons_14;

import java.io.*;

class LongWordSearchAndDocumentSorting {
    public static void main(String[] args) {
        File RomeoAndJulietta = new File("/home/tser/Book", "Romeo and Julietta (en).txt");
        File OutputFile = new File("LongWord.txt");
        String str = getFileRead(RomeoAndJulietta);
        String longWord = getLongWord(str);
        setFileWrite(longWord, OutputFile);
    }
    // получаем на вход файл и преобразуем в строку с помощью StringBuilder
    static String getFileRead(File file) {
        StringBuilder str = new StringBuilder();
        try(FileReader read = new FileReader(file)) {
            int value;
            while ((value = read.read()) != -1) {
                str.append((char) value);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
        return str.toString();
    }
    // записываем в указанный файл переданное сообщение
    static void setFileWrite(String message, File file) {
        try(FileWriter write = new FileWriter(file)) {
            write.write(message);
        } catch (IOException e) {
            System.out.println("Error " + e);
        }
    }
    // проходим по всему тексту в поисках самого длинного слова и подаём его на выход
    static String getLongWord(String str) {
        String[] arrayStr = str.split("\\s+");
        int value = 0;
        for (int counter = 0; counter < arrayStr.length; counter++) {
            if (arrayStr[counter].length() > arrayStr[value].length()) {
                value = counter;
            }
        }
        return arrayStr[value];
    }
    // образовательная часть для меня
    static void getFileInputStream(File file) {
        try(FileInputStream read = new FileInputStream(file)) {
            int value;
            while((value = read.read()) != -1) {
                System.out.print((char) value);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
    static void setFileOutputStream(String message, File file) {
        if(file.exists()) {
            if(file.isFile()) {
                if(file.canWrite()) {
                    // для добавления нужно добавить параметр true
                    try(FileOutputStream writeMessage = new FileOutputStream(file)) {
                        StringBuilder str = new StringBuilder(message);

                        int counter = 0;

                        while(str.length() > counter) {
                            writeMessage.write(str.charAt(counter++));

                        }
                        writeMessage.flush();
                    } catch (IOException e) {
                        System.out.println("Error: " + e);
                    }
                }
            }
        }
    }
    static void setFileOutputStream2(String message, File file) {
        if(file.exists()) {
            if(file.isFile()) {
                if(file.canWrite()) {
                    try(FileOutputStream writeMessage = new FileOutputStream(file)) {
                        byte[] strArray = message.getBytes();

                        writeMessage.write(strArray);
                    } catch (IOException e) {
                        System.out.println("Error: " + e);
                    }
                }
            }
        }
    }
}
