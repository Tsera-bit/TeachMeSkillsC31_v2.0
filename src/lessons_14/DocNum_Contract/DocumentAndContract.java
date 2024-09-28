package lessons_14.DocNum_Contract;

import java.io.*;
import java.util.Scanner;

public class DocumentAndContract {
    public static void main(String[] args) {
        verificationDoc(getFileRead());
    }
    // просит ввести адрес файла в консоль, затем проверяет наличие файла, и отдаёт его содержимое на выход метода
    static String[] getFileRead() {
        File file;
        while (true) {
            System.out.print("Введите адрес файла: ");
            file = new File(new Scanner(System.in).nextLine());
            if (file.exists()) {
                if (file.isFile()) {
                    break;
                } else {
                    System.out.println("Это не файл, возможно директория");
                }
            } else {
                System.out.println("Неверный путь не найден файл/директория");
            }
        }
        StringBuilder str = new StringBuilder();
        try (FileReader readDoc = new FileReader(file)) {
            int value;
            while ((value = readDoc.read()) != -1) {
                str.append((char) value);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
        return str.toString().split("\\n+");
    }
    // проверяет массив по строчно на валидность строк и разделяет их по разным файлам
    static void verificationDoc(String[] arrayDocument) {
        StringBuilder validDocument = new StringBuilder();
        StringBuilder invalidDocument = new StringBuilder();

        String documentPattern = "^(docnum[a-zA-Z0-9]{9}|contract[a-zA-Z0-9]{7})$";

        for (String document : arrayDocument) {
            if(document.trim().matches(documentPattern)) {
                validDocument.append(document.trim()).append("\n");
            } else {
                invalidDocument.append(document.trim()).append(getInvalidReason(document.trim())).append("\n");
            }
        }

        setFileWrite(validDocument.toString(), new File("src/lessons_14/DocNum_Contract/validDoc.txt"));
        setFileWrite(invalidDocument.toString(), new File("src/lessons_14/DocNum_Contract/invalidDoc.txt"));
    }
    // Возвращает причину, по которой документ невалиден
    static String getInvalidReason(String document) {
        if (!document.startsWith("docnum") && !document.startsWith("contract")) {
            return " Документ должен начинаться с 'docnum' или 'contract'";
        }
        if (document.length() != 15) {
            return " Длина документа должна быть ровно 15 символов";
        }
        return " Не соответствует формату документа";
    }
    // записываем в указанный файл переданное сообщение
    static void setFileWrite(String message, File file) {
        try(FileWriter write = new FileWriter(file)) {
            write.write(message);
        } catch (IOException e) {
            System.out.println("Error " + e);
        }
    }
}
