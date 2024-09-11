package calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Calculator extends JFrame {
    private JTextField textField;

    Calculator() {
        super("Calculator Swing");

        setLayout(new BorderLayout());

        add(setTop(), BorderLayout.NORTH);
        add(setBottom(), BorderLayout.CENTER);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 500);
        setResizable(false);
        setVisible(true);
    }

    JPanel setTop() {
        JPanel top = new JPanel();
        textField = new JTextField("0");
        textField.setEnabled(false);

        top.setLayout(new BorderLayout());
        top.add(textField, BorderLayout.CENTER);
        return top;
    }

    JPanel setBottom() {
        JPanel bottom = new JPanel();
        bottom.setLayout(new GridLayout(5, 4));

        ActionListener click = new ActionListenerClass(textField);

        JButton clear = new JButton("C");
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("0");
            }
        });

        JButton backspace = new JButton("Backs");
        backspace.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textField.getText().length() > 0) {
                    // из существующей строчки забираем строчку без последнего символа
                    textField.setText(textField.getText().substring(0, textField.getText().length() - 1));
                }
            }
        });

        JButton pow = new JButton("^2");
        pow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        JButton minus = new JButton("-");
        minus.addActionListener(click);
        JButton plus = new JButton("+");
        plus.addActionListener(click);
        JButton division = new JButton("/");
        division.addActionListener(click);
        JButton multiply = new JButton("*");
        multiply.addActionListener(click);
        JButton dot = new JButton(".");
        dot.addActionListener(click);
        JButton modus = new JButton("%");
        modus.addActionListener(click);
        JButton equals = new JButton("=");
        // вызывает метод для решения уравнения
        equals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(ActionListenerClass.getResult(textField.getText()));
            }
        });

        bottom.add(clear);
        bottom.add(backspace);
        bottom.add(pow);
        bottom.add(minus);
        bottom.add(plus);
        bottom.add(division);
        bottom.add(multiply);
        bottom.add(dot);
        bottom.add(modus);
        bottom.add(equals);

        for (int counter = 9; counter >= 0 ; counter--) {
            JButton btn = new JButton(String.valueOf(counter));
            btn.addActionListener(click);
            bottom.add(btn);
        }
        return bottom;
    }
}
