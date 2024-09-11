package calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ActionListenerClass implements ActionListener {
    private final JTextField textField;
    String newText;

    ActionListenerClass(JTextField textField) {
        this.textField = textField;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton) e.getSource();
        textField.setText(textField.getText() + btn.getText());
    }

    void setTextField(JButton button) {
        String value = button.getText();
        textField.setText(value);
    }
    // метод на вход получает строку после создаёт два массива один с числами второй со знаками
    static String getResult(String text) {
        String[] numbers = text.split("[-+*/%^ ]");
        String[] signs = text.split("[1234567890. ]+");
        // переделываем строчку в дабл
        double[] nums = new double[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            nums[i] = Double.parseDouble(numbers[i]);
        }
        // передаём методу знак и два числа, приоритеты в разработке проблемы с логикой
        return Double.toString(operation(signs[1], nums[0], nums[1]));

    }
    // выполняем операцию согласно переданному знаку
    static double operation(String sig, double a, double b){
        switch (sig) {
            case "*":
                return a * b;
            case "/":
                return a / b;
            case "+":
                return a + b;
            case "-":
                return a - b;
        }
        return 0;
    }
}
