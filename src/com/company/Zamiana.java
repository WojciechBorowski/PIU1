package com.company;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Zamiana extends Frame implements ActionListener {
    TextField argument;
    Label wynik;
    Button check;

    public Zamiana() {
        super("Czy liczba jest doskonała");
        setSize(600, 150);
        setLayout(new FlowLayout());
        setBackground(Color.lightGray);
        argument = new TextField(10);
        add(new Label("Liczba"));
        add(argument);
        check = new Button("Sprawdz");
        check.addActionListener(this);
        add(check);
        wynik = new Label(" Podaj liczbe aby otrzymać odpowiedź ");
        add(wynik);
        MenuBar menuBar = new MenuBar();
        setMenuBar(menuBar);
        Menu menu = new Menu("Plik");
        MenuItem mi = new MenuItem("Zamknij", new MenuShortcut('1'));
        menu.add(mi);
        menu.addActionListener(this);
        menuBar.add(menu);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }

    public void actionPerformed(ActionEvent e) {
        String label = e.getActionCommand();
        var task = new Task();
        if (label.equals("Sprawdz")) {
            try {
                int num = Integer.parseInt(argument.getText());
                Boolean ans = task.run(num);
                if (ans.equals(true)) {
                    wynik.setText("Ta liczba jest doskonała!");
                } else {
                    wynik.setText("Ta liczba nie  jest doskonała!");
                }
            } catch (NumberFormatException ev) {
                System.out.println("Błąd argumentów! Wpisz poprawne dane");
            }
        } else if (label.equals("Zamknij")) {
            System.exit(0);
        }
    }
}